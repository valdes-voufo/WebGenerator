package com.valdes.website;


import com.valdes.website._ast.*;
import com.valdes.website._visitor.WebsiteTraverser;
import com.valdes.website.prettyprinting.WebsiteFullPrettyPrinter;
import com.valdes.website.visitor.CollectNavItemName;
import de.se_rwth.commons.logging.Log;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;



public class GeneratorHelper {
    public static void createPagesFromNavigation(ASTWebsite ast, File output) {
        if (!ast.isPresentNavigation()) {
            Log.info("No Pages was Created ,the Website don't have a Navigation", "Navigation Absent");
        }
        CollectNavItemName collectNavItemName = new CollectNavItemName();
        WebsiteTraverser traverser = WebsiteMill.traverser();
        traverser.add4Website(collectNavItemName);
        ast.accept(traverser);
        collectNavItemName.getNavItemList().forEach(name -> ast.addPage(new ASTPage(name)));

        final WebsiteFullPrettyPrinter printer = new WebsiteFullPrettyPrinter();
        StringBuilder website = new StringBuilder(printer.prettyPrint(ast));
        printFile(website, output);

    }


    public static void printFile(StringBuilder text, File file) {
        try {
            FileUtils.writeStringToFile(file, text.toString(), Charset.defaultCharset());
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

    public static StringBuilder readFile(File file) {
        StringBuilder res = new StringBuilder();
        try {
            res = new StringBuilder(FileUtils.readFileToString(file, Charset.defaultCharset()));
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
        ASTLink l;
        return res;
    }

    public static void copyResources(ASTPage page, Path inputDir, Path outputPath) {
        File dir = Path.of(outputPath + "/resources").toFile();
        assert dir.exists() || dir.mkdirs();

        page.getPageContent().forEachPageContentElements(p -> {
            copyElement(p, inputDir, dir);
            });

    }

    public static void copyElement(ASTPageContentElement p, Path inputDir, File dir){
        if (p.isPicture()) {
            Path input = Path.of(inputDir + "/resources" + "/" + ((ASTPicture) p).getName() + ".png");
            Path output = Path.of(dir + "/" + ((ASTPicture) p).getName() + ".png");
            try {
                Files.copy(input, output, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException exception) {
                Log.error(exception.toString());
            }
        }
        if (p.isCard()) {
            Path input = Path.of(inputDir + "/resources" + "/" + ((ASTCard) p).getPicture() + ".png");
            Path output = Path.of(dir + "/" + ((ASTCard) p).getPicture() + ".png");
            try {
                Files.copy(input, output, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException exception) {
                Log.error(exception.toString());
            }
        }
        if (p.isLandImage()) {
            Path input = Path.of(inputDir + "/resources" + "/" + ((ASTLandImage) p).getPicture() + ".png");
            Path output = Path.of(dir + "/" + ((ASTLandImage) p).getPicture() + ".png");
            try {
                Files.copy(input, output, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException exception) {
                Log.error(exception.toString());
            }
        }
        if(p.isAside()){
            ((ASTAside)p).getSubItemList().forEach(s -> {
                        copyElement(s, inputDir, dir);
                    }
            );
        }
        if(p.isRow()){
            ((ASTRow)p).getPageContentElementList().forEach(s -> {
                        copyElement(s, inputDir, dir);
                    }
            );
        }


    }

    public static void generateEmptyWebsite(ASTWebsite ast, Path outputDir, String websiteName) throws IOException {
        //set the website Name
        ast.setName(websiteName);
        //parse the

        //print the Mosel in the output dir
        WebsiteTool tool = new WebsiteTool();
        Path websiteDir = Path.of(outputDir + "/" + websiteName);
        assert websiteDir.toFile().exists() || websiteDir.toFile().mkdirs();
        tool.prettyPrint(ast, websiteDir + "/");

        Path input = Path.of("src/main/resources/website/models/Empty/pics/Logo.png");
        Path pictureDir = Path.of(outputDir + "/" + websiteName + "/" + "pics");
        assert pictureDir.toFile().exists() || pictureDir.toFile().mkdirs();
        Files.copy(input, Path.of(outputDir + "/" + websiteName + "/pics/Logo.png"), StandardCopyOption.REPLACE_EXISTING);

        WebsiteGenerator.generate(ast, Path.of("src/main/resources/website/models/Empty"), websiteDir);
    }


}
