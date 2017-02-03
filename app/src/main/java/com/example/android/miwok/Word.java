package com.example.android.miwok;

/**
 * Created by krzysztof on 03.02.2017.
 */

public class Word {

    private String miwokWord = "";
    private String englishWord = "";
    private String spanishWord = "";

    public Word(String miwokWord, String englishWord, String spanishWord) {
        this.miwokWord = miwokWord;
        this.englishWord = englishWord;
        this.spanishWord = spanishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getSpanishWord() {
        return spanishWord;
    }
}
