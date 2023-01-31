package de.monticore.gettingstarted.website._ast;

import de.monticore.gettingstarted.website.WebsiteGenerator;
import de.se_rwth.commons.logging.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ASTTable extends ASTTableTOP{



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
        return false;
    }

    @Override
    public boolean isTable() {
        return true;
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

    public List<String> getHead(){
        List<List<String>> table = buildTable() ;
        assert table != null;
        return table.get(0);
    }
    public List<List<String>> getContains(){
        List<List<String>> table = buildTable() ;
        assert table != null;
        table.remove(0);
        return table ;

    }

    private List<List<String>> buildTable(){
        List<List<String>> contains  = new ArrayList<>();
        try {
            File myObj = new File(WebsiteGenerator.input + "/resources/" + this.getFileName() + ".csv");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
               contains.add( Arrays.stream(myReader.nextLine().split(";")).collect(Collectors.toList()));
            }
            myReader.close();
        } catch (Exception e) {
            System.err.print(e);
            Log.error("Loading of " + this.getFileName() + " Failed");
            return null;
        }
        return contains ;
    }
}
