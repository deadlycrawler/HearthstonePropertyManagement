package com.tools.radio.hearthstonepropertymanagement;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by John on 7/30/2017.
 */

public class ImageAdapter extends ArrayAdapter<Images> {

    private int mColorResourceId;

    public ImageAdapter(Activity context, ArrayList<Images> houseImageLocations, int colorResourceId) {
        super(context, 0, houseImageLocations);

        this.mColorResourceId = colorResourceId;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.image_layout, parent, false);
        }
        final Images currentHouse = getItem(position);



        ImageView houseView = (ImageView) listItemView.findViewById(R.id.singleHouseImage);


            houseView.setImageResource(R.drawable.house_example_1);

            if (currentHouse.hasImage()) {
                houseView.setVisibility(View.VISIBLE);
            } else {
                houseView.setVisibility(View.GONE);//
            }

        return listItemView;

    }
}
