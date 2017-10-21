package com.tools.radio.hearthstonepropertymanagement.Activitys.Rent;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.tools.radio.hearthstonepropertymanagement.R;

import java.util.ArrayList;

public class rent_search extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rent_search);

            //TODO: finish the search page

        //TODO: create getter and setter for word list to throw data to the rent results page(WIP)
        //TODO: have rent.java become the adapter once the data is pushed to it and display the available houses
        //TODO: remove(comment out) View all buttom once the search function works correctly


        //first spinner for house type
        Spinner homeStyleDropdown = (Spinner)findViewById(R.id.houseType);
        Spinner locationDropdown= (Spinner)findViewById(R.id.cityLocation);


        //values for home Style(condo/house) spinner
        final ArrayList<String> homeStyledropdownLIst = new ArrayList<>();
        homeStyledropdownLIst.add(getString(R.string.any));
        homeStyledropdownLIst.add(getString(R.string.house));
        homeStyledropdownLIst.add(getString(R.string.condo));

        ArrayAdapter<String> homeStyleDropDown_Adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, homeStyledropdownLIst);
        homeStyleDropdown.setAdapter(homeStyleDropDown_Adapter);


        //values for citylocationDropdown

        final ArrayList<String> cityLocationDropdownLIst = new ArrayList<>();
        cityLocationDropdownLIst.add(getString(R.string.any));
        cityLocationDropdownLIst.add(getString(R.string.clovis));
        cityLocationDropdownLIst.add(getString(R.string.portales));

        ArrayAdapter<String> locationDropdown_adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, cityLocationDropdownLIst);
        locationDropdown.setAdapter(locationDropdown_adapter);





        // tap to view all properties
        TextView viewAll = (TextView) findViewById(R.id.rentViewAll);

        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(rent_search.this, rent.class);
                startActivity(i);
            }
        });


        //search function

        TextView search = (TextView) findViewById(R.id.rentSearch);

        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


            }

        });



    }
}
