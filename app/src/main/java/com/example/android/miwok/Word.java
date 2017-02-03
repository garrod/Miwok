package com.example.android.miwok;

/**
 * Created by krzysztof on 03.02.2017.
 */

public class Word {

    private String miwokWord = "";
    private String englishWird = "";

    public Word(String miwokWord, String englishWird) {
        this.miwokWord = miwokWord;
        this.englishWird = englishWird;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public String getEnglishWird() {
        return englishWird;
    }
}
