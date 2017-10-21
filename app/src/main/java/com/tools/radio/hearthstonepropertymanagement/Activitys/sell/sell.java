package com.tools.radio.hearthstonepropertymanagement.Activitys.sell;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.tools.radio.hearthstonepropertymanagement.Activitys.MainActivity;
import com.tools.radio.hearthstonepropertymanagement.R;

public class sell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sell);





    }  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int menuItemThatWasSelected = item.getItemId();
        Context context = sell.this;

        switch (menuItemThatWasSelected){

            case R.id.CallMenuButton:
                Intent i = new Intent(sell.this, com.tools.radio.hearthstonepropertymanagement.Activitys.contact.contact.class);
                startActivity(i);
                break;

        }


        return super.onOptionsItemSelected(item);
    }
}