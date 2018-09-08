package com.example.android.miwok;

public class Word {


    //Default translation for the word
    private String mDefaultTranslation;

    //Miowk translation for the word
    private String mMiowkTranslation;

    public Word (String defaultTranslation, String miowkTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiowkTranslation = miowkTranslation;

    }

    // get the default translation of the word
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    // get the Miowk translation of the word
    public String getmMiowkTranslation() {
        return mMiowkTranslation;
    }
}
