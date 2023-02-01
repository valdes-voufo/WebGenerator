package com.valdes.website._ast;

public interface ASTPageContentElement  extends  ASTPageContentElementTOP{
   boolean isLink();
    boolean isPicture();
    boolean isTextBlock();
    boolean isCodeBlock();
    boolean isParagraph();
    boolean isAside();
    boolean isCard() ;
    boolean isTable();

    boolean isColumn() ;
    boolean isRow() ;

    boolean isLandImage() ;
}
