package com.valdes;

import com.valdes.website.WebsiteTool;
import de.se_rwth.commons.logging.Log;
import org.junit.Test;

import java.io.IOException;

public class ToolTest {
    protected static String RELATIVE_MODEL_PATH = "src/test/resources/de/monticore/gettingstarted/website/models";

    public void setup() {
        Log.init();
    }

    @Test
    public void testRWTHCS() {
        WebsiteTool.main(new String[]{"-i", RELATIVE_MODEL_PATH + "/rwthcs/RWTHCS.web",
                "-g", RELATIVE_MODEL_PATH + "/rwthcs", "target/website/"});

    }

   /* @Test

    public void testinit() {
        WebsiteTool.main(new String[]{"-init", "Moodle",
                RELATIVE_MODEL_PATH});

    }
    @Test
    public void testWiki() {
        WebsiteTool.main(new String[]{"-i", RELATIVE_MODEL_PATH + "/wikip3dia/wiki.web",
                "-g", RELATIVE_MODEL_PATH + "/wikip3dia", "target/website/"});

    }*/

    @Test
    public void testSERWTH() throws IOException {
        WebsiteTool.main(new String[]{"-i", RELATIVE_MODEL_PATH + "/serwth/SERWTH.web",
                "-g", RELATIVE_MODEL_PATH + "/serwth", "target/website/"});
    }

    @Test
    public void testDream() {
        WebsiteTool.main(new String[]{"-i", RELATIVE_MODEL_PATH + "/dream/Dream.web",
                "-g", RELATIVE_MODEL_PATH + "/dream", "target/website/"});
    }

    @Test

    public void testSinglePage() {
        WebsiteTool.main(new String[]{"-i", RELATIVE_MODEL_PATH + "/singlepage/SinglePage.web",
                "-g", RELATIVE_MODEL_PATH + "/singlepage", "target/website/"});
    }

}
