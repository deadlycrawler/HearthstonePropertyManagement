package com.tools.radio.hearthstonepropertymanagement;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

import static java.security.AccessController.getContext;


public class rent extends AppCompatActivity {

//    public static int ImageHeight;
//    public static int ImageWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rent_list);


        //TODO: change snapshot view "beds,baths etc." to a horizontal scrolling view.
        //TODO: combine the address together into a single linear layout to simplify code,
        //TODO: create search menu template for the rent/buy pages, *inProgress*
        //TODO: CREATE SEPERATE results page that narrows results basied of of paramaters entered in the rent search page, recomend posting the same houses constructer but filter it based off results
        //TODO: add data to SQL database instead so that the resuls are easaly searchable, this might be terrible
        //TODO: get access to homeSpot API if they got one, if not ill need to learn how to parse from a website




        final ArrayList<House> houses = new ArrayList<House>();



        //TODO: loop through immages associated with a house, and add all the immages into the below arraylist
        ArrayList<Images> houseImageLocations1 = new ArrayList<>();

        //placeholder
        houseImageLocations1.add(new Images(R.drawable.house_example_1));
        houseImageLocations1.add(new Images(R.drawable.house_example_2));



//        ImageView templateImage = new ImageView(this);
//        templateImage.setImageDrawable(getResources().getDrawable(R.drawable.house_example_1));
//        ImageHeight =  templateImage.getHeight();
//        ImageWidth=  templateImage.getWidth();

        //WORD CONSTRUCTOR(price, address line 1, address line 2, main image resource location,beds,baths,sq feet,garage,fireplace)
        houses.add(new House(1195, "204 W 1st St tower loft", "Portales, NM 88130", houseImageLocations1, 2, 2, 1000,false,false));
//        houses.add(new House(1295, "1802 W University", "Portales, NM 88130",R.drawable.house_example_2, 3, 2, 0));
//        houses.add(new House(1295, "1514 s Ave A", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 1685));
//        houses.add(new House(1295, "2108 s Ave G", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));
//        houses.add(new House(1395, "1918 S Main", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));
//        houses.add(new House(1495, "1101 Libra Drive", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));
//        houses.add(new House(1495, "1900 Libra Drive", "Portales, NM 88130", R.drawable.house_example_2, 0, 0, 0));
//        houses.add(new House(1500, "430 E University", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 1918));
//        houses.add(new House(1650, "308 E 18TH", "Portales, NM 88130", R.drawable.house_example_1, 3, 2, 1820));


        //takes word objects and desplays them in a list view and casts them to textviews
        HouseAdapter adapter = new HouseAdapter(this, houses, R.color.grey);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }

}