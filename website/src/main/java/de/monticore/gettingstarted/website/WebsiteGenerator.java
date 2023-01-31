/* (c) https://github.com/MontiCore/monticore */
package de.monticore.gettingstarted.website;

import de.monticore.generating.GeneratorEngine;
import de.monticore.generating.GeneratorSetup;
import de.monticore.gettingstarted.website._ast.ASTLandImage;
import de.monticore.gettingstarted.website._ast.ASTPage;
import de.monticore.gettingstarted.website._ast.ASTWebsite;
import de.se_rwth.commons.logging.Log;

import java.io.File;
import java.nio.file.Path;

import static de.monticore.gettingstarted.website.GeneratorHelper.printFile;
import static de.monticore.gettingstarted.website.GeneratorHelper.readFile;

public class WebsiteGenerator {
public static String input ;
    private final static String LOGGER_NAME = WebsiteGenerator.class.getName();

    private final static Path RELATIVE_TEMPLATE_PATH = Path.of("src/main/resources/website");


    /**
     * Generates the website in ouputDirectory using the ast.
     *
     * @param ast             the ast to generate the website for.
     * @param outputDirectory the direectory to generate the website in.
     */
    public static void generate(ASTWebsite ast, Path inputDir, Path outputDirectory) {
        GeneratorEngine generator = createGeneratorEngine(outputDirectory.toFile());
        String websiteName = ast.getName();
        File outputPath = Path.of(outputDirectory + "/" + websiteName.toLowerCase()).toFile();
        //try each page
        for (ASTPage page : ast.getPageList()) {
            generatePage(generator, "website/Page.ftl", page, ast, inputDir, outputPath);
        }

        Log.trace(LOGGER_NAME, "Generated website " + websiteName + " in folder" + outputDirectory);


    }


    private static void generatePage(GeneratorEngine generator, String templateName, ASTPage page, ASTWebsite website, Path inputDir, File outputPath) {
        input = inputDir.toString();
        StringBuilder pageCss = new StringBuilder();
        // add a default css for the header
        File header = Path.of(RELATIVE_TEMPLATE_PATH + "/header/header2/header2.css").toFile();
        pageCss.append(readFile(header));

        //add the default css for the main
        File main = Path.of(RELATIVE_TEMPLATE_PATH + "/page.css").toFile();
        pageCss.append(readFile(main));

        //add the default css for the footer
        File head = Path.of(RELATIVE_TEMPLATE_PATH + "/footer/footer1/footer1.css").toFile();
        pageCss.append(readFile(head));

        //generate the page
        StringBuilder pageHtml = generator.generate(templateName, page, website);
        File fileHtml = Path.of(outputPath + "/" + page.getName() + ".html").toFile();
        File fileCss = Path.of(outputPath + "/" + page.getName() + ".css").toFile();

        //print the html && css
        printFile(pageCss, fileCss);
        printFile(pageHtml, fileHtml);


        //move Resources
        GeneratorHelper.copyResources(page, inputDir, outputPath.toPath());
    }


    private static GeneratorEngine createGeneratorEngine(File outputDirectory) {
        final GeneratorSetup setup = new GeneratorSetup();
        setup.setOutputDirectory(outputDirectory);
        setup.setCommentStart("<!--");
        setup.setCommentEnd("-->");
        return new GeneratorEngine(setup);
    }

}
