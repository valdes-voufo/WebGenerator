/* (c) https://github.com/MontiCore/monticore */
package com.valdes.website.cocos;



import com.valdes.website._ast.ASTNavigationItem;
import com.valdes.website._cocos.WebsiteASTNavigationItemCoCo;
import de.se_rwth.commons.logging.Log;


public class NavigationItemPageExists implements WebsiteASTNavigationItemCoCo {

    public static final String errorCode = "0xB002";

    public static final String errorMsg = " The navigation item %s must refer to a page";

    @Override
    public void check(ASTNavigationItem node) {
        if (node.getEnclosingScope().resolvePageMany(node.getName()).isEmpty()) {
            Log.error(String.format(errorCode + errorMsg, node.getName()));
        }
    }
}
