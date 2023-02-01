package com.valdes.website.visitor;




import com.valdes.website._ast.ASTNavigationItem;
import com.valdes.website._visitor.WebsiteVisitor2;

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
