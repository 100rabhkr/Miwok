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
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        String [] numbers = new String[10];
        String [] Miwok = new String[10];

        numbers[0]= getString(R.string.p0);
        numbers[1]= getString(R.string.p1);
        numbers[2]=getString(R.string.p2);
        numbers[3]=getString(R.string.p3);
        numbers[4]=getString(R.string.p4);
        numbers[5]=getString(R.string.p5);
        numbers[6]=getString(R.string.p6);
        numbers[7]=getString(R.string.p7);
        numbers[8]=getString(R.string.p8);
        numbers[9]=getString(R.string.p9);

        Miwok[0]= getString(R.string.mp1);
        Miwok[1]= getString(R.string.mp2);
        Miwok[2]=getString(R.string.mp3);
        Miwok[3]=getString(R.string.mp4);
        Miwok[4]=getString(R.string.mp5);
        Miwok[5]=getString(R.string.mp6);
        Miwok[6]=getString(R.string.mp7);
        Miwok[7]=getString(R.string.mp8);
        Miwok[8]=getString(R.string.mp9);
        Miwok[9]=getString(R.string.mp10);

        ArrayList<DefaultArrayList> phrasesArray = new ArrayList<>();
        for(int i = 0; i<10; i++ ){
            phrasesArray.add(new DefaultArrayList(numbers[i],Miwok[i]));
        }

        DefautAdapter defautAdapter = new DefautAdapter(this,phrasesArray);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(defautAdapter);

    }
}
