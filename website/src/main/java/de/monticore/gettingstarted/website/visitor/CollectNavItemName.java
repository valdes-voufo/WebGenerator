package de.monticore.gettingstarted.website.visitor;

import de.monticore.gettingstarted.website._ast.ASTNavigationItem;
import de.monticore.gettingstarted.website._visitor.WebsiteVisitor2;

import java.util.ArrayList;
import java.util.List;

public class CollectNavItemName implements WebsiteVisitor2 {
   protected List<String> navItemList = new ArrayList<>() ;
    @Override
    public void visit(ASTNavigationItem node) {
       navItemList.add(node.getName());
    }

    public List<String> getNavItemList() {
        return navItemList;
    }
}
