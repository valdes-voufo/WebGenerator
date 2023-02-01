/* (c) https://github.com/MontiCore/monticore */
package com.valdes;



import com.valdes.website.WebsiteMill;
import com.valdes.website._ast.ASTWebsite;
import com.valdes.website._cocos.WebsiteCoCoChecker;
import de.se_rwth.commons.logging.Log;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CoCoTest extends AbstractTest {

     @Before
    public void setup() {
        WebsiteMill.globalScope().clear();
        Log.clearFindings();
        Log.enableFailQuick(false);

    }

    @Test
    public void testSERWTH() throws IOException {
        ASTWebsite website = parse("src/test/resources/de/monticore/gettingstarted/website/valid/SERWTH.web");
        checkValid(website);
    }

    @Test
    public void testDream() throws IOException {
        ASTWebsite website = parse("src/test/resources/de/monticore/gettingstarted/website/valid/Dream.web");
        checkValid(website);
    }

    @Test
    public void testSinglePage() throws IOException {
        ASTWebsite website = parse("src/test/resources/de/monticore/gettingstarted/website/valid/SinglePage.web");
        checkValid(website);
    }

    @Test
    public void testLinkTitleEmpty() throws IOException {
        ASTWebsite website = parse("src/test/resources/de/monticore/gettingstarted/website/invalid/LinkTitleEmpty.web");
       // checkInvalid(website, LinkTitleNotEmpty.errorCode);
    }

    @Test
    public void testMultipleStartPages() throws IOException {
        ASTWebsite website = parse("src/test/resources/de/monticore/gettingstarted/website/invalid/MultipleStartPages.web");
       // checkInvalid(website, ExactlyOneStartPage.errorCode);

    }

    @Test
    public void testNavigationReferencesInaccessiblePage() throws IOException {
        ASTWebsite website = parse("src/test/resources/de/monticore/gettingstarted/website/invalid/NavigationReferencesInaccessiblePage.web");
       // checkInvalid(website, NavigationItemPageExists.errorCode);
    }

    @Test
    public void testPageNameLowerCase() throws IOException {
        ASTWebsite website = parse("src/test/resources/de/monticore/gettingstarted/website/invalid/PageNameLowerCase.web");
      //  checkInvalid(website, PageNameStartUpperCase.errorCode);
    }

    @Test
    public void testPageNameNotUnique() throws IOException {
        ASTWebsite website = parse("src/test/resources/de/monticore/gettingstarted/website/invalid/PageNameNotUnique.web");
      //  checkInvalid(website, PageNameIsUnique.errorCode);
    }

    @Test
    public void testWebsiteNameLowerCase() throws IOException {
        ASTWebsite website = parse("src/test/resources/de/monticore/gettingstarted/website/invalid/WebsiteNameLowerCase.web");
       // checkInvalid(website, WebsiteNameStartUpperCase.errorCode);
    }

    public void checkValid(ASTWebsite node) {
      //  WebsiteCoCoChecker checker = new WebsiteCoCos().createChecker();
       // checker.checkAll(node);
        //assertTrue(Log.getFindings().isEmpty());
    }

    public void checkInvalid(ASTWebsite node, String errorCode) {
     //   WebsiteCoCoChecker checker = new WebsiteCoCos().createChecker();
       // checker.checkAll(node);
        assertFalse(Log.getFindings().isEmpty());
        assertTrue(Log.getFindings().get(0).getMsg().startsWith(errorCode));
    }
}
