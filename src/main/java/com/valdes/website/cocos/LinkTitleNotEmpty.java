/* (c) https://github.com/MontiCore/monticore */
package com.valdes.website.cocos;


import com.valdes.website._ast.ASTLink;
import com.valdes.website._cocos.WebsiteASTLinkCoCo;
import de.se_rwth.commons.logging.Log;


public class LinkTitleNotEmpty implements WebsiteASTLinkCoCo {

    public static final String errorCode = "0xB006";

    public static final String errorMsg = " The link to %s cannot have an empty title";

    @Override
    public void check(ASTLink node) {
        if (node.isPresentTitle() && node.getTitle().isEmpty()) {
            Log.error(String.format(errorCode + errorMsg, node.getName()));
        }
    }
}

