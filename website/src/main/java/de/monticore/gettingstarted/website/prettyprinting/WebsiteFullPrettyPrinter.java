/* (c) https://github.com/MontiCore/monticore */
package de.monticore.gettingstarted.website.prettyprinting;

import de.monticore.gettingstarted.website.WebsiteMill;
import de.monticore.gettingstarted.website._ast.ASTWebsite;
import de.monticore.gettingstarted.website._visitor.WebsiteTraverser;
import de.monticore.prettyprint.IndentPrinter;
import de.monticore.prettyprint.MCBasicsPrettyPrinter;

public class WebsiteFullPrettyPrinter {

    protected WebsiteTraverser traverser;

    protected IndentPrinter printer;

    public WebsiteFullPrettyPrinter() {
        this.printer = new IndentPrinter();
        this.traverser = WebsiteMill.traverser();

        MCBasicsPrettyPrinter mcBasics = new MCBasicsPrettyPrinter(printer);
        traverser.add4MCBasics(mcBasics);

        WebsitePrettyPrinter pp = new WebsitePrettyPrinter(printer);
        traverser.setWebsiteHandler(pp);
    }

    public String prettyPrint(ASTWebsite node) {
        node.accept(getTraverser());
        return printer.getContent();
    }

    public WebsiteTraverser getTraverser() {
        return traverser;
    }

    public void setTraverser(WebsiteTraverser traverser) {
        this.traverser = traverser;
    }

    public IndentPrinter getPrinter() {
        return printer;
    }
}
