package com.tools.radio.hearthstonepropertymanagement;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class rent_search extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rent_search);


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
