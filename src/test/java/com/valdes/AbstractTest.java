/* (c) https://github.com/MontiCore/monticore */
package com.valdes;

import com.valdes.website.WebsiteMill;
import com.valdes.website._ast.ASTWebsite;
import com.valdes.website._symboltable.WebsiteScopesGenitorDelegator;
import de.se_rwth.commons.logging.Log;
import org.junit.Before;

import java.io.IOException;
import java.util.Optional;

import static org.junit.Assert.assertTrue;

public class AbstractTest {

    @Before
    public void setup() {
        Log.clearFindings();
    }

    public ASTWebsite parse(String model) throws IOException {
        Optional<ASTWebsite> website = WebsiteMill.parser().parse(model);
        assertTrue(website.isPresent());

        WebsiteScopesGenitorDelegator scopesGenitorDelegator = WebsiteMill.scopesGenitorDelegator();
        scopesGenitorDelegator.createFromAST(website.get());
        return website.get();
    }


}