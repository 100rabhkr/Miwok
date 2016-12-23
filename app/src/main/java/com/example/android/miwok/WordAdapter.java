package com.example.android.miwok;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by saurabh on 12/20/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
