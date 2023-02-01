/* (c) https://github.com/MontiCore/monticore */
package com.valdes.website.cocos;


import com.valdes.website._ast.ASTPage;
import com.valdes.website._ast.ASTWebsite;
import com.valdes.website._cocos.WebsiteASTWebsiteCoCo;
import de.se_rwth.commons.logging.Log;


public class ExactlyOneStartPage implements WebsiteASTWebsiteCoCo {

  public static final String errorCode = "0xB003";

  public static final String errorMsg = " There must be exactly one start page";

  @Override
  public void check(ASTWebsite node) {
    if (node.getPageList().stream().filter(ASTPage::isStart).count() != 1) {
      Log.error(errorCode + errorMsg);
    }
  }
}
