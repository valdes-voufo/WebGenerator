/* (c) https://github.com/MontiCore/monticore */
package de.monticore.gettingstarted.website.cocos;


import de.monticore.gettingstarted.website._ast.ASTPage;
import de.monticore.gettingstarted.website._ast.ASTWebsite;
import de.monticore.gettingstarted.website._cocos.WebsiteASTPageCoCo;
import de.monticore.gettingstarted.website._cocos.WebsiteASTWebsiteCoCo;
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
