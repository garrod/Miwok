package com.example.android.miwok;

import java.util.ArrayList;

/**
 * Created by krzysztof on 02.02.2017.
 */

public final class DataSource {

    private static String[] englisWords = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourtheen","fifteen"};
    private static String[] polishWords = {"jeden","dwa","trzy","cztery","pięć","sześć","siedem","osiem","dziewięć","dziesięć","jedenaście","dwanaście","trzynaście","czternaście","piętnaście"};
    private static String[] spanishWords = {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince"};
    //private static ArrayList<Word> words = new ArrayList<Word>();
    //private static ArrayList<String> wordsString = new ArrayList<String>();

    public static ArrayList<Word> getNumberList() {
        return generateTranslateList();
    }

    private static ArrayList<Word> generateTranslateList() {
        ArrayList<Word> words = new ArrayList<Word>();
        for (int i = 0; i< englisWords.length; i++) {
            words.add(new Word(englisWords[i],polishWords[i],spanishWords[i]));
        }
        return words;
    }

    public static ArrayList<String> getGridList() {
        ArrayList<String> wordsString = new ArrayList<String>();
        for (int i = 0; i< englisWords.length; i++) {
            wordsString.add(englisWords[i]);
            wordsString.add(polishWords[i]);
            wordsString.add(spanishWords[i]);
        }
        return wordsString;
    }


}
