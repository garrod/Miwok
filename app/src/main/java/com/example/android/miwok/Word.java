package com.example.android.miwok;

/**
 * Created by krzysztof on 03.02.2017.
 */

public class Word {

    private String miwokWord = "";
    private String englishWord = "";
    private String spanishWord = NO_SPANISH_TRANSLATE;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourcesId;

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final String NO_SPANISH_TRANSLATE= "";

    public Word(String miwokWord, String englishWord, String spanishWord, int audioResourcesId) {
        this.miwokWord = miwokWord;
        this.englishWord = englishWord;
        this.spanishWord = spanishWord;
        mAudioResourcesId = audioResourcesId;
    }

    public Word(String englishWord, String miwokWord, int mImageResourceId, int audioResourcesId) {
        this.mImageResourceId = mImageResourceId;
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        mAudioResourcesId = audioResourcesId;
    }

    public String getMiwokWord() { return miwokWord; }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getSpanishWord() {
        return spanishWord;
    }

    public int getmImageResourceId() { return mImageResourceId; }

    public int getmAudioResourcesId() { return mAudioResourcesId; }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public boolean hasSpanish() {
        return spanishWord!="";
    }
}
