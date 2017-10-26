package com.tools.radio.hearthstonepropertymanagement.Activitys.rental;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.tools.radio.hearthstonepropertymanagement.RecyclerViewClasses.House;
import com.tools.radio.hearthstonepropertymanagement.RecyclerViewClasses.HouseAdapter;
import com.tools.radio.hearthstonepropertymanagement.RecyclerViewClasses.Images;
import com.tools.radio.hearthstonepropertymanagement.R;

import java.util.ArrayList;

import static com.tools.radio.hearthstonepropertymanagement.R.layout.buy_list;

public class Rentals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(buy_list);

        final ArrayList<House> houses = new ArrayList<House>();
        //TODO: add a search page for buying houses
        //TODO: think about recyclerView for the images


        //place holder houses
        ArrayList<Images> houseImageLocations1 = new ArrayList<>();
        houseImageLocations1.add(new Images(R.drawable.house_example_1));
        houseImageLocations1.add(new Images(R.drawable.house_example_3));
        houseImageLocations1.add(new Images(R.drawable.house_example_2));

        //example placeholder for another house
        ArrayList<Images> houseImageLocations2 = new ArrayList<>();
        houseImageLocations2.add(new Images(R.drawable.house_example_1));
        houseImageLocations2.add(new Images(R.drawable.house_example_2));
        houseImageLocations2.add(new Images(R.drawable.house_example_3));

        //place holder data

//WORD CONSTRUCTOR(price, address line 1, address line 2, main image resource location,beds,baths,sq feet,garage,fireplace)
        houses.add(new House(103500, "777 bacon DR", "Port vill WY 29297", houseImageLocations1, 3, 2, 3453, true, false));
        houses.add(new House(247578, "666 bacon DR", "Port vill WY 29297", houseImageLocations2, 6, 6, 6, false, true));
        houses.add(new House(103500, "777 bacon DR", "Port vill WY 29297", houseImageLocations1, 3, 2, 3453, true, false));
        houses.add(new House(103500, "777 bacon DR", "Port vill WY 29297", houseImageLocations1, 3, 2, 3453, true, false));
        houses.add(new House(103500, "777 bacon DR", "Port vill WY 29297", houseImageLocations1, 3, 2, 3453, true, false));

        //takes word objects and desplays them in a list view and casts them to textviews
        HouseAdapter adapter = new HouseAdapter(this, houses, R.color.grey);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int menuItemThatWasSelected = item.getItemId();
        Context context = Rentals.this;

        switch (menuItemThatWasSelected) {

            case R.id.CallMenuButton:
                Intent i = new Intent(Rentals.this, com.tools.radio.hearthstonepropertymanagement.Activitys.contact.contact.class);
                startActivity(i);
                break;

        }


        return super.onOptionsItemSelected(item);
    }
}