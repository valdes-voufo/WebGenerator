package com.valdes.website._ast;

public class ASTCard  extends  ASTCardTOP{
    @Override
    public boolean isLink() {
        return false;
    }

    @Override
    public boolean isPicture() {
        return false;
    }

    @Override
    public boolean isTextBlock() {
        return false;
    }

    @Override
    public boolean isCodeBlock() {
        return false;
    }

    @Override
    public boolean isParagraph() {
        return false;
    }

    @Override
    public boolean isAside() {
        return false;
    }

    @Override
    public boolean isCard() {
        return true;
    }

    @Override
    public boolean isTable() {
        return false;
    }



    @Override
    public boolean isColumn() {
        return false;
    }

    @Override
    public boolean isRow() {
        return false;
    }

    @Override
    public boolean isLandImage() {
        return false;
    }
}
