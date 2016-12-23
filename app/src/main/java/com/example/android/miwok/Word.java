package com.example.android.miwok;

/**
 * Created by saurabh on 12/20/2016.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String DefaultTranslation,String MiwokTranslation){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

}
