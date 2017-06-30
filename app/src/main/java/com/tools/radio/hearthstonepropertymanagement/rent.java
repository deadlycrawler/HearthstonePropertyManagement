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




        //TODO: tap on picture to go to street view
        //TODO: swipe left and right on image to view other images of same location
        //TODO: change snapshot view "beds,baths etc." to a horizontal scrolling view.
        //TODO: combine the address together into a single linear layout to simplify code,
        //TODO: update constructor for Word.java to include a lat long
        //TODO: examine ways to include a lat long converter from decimal degrees mins secs to degress decimal to put into google streetView intent
        //TODO: create search menu template for the rent/buy pages, *inProgress*
        //TODO: CREATE SEPERATE results page that narrows results basied of of paramaters entered in the rent search page, recomend posting the same words constructer but filter it based off results
        //TODO: update word constuctor to include firepalce and garage

        final ArrayList<Word> words = new ArrayList<Word>();

        //WORD CONSTRUCTOR(price, address line 1, address line 2, main image resource location,beds,baths,sq feet)

        words.add(new Word(1195, "204 W 1st St tower loft", "Portales, NM 88130", R.drawable.house_example_2, 2, 2, 1000));
        words.add(new Word(1295, "1802 W University", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));
        words.add(new Word(1295, "1514 s Ave A", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 1685));
        words.add(new Word(1295, "2108 s Ave G", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));
        words.add(new Word(1395, "1918 S Main", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));
        words.add(new Word(1495, "1101 Libra Drive", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));
        words.add(new Word(1495, "1900 Libra Drive", "Portales, NM 88130", R.drawable.house_example_2, 0, 0, 0));
        words.add(new Word(1500, "430 E University", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 1918));
        words.add(new Word(1650, "308 E 18TH", "Portales, NM 88130", R.drawable.house_example_1, 3, 2, 1820));




        //takes word objects and desplays them in a list view and casts them to textviews
        WordAdapter adapter = new WordAdapter(this, words, R.color.grey);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}