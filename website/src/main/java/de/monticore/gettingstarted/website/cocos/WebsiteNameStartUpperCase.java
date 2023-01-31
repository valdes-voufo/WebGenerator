/* (c) https://github.com/MontiCore/monticore */
package de.monticore.gettingstarted.website.cocos;

import de.monticore.gettingstarted.website._ast.ASTWebsite;
import de.monticore.gettingstarted.website._cocos.WebsiteASTWebsiteCoCo;
import de.se_rwth.commons.logging.Log;

public class WebsiteNameStartUpperCase implements WebsiteASTWebsiteCoCo {

    public static final String errorCode = "0xB001";

    public static final String errorMsg = " The name of the website %s must be capitalized";

    @Override
    public void check(ASTWebsite node) {
        if (!Character.isUpperCase(node.getName().charAt(0))) {
            Log.error(String.format(errorCode + errorMsg, node.getName()));
        }
    }
}
