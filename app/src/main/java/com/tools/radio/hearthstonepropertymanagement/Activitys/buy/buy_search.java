package com.tools.radio.hearthstonepropertymanagement.Activitys.buy;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.tools.radio.hearthstonepropertymanagement.R;

import java.util.ArrayList;

public class buy_search extends AppCompatActivity {

    Spinner homeStyleDropdown;
    EditText cityOrZip;
    EditText minPrice;
    EditText MaxPrice;
    CheckBox garage;
    CheckBox Fireplace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_search);

        //TODO: finish the search page



        //TODO: remove(comment out) View all buttom once the search function works correctly
        //TODO: emulate the search page on website


        //first spinner for house type
        homeStyleDropdown = (Spinner) findViewById(R.id.houseType);
        cityOrZip = (EditText) findViewById(R.id.cityOrZip);
        garage = (CheckBox) findViewById(R.id.GarageCheckBox);
        Fireplace = (CheckBox) findViewById(R.id.FireplaceCheckBox);


        //values for home Style(condo/house) spinner
        final ArrayList<String> homeStyledropdownLIst = new ArrayList<>();
        homeStyledropdownLIst.add(getString(R.string.any));
        homeStyledropdownLIst.add(getString(R.string.house));
        homeStyledropdownLIst.add(getString(R.string.condo));

        ArrayAdapter<String> homeStyleDropDown_Adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, homeStyledropdownLIst);
        homeStyleDropdown.setAdapter(homeStyleDropDown_Adapter);


        //search function

        TextView search = (TextView) findViewById(R.id.rentSearch);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = UriBuilder();
                if (url == "") {

                } else {
                    UrlIntent(url);
                }

            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int menuItemThatWasSelected = item.getItemId();
        Context context = buy_search.this;

        switch (menuItemThatWasSelected) {

            case R.id.CallMenuButton:
                Intent i = new Intent(buy_search.this, com.tools.radio.hearthstonepropertymanagement.Activitys.contact.contact.class);
                startActivity(i);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void UrlIntent(String url) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }

    public String UriBuilder() {

        String cityOrZip = "";
        String houseType;
        String FireplaceEnabled = "";
        String GarageEnabled = "";
        String zipInsert = "";
        String cityInsert = "";
        String url = "";

        houseType = this.homeStyleDropdown.getSelectedItem().toString();
        try {
            cityOrZip = this.cityOrZip.getText().toString();
            cityOrZip=cityOrZip.toUpperCase();
            if (ZipChecker(cityOrZip)) {
                zipInsert = "zip%5B%5D=" + cityOrZip;
            } else {
                if (cityID(cityOrZip) == "city is bad to the bone") {
                    MakeToast("check city/zip block");
                    return url;
                } else {
                    cityInsert = "cityId[]=" + cityID(cityOrZip);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this,"check city/zip block for errors",Toast.LENGTH_LONG).show();
            return url;
        }


        if (Fireplace.isChecked()) {
            FireplaceEnabled = "fireplaceYn=true&";
        }
        if (garage.isChecked()) {
            GarageEnabled = "garYn=true&";
        }

        url = "http://hearthstonepropertymgt.com/homes-for-sale-results/?boardId=261&" + zipInsert + cityInsert + "&location=&propertyType=SFR%2CCND&minListPrice=&maxListPrice=&bedrooms=0&bathCount=0&_openHomesOnlyYn=on&_dateRange=on&" + FireplaceEnabled + "_fireplaceYn=on&" + GarageEnabled + "_garYn=on&yearBuilt=&styleLike%5B%5D=&_areaAndSearch=on";
        return url;

    }

    public boolean ZipChecker(String cityOrZip) {
        if (cityOrZip.length() != 5) {
            return false;
        } else {
            char firstLetter = cityOrZip.charAt(0);
            if (Character.isDigit(firstLetter)) {

                return true;
            } else {
                return false;
            }
        }
    }

    public String cityID(String cityName) {

        String cityID = "";

        switch (cityName) {
            case "CLOVIS":
                cityID = "13889";
                break;
            case "PORTALES":
                cityID="36481";
                break;
            default:
                cityID = "city is bad to the bone";

        }

        return cityID;
    }

    public void MakeToast(String message){

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

}
