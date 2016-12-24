package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by saurabh on 12/20/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity Context, ArrayList<Word> word){
        super(Context,0, word);

    }

    @NonNull
    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        Word currentPosition = getItem(position);
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        TextView MiwokTextView = (TextView)listItemView.findViewById(R.id.miwokTextView);
        MiwokTextView.setText(currentPosition.getmMiwokTranslation());

        TextView DefaultTextView = (TextView)listItemView.findViewById(R.id.englishTextView);
        DefaultTextView.setText(currentPosition.getmDefaultTranslation());


        return listItemView;
    }
}
