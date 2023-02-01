/* (c) https://github.com/MontiCore/monticore */
package com.valdes.website.cocos;


import com.valdes.website._ast.ASTPage;
import com.valdes.website._cocos.WebsiteASTPageCoCo;
import de.se_rwth.commons.logging.Log;


public class PageTitleNotEmpty implements WebsiteASTPageCoCo {

    public static final String errorCode = "0xB008";

    public static final String errorMsg = " The page %s cannot have an empty title";

    @Override
    public void check(ASTPage node) {
            if (node.isPresentTitle() && node.getTitle().isEmpty()) {
                Log.error(String.format(errorCode + errorMsg, node.getName()));
            }

    }
}
