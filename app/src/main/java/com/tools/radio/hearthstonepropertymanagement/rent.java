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




        //TODO: tap on picture to go to street view
        //TODO: swipe left and right on image to view other images of same location
        //TODO: change snapshot view "beds,baths etc." to a horizontal scrolling view.
        //TODO: combine the address together into a single linear layout to simplify code,
        //TODO: update constructor for House.java to include a lat long
        //TODO: examine ways to include a lat long converter from decimal degrees mins secs to degress decimal to put into google streetView intent
        //TODO: create search menu template for the rent/buy pages, *inProgress*
        //TODO: CREATE SEPERATE results page that narrows results basied of of paramaters entered in the rent search page, recomend posting the same houses constructer but filter it based off results
        //TODO: update word constuctor to include firepalce and garage
        //TODO: add data to SQL database instead so that the resuls are easaly searchable

        final ArrayList<House> houses = new ArrayList<House>();

        //WORD CONSTRUCTOR(price, address line 1, address line 2, main image resource location,beds,baths,sq feet)

        houses.add(new House(1195, "204 W 1st St tower loft", "Portales, NM 88130", R.drawable.house_example_2, 2, 2, 1000));
        houses.add(new House(1295, "1802 W University", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));
        houses.add(new House(1295, "1514 s Ave A", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 1685));
        houses.add(new House(1295, "2108 s Ave G", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));
        houses.add(new House(1395, "1918 S Main", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));
        houses.add(new House(1495, "1101 Libra Drive", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 0));
        houses.add(new House(1495, "1900 Libra Drive", "Portales, NM 88130", R.drawable.house_example_2, 0, 0, 0));
        houses.add(new House(1500, "430 E University", "Portales, NM 88130", R.drawable.house_example_2, 3, 2, 1918));
        houses.add(new House(1650, "308 E 18TH", "Portales, NM 88130", R.drawable.house_example_1, 3, 2, 1820));


        //TODO: loop through immages associated with a house, and add all the immages into the below arraylist
        ArrayList<Integer> houseImageLocations = new ArrayList<>();


        //TODO: take all the immage locations into a single object so that they can be used in the constructer for House.java
        ArrayList<houseImageLocations> houesImages = new ArrayList<>();

        /*TODO insert houseImages arrayList into th HOUSE constructer and change the word addapter  to include the list view and add each immage into it and have the iimages rotate 90 degreese try nesting the below listView into the HouseAdapter*/




        //takes word objects and desplays them in a list view and casts them to textviews
        HouseAdapter adapter = new HouseAdapter(this, houses, R.color.grey);
        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setRotation(-90);
        listView.setAdapter(adapter);



    }

}