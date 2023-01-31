/* (c) https://github.com/MontiCore/monticore */
package de.monticore.gettingstarted.website;


import de.se_rwth.commons.logging.Log;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class ParseTest extends AbstractTest {
    @Before
    public void setup() {
        Log.init();
    }

    @Test
    public void testSERWTH() throws IOException {
        parse("src/test/resources/de/monticore/gettingstarted/website/valid/SERWTH.web");
    }

    @Test
    public void testDream() throws IOException {
        parse("src/test/resources/de/monticore/gettingstarted/website/valid/Dream.web");
    }

    @Test
    public void testSinglePage() throws IOException {
        parse("src/test/resources/de/monticore/gettingstarted/website/valid/SinglePage.web");
    }

}
