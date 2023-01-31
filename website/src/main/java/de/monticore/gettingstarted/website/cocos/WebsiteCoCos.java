/* (c) https://github.com/MontiCore/monticore */
package de.monticore.gettingstarted.website.cocos;

import de.monticore.gettingstarted.website._cocos.WebsiteCoCoChecker;

public class WebsiteCoCos {

    public WebsiteCoCoChecker createChecker() {
        WebsiteCoCoChecker checker = new WebsiteCoCoChecker();
        checker.addCoCo(new WebsiteNameStartUpperCase());
        checker.addCoCo(new NavigationItemPageExists());
        checker.addCoCo(new ExactlyOneStartPage());
        checker.addCoCo(new PageNameStartUpperCase());
        checker.addCoCo(new PageNameIsUnique());
        checker.addCoCo(new LinkTitleNotEmpty());
        checker.addCoCo(new PageTitleNotEmpty());
        checker.addCoCo(new PictureWidthAndHeightNotNegative());
        return checker;
    }

}
