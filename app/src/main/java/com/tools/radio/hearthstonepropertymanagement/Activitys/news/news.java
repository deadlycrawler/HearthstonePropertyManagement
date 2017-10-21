package com.tools.radio.hearthstonepropertymanagement.Activitys.news;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.tools.radio.hearthstonepropertymanagement.Activitys.sell.sell;
import com.tools.radio.hearthstonepropertymanagement.R;

import java.util.ArrayList;

public class news extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_list);


        //TODO: find out if this page needs to exist
        final ArrayList<NewsLister> news = new ArrayList<NewsLister>();
        //placeholder data
        news.add(new NewsLister(R.drawable.news1,"Drones droning in drone land","lots and lots of text that is full of text refrences to text used to fill up space and simulate a news article"));
        news.add(new NewsLister(R.drawable.news1,"Drones droning in drone land","lots and lots of text that is full of text refrences to text used to fill up space and simulate a news article"));
        news.add(new NewsLister(R.drawable.news1,"Drones droning in drone land","lots and lots of text that is full of text refrences to text used to fill up space and simulate a news article"));


        //takes word objects and desplays them in a list view and casts them to textviews
        NewsAdapter adapter = new NewsAdapter(this, news, R.color.grey);
        ListView listView = (ListView) findViewById(R.id.NewsList);
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
        Context context = news.this;

        switch (menuItemThatWasSelected){

            case R.id.CallMenuButton:
                Intent i = new Intent(news.this, com.tools.radio.hearthstonepropertymanagement.Activitys.contact.contact.class);
                startActivity(i);
                break;

        }


        return super.onOptionsItemSelected(item);
    }
}