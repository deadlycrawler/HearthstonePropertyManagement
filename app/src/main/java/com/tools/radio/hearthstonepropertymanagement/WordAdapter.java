package com.tools.radio.hearthstonepropertymanagement;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.tools.radio.hearthstonepropertymanagement.R.string.beds;


public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> Word, int colorResourceId) {

        super(context, 0, Word);
        this.mColorResourceId=colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.house_list_view, parent, false);
        }


        Word currentWord = getItem(position);

        TextView house_price = (TextView) listItemView.findViewById(R.id.house_price);
        house_price.setText("$ "+currentWord.getmPrice());

        TextView house_address_line_1 = (TextView) listItemView.findViewById(R.id.house_address_line_1);
        house_address_line_1.setText(currentWord.getmAddressLine1());

        TextView house_address_line_2 = (TextView) listItemView.findViewById(R.id.house_address_line_2);
        house_address_line_2.setText(currentWord.getmAddressLine2());


        ImageView houseView = (ImageView) listItemView.findViewById(R.id.houseView1);
        houseView.setImageResource(currentWord.getmImageResourceId());
        if(currentWord.hasImage()) {
            houseView.setVisibility(View.VISIBLE);
        }else{
            houseView.setVisibility(View.GONE);

        }


        TextView beds = (TextView) listItemView.findViewById(R.id.number_of_bedrooms);
        beds.setText(Integer.toString(currentWord.getmBeds()));

        TextView baths = (TextView) listItemView.findViewById(R.id.number_of_bathrooms);
        baths.setText(Integer.toString(currentWord.getmBaths()));

        TextView sqfeet = (TextView) listItemView.findViewById(R.id.number_of_squarefeet);
        sqfeet.setText(Integer.toString(currentWord.getmSqfeet()));


        return listItemView;
    }


}
