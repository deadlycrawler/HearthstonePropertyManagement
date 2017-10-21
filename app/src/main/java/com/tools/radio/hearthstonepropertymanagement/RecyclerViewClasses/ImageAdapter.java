package com.tools.radio.hearthstonepropertymanagement.RecyclerViewClasses;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.tools.radio.hearthstonepropertymanagement.R;

import java.util.ArrayList;


public class ImageAdapter extends ArrayAdapter<Images> {



    public ImageAdapter(Activity context, ArrayList<Images> houseImageLocations) {
        super(context, 0, houseImageLocations);

    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.image_layout, parent, false);
        }
        final Images currentHouse = getItem(position);



        ImageView houseView = (ImageView) listItemView.findViewById(R.id.singleHouseImage);

        int width = houseView.getWidth();
        int height = houseView.getHeight();
            houseView.setImageResource(currentHouse.getmImageResourceId2());


            if (currentHouse.hasImage()) {
                houseView.setVisibility(View.VISIBLE);
            } else {
                houseView.setVisibility(View.GONE);//
            }

        return listItemView;

    }
}
