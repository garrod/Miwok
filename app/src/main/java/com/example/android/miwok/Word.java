package com.example.android.miwok;

/**
 * Created by krzysztof on 03.02.2017.
 */

public class Word {

    private String miwokWord = "";
    private String englishWord = "";
    private String spanishWord = NO_SPANISH_TRANSLATE;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final String NO_SPANISH_TRANSLATE= "";

    public Word(String miwokWord, String englishWord, String spanishWord) {
        this.miwokWord = miwokWord;
        this.englishWord = englishWord;
        this.spanishWord = spanishWord;
    }

    public Word(String englishWord, String miwokWord, int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
    }

    public String getMiwokWord() { return miwokWord; }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getSpanishWord() {
        return spanishWord;
    }

    public int getmImageResourceId() { return mImageResourceId; }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public boolean hasSpanish() {
        return spanishWord!="";
    }
}
