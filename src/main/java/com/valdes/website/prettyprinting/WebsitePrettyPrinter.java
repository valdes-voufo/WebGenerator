/* (c) https://github.com/MontiCore/monticore */
package com.valdes.website.prettyprinting;



import com.valdes.website._ast.*;
import com.valdes.website._visitor.WebsiteHandler;
import com.valdes.website._visitor.WebsiteTraverser;
import de.monticore.prettyprint.IndentPrinter;


public class WebsitePrettyPrinter implements WebsiteHandler {

    protected WebsiteTraverser traverser;

    protected IndentPrinter printer;

    public WebsitePrettyPrinter(IndentPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void handle(ASTNavigation node) {
        printer.println("navigation {");
        printer.indent();
        node.forEachNavigationItems(item -> item.accept(traverser));
        printer.unindent();
        printer.println("}");
    }

    @Override
    public void handle(ASTNavigationItem node) {
        if (node.getSubItemList().isEmpty()) {
            printer.println(node.getName() + ";");
        } else {
            printer.println(node.getName() + " {");
            printer.indent();
            node.forEachSubItem(subItem -> subItem.accept(traverser));
            printer.unindent();
            printer.println("}");
            printer.println();
        }
    }

    @Override
    public void handle(ASTPageContent node) {
        printer.println("content {");
        printer.indent();
        printer.println();
        node.getPageContentElementList().forEach(x -> x.accept(traverser));
        printer.unindent();
        printer.println("}");
    }

    @Override
    public void handle(ASTPicture node) {
        printer.println("pic " + node.getName() + " " + node.getWidth().getValue() + " x " + node.getHeight().getValue() + ";");
    }

    @Override
    public void handle(ASTLink node) {
        printer.print("-> " + node.getName());
        if (node.isPresentTitle()) {
            printer.print(" " + node.getTitle());
        }

        printer.println(";");
    }

    @Override
    public void handle(ASTParagraph node) {
        printer.println( "\""+node.getText() +  "\""+";");
    }


    @Override
    public void handle(ASTPage node) {
        if (node.isStart()) {
            printer.print("start ");
        }
        printer.print("page ");

        printer.print(node.getName());

        printer.println(" {");
        printer.indent();

        node.getPageContent().accept(traverser);

        printer.unindent();

        printer.println("}");
        printer.println();
    }


    @Override
    public void handle(ASTWebsite node) {
        printer.print("website ");
        printer.print(node.getName());
        printer.println(" {");

        printer.indent();
        node.getNavigation().accept(traverser);
        node.getPageList().forEach(t -> t.accept(traverser));

        printer.unindent();
        printer.println("}");
    }
//TODO:: add handler for texblock
    @Override
    public WebsiteTraverser getTraverser() {
        return traverser;
    }

    @Override
    public void setTraverser(WebsiteTraverser traverser) {
        this.traverser = traverser;
    }

}
