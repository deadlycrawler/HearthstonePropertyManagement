package com.tools.radio.hearthstonepropertymanagement.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tools.radio.hearthstonepropertymanagement.Activitys.AboutUs.AboutUsActivity;
import com.tools.radio.hearthstonepropertymanagement.Activitys.Rent.rent_search;
import com.tools.radio.hearthstonepropertymanagement.R;


//TODO: change splash screen to his seal and have a highlight on his brand
//TODO: impliment tracker of houses people are possibly intrested in, create a varrible to contrain the last listing that was interacted with prior to hiting contact

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView contact = (TextView) findViewById(R.id.contact);
        TextView news = (TextView) findViewById(R.id.news);
        TextView buy = (TextView) findViewById(R.id.buy);
        TextView sell = (TextView) findViewById(R.id.sell);
        TextView rent = (TextView) findViewById(R.id.rent);
        TextView aboutUs = (TextView) findViewById(R.id.aboutUs);

        //buttons(textViews) on primary menu, simple click events to navigate
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.tools.radio.hearthstonepropertymanagement.Activitys.contact.contact.class);
                startActivity(i);
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.tools.radio.hearthstonepropertymanagement.Activitys.news.news.class);
                startActivity(i);
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.tools.radio.hearthstonepropertymanagement.Activitys.buy.buy.class);
                startActivity(i);
            }
        });

        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.tools.radio.hearthstonepropertymanagement.Activitys.sell.sell.class);
                startActivity(i);
            }
        });

        rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, rent_search.class);
                startActivity(i);
            }
        });
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });

    }
}
