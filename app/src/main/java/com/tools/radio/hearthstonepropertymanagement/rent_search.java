package com.tools.radio.hearthstonepropertymanagement;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class rent_search extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rent_search);

            //TODO: finish the search page

        //first spinner for house type
        Spinner dropdown = (Spinner)findViewById(R.id.houseType);

        final ArrayList<String> dropdownLIst = new ArrayList<>();

        dropdownLIst.add(getString(R.string.any));
        dropdownLIst.add(getString(R.string.house));
        dropdownLIst.add(getString(R.string.condo));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, dropdownLIst);
        dropdown.setAdapter(adapter);


        // tap to view all properties
        TextView viewAll = (TextView) findViewById(R.id.rentViewAll);

        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(rent_search.this, rent.class);
                startActivity(i);
            }
        });



    }
}
