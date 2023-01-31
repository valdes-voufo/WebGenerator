/* (c) https://github.com/MontiCore/monticore */
package de.monticore.gettingstarted.website.cocos;


import de.monticore.gettingstarted.website._ast.ASTPicture;
import de.monticore.gettingstarted.website._cocos.WebsiteASTPictureCoCo;
import de.se_rwth.commons.logging.Log;

public class PictureWidthAndHeightNotNegative implements WebsiteASTPictureCoCo {

    public static final String errorCode = "0xB009";

    public static final String errorMsg = " The picture %s cannot have negative heigth or width";

    @Override
    public void check(ASTPicture node) {
        if (node.getWidth().isNegative() || node.getHeight().isNegative()) {
            Log.error(String.format(errorCode + errorMsg, node.getName()));
        }
    }
}
