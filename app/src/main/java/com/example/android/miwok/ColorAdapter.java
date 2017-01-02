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
 * Created by saurabh on 12/25/2016.
 */

public class ColorAdapter extends ArrayAdapter<color> {
    public ColorAdapter(Activity Context, ArrayList<color> color){

        super(Context,0,color);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        color current = getItem(position);
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        TextView MiwokTextView = (TextView)listItemView.findViewById(R.id.miwokTextView);
        MiwokTextView.setText(current.getmMiwokColor());

        TextView DefaultTextView = (TextView)listItemView.findViewById(R.id.englishTextView);
        DefaultTextView.setText(current.getmDefaultColor());


        return listItemView;
    }


}
