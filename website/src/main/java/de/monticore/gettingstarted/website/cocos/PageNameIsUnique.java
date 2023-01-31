/* (c) https://github.com/MontiCore/monticore */
package de.monticore.gettingstarted.website.cocos;


import de.monticore.gettingstarted.website._ast.ASTWebsite;
import de.monticore.gettingstarted.website._cocos.WebsiteASTWebsiteCoCo;
import de.se_rwth.commons.logging.Log;

import java.util.HashSet;
import java.util.Set;

public class PageNameIsUnique implements WebsiteASTWebsiteCoCo {

    public static final String errorCode = "0xB005";

    public static final String errorMsg = " The page name %s is not unique";

    @Override
    public void check(ASTWebsite node) {
        Set<String> pageNames = new HashSet<>() ;
        node.forEachPages(page -> {
            if (pageNames.contains(page.getName())) {
                Log.error( errorCode +String.format( errorMsg, page.getName()));
            }else {
                pageNames.add(page.getName()) ;
            }
        });
    }
}
