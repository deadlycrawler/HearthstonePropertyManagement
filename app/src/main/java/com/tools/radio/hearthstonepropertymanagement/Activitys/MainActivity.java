package com.tools.radio.hearthstonepropertymanagement.Activitys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tools.radio.hearthstonepropertymanagement.Activitys.AboutUs.AboutUsActivity;
import com.tools.radio.hearthstonepropertymanagement.Activitys.buy.buy_search;
import com.tools.radio.hearthstonepropertymanagement.Activitys.rental.Rentals;
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
        TextView rental = (TextView) findViewById(R.id.rental);
        TextView sell = (TextView) findViewById(R.id.sell);
        TextView buy = (TextView) findViewById(R.id.buy);
        TextView aboutUs = (TextView) findViewById(R.id.aboutUs);

        //buttons(textViews) on primary menu, simple click events to navigate
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, com.tools.radio.hearthstonepropertymanagement.Activitys.contact.contact.class);
                startActivity(i);
            }
        });

//        news.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, com.tools.radio.hearthstonepropertymanagement.Activitys.news.news.class);
//                startActivity(i);
//            }
//        });


        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://hearthstonepropertymgt.com/blog/"));
                startActivity(i);


            }
        });
        rental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Rentals.class);
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

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, buy_search.class);
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
