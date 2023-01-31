/* (c) https://github.com/MontiCore/monticore */
package de.monticore.gettingstarted.website.cocos;


import de.monticore.gettingstarted.website._ast.ASTLink;
import de.monticore.gettingstarted.website._cocos.WebsiteASTLinkCoCo;
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

