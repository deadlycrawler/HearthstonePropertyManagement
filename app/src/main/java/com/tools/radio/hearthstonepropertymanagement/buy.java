package com.tools.radio.hearthstonepropertymanagement;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class buy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(103500, "777 bacon DR", "Port vill WY 29297", R.drawable.house_one, 3, 2, 3453));
        words.add(new Word(247578, "666 bacon DR", "Port vill WY 29297", R.drawable.house, 6, 6, 6));


        //takes word objects and desplays them in a list view and casts them to textviews
        WordAdapter adapter = new WordAdapter(this, words, R.color.grey);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}