package com.example.android.miwok;

import java.util.ArrayList;

/**
 * Created by krzysztof on 02.02.2017.
 */

public class DataSource {

    private String[] englisWords = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourtheen","fifteen"};
    private String[] polishWords = {"jeden","dwa","trzy","cztery","pięć","sześć","siedem","osiem","dziewięć","dziesięć","jedenaście","dwanaście","trzynaście","czternaście","piętnaście"};
    private String[] spanishWords = {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince"};
    private ArrayList<Word> words = new ArrayList<Word>();
    private ArrayList<String> wordsString = new ArrayList<String>();

    public ArrayList<Word> getNumberList() {
        return generateTranslateList();
    }

    public void setNumberList(ArrayList<Word> numberList) {
        this.words = numberList;
    }

    private ArrayList<Word> generateTranslateList() {
        for (int i = 0; i< englisWords.length; i++) {
            this.words.add(new Word(englisWords[i],polishWords[i],spanishWords[i]));
        }
        return this.words;
    }

    public ArrayList<String> getGridList() {
        for (int i = 0; i< englisWords.length; i++) {
            this.wordsString.add(englisWords[i]);
            this.wordsString.add(polishWords[i]);
            this.wordsString.add(spanishWords[i]);
        }
        return this.wordsString;
    }


}
