/* (c) https://github.com/MontiCore/monticore */
package com.valdes;


import com.valdes.website.WebsiteMill;
import com.valdes.website._ast.ASTPage;
import com.valdes.website._ast.ASTWebsite;
import com.valdes.website._visitor.WebsiteTraverser;
import com.valdes.website._visitor.WebsiteVisitor2;
import de.se_rwth.commons.logging.Log;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class GeneratorTest extends AbstractTest {

    protected static String RELATIVE_MODEL_PATH = "src/test/resources/de/monticore/gettingstarted/website/models";

    public void setup() {
        Log.init();
    }

    @Test
    public void testRWTHCS() throws IOException {
        ASTWebsite ast = parse(RELATIVE_MODEL_PATH + "/rwthcs/RWTHCS.web");
        final Path outputDirectory = Paths.get("target/website/");
        executeGenerator(ast, Path.of(RELATIVE_MODEL_PATH + "/rwthcs"), outputDirectory);

    }

    @Test
    public void testSERWTH() throws IOException {
        ASTWebsite ast = parse(RELATIVE_MODEL_PATH + "/serwth/SERWTH.web");
        final Path outputDirectory = Paths.get("target/website/");
        executeGenerator(ast, Path.of(RELATIVE_MODEL_PATH + "/serwth"), outputDirectory);

    }

    @Test
    public void testDream() throws IOException {
        ASTWebsite ast = parse(RELATIVE_MODEL_PATH + "/dream/Dream.web");
        final Path outputDirectory = Paths.get("target/website/");
        executeGenerator(ast, Path.of(RELATIVE_MODEL_PATH + "/dream"), outputDirectory);

    }

    @Test

    public void testSinglePage() throws IOException {
        ASTWebsite ast = parse(RELATIVE_MODEL_PATH + "/singlepage/SinglePage.web");
        final Path outputDirectory = Paths.get("target/website/");
        executeGenerator(ast, Path.of(RELATIVE_MODEL_PATH + "/singlepage"), outputDirectory);
    }


    public void executeGenerator(ASTWebsite ast, Path inputDir, Path outputDirectory) {
        // TODO comment in the test and fix the AST-imports
        final Path expectedFolder = Paths
                .get(outputDirectory + "/" + ast.getName().toLowerCase());

        //WebsiteGenerator.generate(ast, inputDir, outputDirectory);

        // check that for each page in the model a html file is created within the
        // outputDirectory. Therefore, we can use a visitor.
        WebsiteVisitor2 visitor = new WebsiteVisitor2() {
            public void visit(ASTPage node) {
                File expectedFile = Paths.get(expectedFolder + "/" + node.getName() + ".html").toFile();
                assertTrue(
                        String.format("Expected generated file '%s' to exist", expectedFile.getAbsolutePath()),
                        expectedFile.exists());
            }
        };

        // run the checking visitor
        WebsiteTraverser traverser = WebsiteMill.traverser();
        traverser.add4Website(visitor);
        ast.accept(traverser);

    }
}
