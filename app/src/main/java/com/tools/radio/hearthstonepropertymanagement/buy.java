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
        //TODO: CREATE INTENT TO GOOGLE MAPS BASED OF TAPING THE ADDRESS OF THE LOCATION


        //place holder houses
        ArrayList<Images> houseImageLocations = new ArrayList<>();

        houseImageLocations.add(new Images(R.drawable.house_example_1));
        houseImageLocations.add(new Images(R.drawable.house_example_2));

        //place holder data

        houses.add(new House(103500, "777 bacon DR", "Port vill WY 29297", houseImageLocations, 3, 2, 3453));
        houses.add(new House(247578, "666 bacon DR", "Port vill WY 29297", houseImageLocations, 6, 6, 6));


        //takes word objects and desplays them in a list view and casts them to textviews
        HouseAdapter adapter = new HouseAdapter(this, houses, R.color.grey);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}