/* (c) https://github.com/MontiCore/monticore */
package de.monticore.gettingstarted.website.cocos;

import de.monticore.gettingstarted.website._ast.ASTPage;
import de.monticore.gettingstarted.website._cocos.WebsiteASTPageCoCo;
import de.se_rwth.commons.logging.Log;

public class PageNameStartUpperCase implements WebsiteASTPageCoCo {

    public static final String errorCode = "0xB004";

    public static final String errorMsg = " The name of the page %s must be capitalized";

    @Override
    public void check(ASTPage node) {
        if (!Character.isUpperCase(node.getName().charAt(0))) {
            Log.error(String.format(errorCode + errorMsg, node.getName()));
        }
    }

}
