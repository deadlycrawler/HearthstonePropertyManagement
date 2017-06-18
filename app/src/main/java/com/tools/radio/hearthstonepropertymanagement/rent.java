package com.tools.radio.hearthstonepropertymanagement;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class rent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rent_list);

        final ArrayList<Word> words = new ArrayList<Word>();


        //TODO: tap on picture to go to street view
        //TODO: swipe left and right on image to view other images of same location
        //TODO: cast price of house from INT to some kinda currency object
        //TODO: change snapsot view "beds,baths etc." to a horizontal scrolling view. `maybe
        //TODO: combine the address together into a single linear layout to simplify code,
        //TODO: update constructor for Word.java to include a lat long
        //TODO: examain ways to include a lat long converter from decimal degrees mins secs to degress decimal to put into google streetView intent
        //TODO: create search menu template for the rent/buy pages


        words.add(new Word(1650, "308 E 18TH", "Portales, NM 88130", R.drawable.house_example_1, 3, 2, 1820));
        words.add(new Word(1295, "2108 s Ave G", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));


        //takes word objects and desplays them in a list view and casts them to textviews
        WordAdapter adapter = new WordAdapter(this, words, R.color.grey);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}