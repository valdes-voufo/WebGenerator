package de.monticore.gettingstarted.website._ast;

public class ASTPage extends ASTPageTOP {
    public ASTPage(String name){
        super();
        this.name = name ;
        this.pageContent = new ASTPageContent();
    }
    public ASTPage(){
        super();
    }

}
