package com.tools.radio.hearthstonepropertymanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class buy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_list);

        final ArrayList<House> houses = new ArrayList<House>();
        //TODO: add a search page for buying houses
        //TODO: think about recyclerView for the images




        //place holder houses
        ArrayList<Images> houseImageLocations = new ArrayList<>();

        houseImageLocations.add(new Images(R.drawable.house_example_1));
        houseImageLocations.add(new Images(R.drawable.house_example_2));

        //place holder data

//WORD CONSTRUCTOR(price, address line 1, address line 2, main image resource location,beds,baths,sq feet,garage,fireplace)
        houses.add(new House(103500, "777 bacon DR", "Port vill WY 29297", houseImageLocations, 3, 2, 3453,true,false));
        houses.add(new House(247578, "666 bacon DR", "Port vill WY 29297", houseImageLocations, 6, 6, 6,false,true));


        //takes word objects and desplays them in a list view and casts them to textviews
        HouseAdapter adapter = new HouseAdapter(this, houses, R.color.grey);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}