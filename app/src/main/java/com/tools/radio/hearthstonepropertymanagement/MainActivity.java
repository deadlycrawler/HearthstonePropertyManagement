package com.tools.radio.hearthstonepropertymanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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

        //buttons(textViews) on primary menu, simple click events to navigate

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, contact.class);
                startActivity(i);
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, news.class);
                startActivity(i);
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, buy.class);
                startActivity(i);
            }
        });

        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, sell.class);
                startActivity(i);
            }
        });

        rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, rent.class);
                startActivity(i);
            }
        });

    }
}
