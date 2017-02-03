package com.example.android.miwok;

import java.util.ArrayList;

/**
 * Created by krzysztof on 02.02.2017.
 */

public class DataSource {

    private String[] englisWords = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourtheen","fifteen"};
    private String[] polishWords = {"jeden","dwa","trzy","cztery","pięć","sześć","siedem","osiem","dziewięć","dziesięć","jedenaście","dwanaście","trzynaście","czternaście","piętnaście"};
    private ArrayList<Word> numberList = new ArrayList<Word>();

    public ArrayList<Word> getNumberList() {
        return generateList();
    }

    public void setNumberList(ArrayList<Word> numberList) {
        this.numberList = numberList;
    }

    private ArrayList<Word> generateList() {
        for (int i = 0; i< englisWords.length; i++) {
            numberList.add(new Word(englisWords[i],polishWords[i]));
        }
        return numberList;
    }


}
