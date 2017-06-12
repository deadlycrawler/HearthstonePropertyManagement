package com.tools.radio.hearthstonepropertymanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class rent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rent_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        //TODO: CREATE INTENT TO GOOGLE MAPS BASED OF TAPING THE ADDRESS OF THE LOCATION
        //TODO: tap on picture to go to street view
        //TODO: swipe left and right on immage to view other immages of same location
        //TODO: cast price of house from INT to some kinda currancy object
        //TODO: add correction for square feet if its unlisted
        //TODO: change snapsot view "beds,baths etc." to a horizontal scrolling view. `maybe

        words.add(new Word(1650, "308 E 18TH", "Portales, NM 88130", R.drawable.house_example_1, 3, 2, 1820));
        words.add(new Word(1295, "2108 s Ave G", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));


        //takes word objects and desplays them in a list view and casts them to textviews
        WordAdapter adapter = new WordAdapter(this, words, R.color.grey);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}