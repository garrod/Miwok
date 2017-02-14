package com.example.android.miwok;

import java.util.ArrayList;

/**
 * Created by krzysztof on 02.02.2017.
 */

public final class DataSource {

    private static String[] englishWords = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourtheen","fifteen"};
    private static String[] polishWords = {"jeden","dwa","trzy","cztery","pięć","sześć","siedem","osiem","dziewięć","dziesięć","jedenaście","dwanaście","trzynaście","czternaście","piętnaście"};
    private static String[] spanishWords = {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince"};

    private static String[] englishColors = {"black","brown","yellow","gray","green","mustard_yellow","red","white"};
    private static String[] polishColors = {"czarny","brązowy","żółty","szary","zielony","musztardowy","czerwony","biały"};

    private static String[] englishFamily = {"daughter","father","grandfather","grandmother","mother","brother","sister","son","younger brother","younger sister"};
    private static String[] polishFamily = {"córka","tata","dziadek","babcia","mama","brat","siostra","syn","młodszy brat","młodsza siostra"};

    private static int[] numberImages = {
            R.drawable.number_one,
            R.drawable.number_two,
            R.drawable.number_three,
            R.drawable.number_four,
            R.drawable.number_five,
            R.drawable.number_six,
            R.drawable.number_seven,
            R.drawable.number_eight,
            R.drawable.number_nine,
            R.drawable.number_ten,
            R.drawable.number_one,
            R.drawable.number_two,
            R.drawable.number_three,
            R.drawable.number_four,
            R.drawable.number_five
    };
    private static int[] numberSounds = {
            R.raw.number_one,
            R.raw.number_two,
            R.raw.number_three,
            R.raw.number_four,
            R.raw.number_five,
            R.raw.number_six,
            R.raw.number_seven,
            R.raw.number_eight,
            R.raw.number_nine,
            R.raw.number_ten,
            R.raw.number_one,
            R.raw.number_two,
            R.raw.number_three,
            R.raw.number_four,
            R.raw.number_five
    };
    private static int[] colorImages = {
            R.drawable.color_black,
            R.drawable.color_brown,
            R.drawable.color_dusty_yellow,
            R.drawable.color_gray,
            R.drawable.color_green,
            R.drawable.color_mustard_yellow,
            R.drawable.color_red,
            R.drawable.color_white,
            R.drawable.color_black,
            R.drawable.color_brown,
            R.drawable.color_dusty_yellow,
            R.drawable.color_gray,
            R.drawable.color_green,
            R.drawable.color_mustard_yellow,
            R.drawable.color_red
    };
    private static int[] colorSounds = {
            R.raw.color_black,
            R.raw.color_brown,
            R.raw.color_dusty_yellow,
            R.raw.color_gray,
            R.raw.color_green,
            R.raw.color_mustard_yellow,
            R.raw.color_red,
            R.raw.color_white
    };
    private static int[] familyImages= {
            R.drawable.family_daughter,
            R.drawable.family_father,
            R.drawable.family_grandfather,
            R.drawable.family_grandmother,
            R.drawable.family_mother,
            R.drawable.family_older_brother,
            R.drawable.family_older_sister,
            R.drawable.family_son,
            R.drawable.family_younger_brother,
            R.drawable.family_younger_sister,
            R.drawable.family_daughter,
            R.drawable.family_father,
            R.drawable.family_grandfather,
            R.drawable.family_grandmother,
            R.drawable.family_mother,
            R.drawable.family_older_brother,
            R.drawable.family_older_sister,
            R.drawable.family_son,
            R.drawable.family_younger_brother,
            R.drawable.family_younger_sister
    };
    private static int familySounds[] = {
            R.raw.family_daughter,
            R.raw.family_father,
            R.raw.family_grandfather,
            R.raw.family_grandmother,
            R.raw.family_mother,
            R.raw.family_older_brother,
            R.raw.family_older_sister,
            R.raw.family_son,
            R.raw.family_younger_brother,
            R.raw.family_younger_sister
    };

    public static ArrayList<String> getGridList() {
        final ArrayList<String> wordsString = new ArrayList<String>();
        for (int i = 0; i< englishWords.length; i++) {
            wordsString.add(englishWords[i]);
            wordsString.add(polishWords[i]);
            wordsString.add(spanishWords[i]);
        }
        return wordsString;
    }

    public static ArrayList<Word> getPhrasesList() {
        ArrayList<Word> words = new ArrayList<Word>();
        for (int i = 0; i< englishWords.length; i++) {
            words.add(new Word(englishWords[i],polishWords[i],spanishWords[i],numberImages[i]));
        }
        return words;
    }

    public static ArrayList<Word> getNumberList() {
        ArrayList<Word> words = new ArrayList<Word>();
        for (int i = 0; i< englishWords.length; i++) {
            words.add(new Word(englishWords[i],polishWords[i],numberImages[i],numberSounds[i]));
        }
        return words;
    }

    public static ArrayList<Word> getColorList() {
        final ArrayList<Word> words = new ArrayList<Word>();
        for (int i = 0; i< englishColors.length; i++) {
            words.add(new Word(englishColors[i],polishColors[i],colorImages[i],colorSounds[i]));
        }
        return words;
    }

    public static ArrayList<Word> getFamilyList() {
        final ArrayList<Word> words = new ArrayList<Word>();
        for (int i = 0; i< englishFamily.length; i++) {
            words.add(new Word(englishFamily[i],polishFamily[i],familyImages[i],familySounds[i]));
        }
        return words;
    }




}
