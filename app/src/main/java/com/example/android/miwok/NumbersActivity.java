/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String [] numbers = new String[10];
        String [] Miwok = new String[10];

        numbers[0]= getString(R.string.s0);
        numbers[1]= getString(R.string.s1);
        numbers[2]=getString(R.string.s2);
        numbers[3]=getString(R.string.s3);
        numbers[4]=getString(R.string.s4);
        numbers[5]=getString(R.string.s5);
        numbers[6]=getString(R.string.s6);
        numbers[7]=getString(R.string.s7);
        numbers[8]=getString(R.string.s8);
        numbers[9]=getString(R.string.s9);

        Miwok[0]= "lutti";
        Miwok[1]= getString(R.string.s1);
        Miwok[2]=getString(R.string.s2);
        Miwok[3]=getString(R.string.s3);
        Miwok[4]=getString(R.string.s4);
        Miwok[5]=getString(R.string.s5);
        Miwok[6]=getString(R.string.s6);
        Miwok[7]=getString(R.string.s7);
        Miwok[8]=getString(R.string.s8);
        Miwok[9]=getString(R.string.s9);

        ArrayList<Word> numbersArray = new ArrayList<Word>();
        //      LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        //ArrayList<TextView> wordView = new ArrayList<TextView>();

        for(int i = 0; i<10; i++ ){
            numbersArray.add(new Word(numbers[i],Miwok[i]));
        }

        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, numbersArray);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);





    }
}
