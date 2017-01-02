package com.example.android.miwok;

/**
 * Created by saurabh on 12/25/2016.
 */

public class color {
    private String mMiwokColor;
    private String mDefaultColor;


    public color(String DefaultColor,String MiwokColor){
        mDefaultColor = DefaultColor;
        mMiwokColor = MiwokColor;
    }

    public String getmMiwokColor(){
        return mMiwokColor;
    }

    public String getmDefaultColor(){
        return mDefaultColor;
    }

}
