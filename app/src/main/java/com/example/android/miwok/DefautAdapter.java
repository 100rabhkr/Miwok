package com.example.android.miwok;

import android.app.Activity;
import android.widget.ArrayAdapter;
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

public class DefautAdapter extends ArrayAdapter<DefaultArrayList>  {

    public DefautAdapter(Activity Context, ArrayList<DefaultArrayList> custom){

        super(Context,0,custom);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        DefaultArrayList current = getItem(position);
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        TextView MiwokTextView = (TextView)listItemView.findViewById(R.id.miwokTextView);
        MiwokTextView.setText(current.getmMiwok());

        TextView DefaultTextView = (TextView)listItemView.findViewById(R.id.englishTextView);
        DefaultTextView.setText(current.getmDefault());


        return listItemView;
    }


}

