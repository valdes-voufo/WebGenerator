package com.valdes.website;

import com.valdes.website._ast.ASTWebsite;
import com.valdes.website._cocos.WebsiteCoCoChecker;
import com.valdes.website.prettyprinting.WebsiteFullPrettyPrinter;
import de.se_rwth.commons.logging.Log;
import org.apache.commons.cli.*;
import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;



public class WebsiteTool extends WebsiteToolTOP {
    @Override
    public void runDefaultCoCos(ASTWebsite ast) {
        new WebsiteCoCoChecker().checkAll(ast);
    }


    @Override
    public void prettyPrint(ASTWebsite ast, String file) {
        file = file + ast.getName() + ".web";
        WebsiteFullPrettyPrinter pp = new WebsiteFullPrettyPrinter();
        String output = pp.prettyPrint(ast);

        try {
            FileUtils.writeStringToFile(Path.of(file).toFile(), output, Charset.defaultCharset());
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }

    }


    @Override
    public void run(String[] args) {
        init();
        Options options = initOptions();

        options.addOption(Option.builder("g")
                .longOpt("generate")
                .argName("pictureDirectory")
                .argName("outputDirectory")
                .numberOfArgs(2)
                .desc("print the website in the outputDirectory")
                .build());

        options.addOption(Option.builder("init")
                .argName("Name")
                .argName("outputDirectory")
                .numberOfArgs(2)
                .desc("create a empty website")
                .build());

        try {
            // create CLI parser and parse input options from command line
            CommandLineParser cliparser = new DefaultParser();
            CommandLine cmd = cliparser.parse(options, args);

            List<ASTWebsite> inputWebsites = new ArrayList<>();

            if (cmd.getOptionValues("i") != null) {
                for (String inputFileName : cmd.getOptionValues("i")) {
                    ASTWebsite ast = parse(inputFileName);
                    inputWebsites.add(ast);
                }
            }


            // -option pretty print
            if (cmd.hasOption("pp")) {

                if (!(cmd.getOptionValues("pp") == null || cmd.getOptionValues("pp").length == 0)) {
                    int ppArgs = cmd.getOptionValues("pp").length;
                    int iArgs = cmd.getOptionValues("i") == null ? 0 : cmd.getOptionValues("i").length;
                    if (ppArgs != 0 && ppArgs != iArgs) {
                        Log.error(
                                "Number of arguments of -pp (which is "
                                        + ppArgs
                                        + ") must match number of arguments of -i (which is "
                                        + iArgs);
                    }
                    String[] paths = cmd.getOptionValues("pp");
                    int i = 0;
                    for (ASTWebsite compUnit : inputWebsites) {
                        prettyPrint(compUnit, paths[i]);
                        i++;
                    }
                }
            }

            // -option pretty generate
            if (cmd.hasOption("g")) {
                String[] paths = cmd.getOptionValues("g");
                for (ASTWebsite website : inputWebsites) {
                    Path inputDir = Path.of(paths[0]);
                    Path outputDir = Path.of(paths[1]);
                    WebsiteGenerator.generate(website, inputDir, outputDir);
                }
            }

            //// -option pretty generate
            if (cmd.hasOption("init")) {
                String[] paths = cmd.getOptionValues("init");
                String websiteName = paths[0];
                ASTWebsite ast = parse("src/main/resources/website/models/Empty/Empty.web");
                Path outputDir = Path.of(paths[1]);
                GeneratorHelper.generateEmptyWebsite(ast, outputDir, websiteName);
            }


        } catch (ParseException e) {
            // ann unexpected error from the apache CLI parser:
            Log.error("0xA7101 Could not process CLI parameters: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}



