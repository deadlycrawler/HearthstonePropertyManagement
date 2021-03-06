package com.tools.radio.hearthstonepropertymanagement.RecyclerViewClasses;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.tools.radio.hearthstonepropertymanagement.R;

import java.util.ArrayList;


public class HouseAdapter extends ArrayAdapter<House> {

    private int mColorResourceId;

    public HouseAdapter(Activity context, ArrayList<House> House, int colorResourceId) {

        super(context, 0, House);
        this.mColorResourceId = colorResourceId;

    }


    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.house_list_view, parent, false);
        }

        final House currentHouse = getItem(position);

        TextView house_price = (TextView) listItemView.findViewById(R.id.house_price);
        house_price.setText("$ " + currentHouse.getmPrice());

        TextView house_address_line_1 = (TextView) listItemView.findViewById(R.id.house_address_line_1);
        house_address_line_1.setText(currentHouse.getmAddressLine1());


        //added click listener to the address line, so that a click will bring up google maps with that address
        house_address_line_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //address is basied of the input address fromt he buy/Rentals page
                Uri gmmIntentUri = Uri.parse(currentHouse.getGoogleMapsAddress());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                getContext().startActivity(mapIntent);
            }

        });

        TextView house_address_line_2 = (TextView) listItemView.findViewById(R.id.house_address_line_2);
        house_address_line_2.setText(currentHouse.getmAddressLine2());

        //same as address line 1 added for redundancy and easier clicking, will combine when i have time
       house_address_line_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Uri gmmIntentUri = Uri.parse(currentHouse.getGoogleMapsAddress());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                getContext().startActivity(mapIntent);
            }

        });

//        ImageView houseView = (ImageView) listItemView.findViewById(R.id.houseView1);
//        houseView.setImageResource(currentHouse.getmImageResourceId());
//        if (currentHouse.hasImage()) {
//            houseView.setVisibility(View.VISIBLE);
//        } else {
//            houseView.setVisibility(View.GONE);
//
//        }

        ImageAdapter adapter = new ImageAdapter((Activity) this.getContext(), currentHouse.getmHouseImageLocations());

        ListView listView = (ListView) listItemView.findViewById(R.id.Image_List_in_house_list_view);
//        listView.setRotation(-90);
        listView.setAdapter(adapter);


        // was used to add click event to the Image in the rentList/BuyLIstViews
//        houseView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Uri gmmIntentUri = Uri.parse(currentHouse.getGoogleMapsStreetView());
//                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//                mapIntent.setPackage("com.google.android.apps.maps");
//                getContext().startActivity(mapIntent);
//            }
//
//        });

        TextView beds = (TextView) listItemView.findViewById(R.id.number_of_bedrooms);
        beds.setText(Integer.toString(currentHouse.getmBeds()));

        TextView baths = (TextView) listItemView.findViewById(R.id.number_of_bathrooms);
        baths.setText(Integer.toString(currentHouse.getmBaths()));

        TextView garage = (TextView) listItemView.findViewById(R.id.GarageBoolean);
        if(currentHouse.ismGarage()) garage.setText(R.string.yes);else garage.setText(R.string.no);

        TextView fireplace = (TextView) listItemView.findViewById(R.id.fireplaceBoolean);
        if(currentHouse.ismFireplace()) fireplace.setText(R.string.yes);else fireplace.setText(R.string.no);

        TextView sqfeet = (TextView) listItemView.findViewById(R.id.number_of_squarefeet);
        if (currentHouse.getmSqfeet() != 0) {
            sqfeet.setText(Integer.toString(currentHouse.getmSqfeet()));
        } else {

            sqfeet.setText(R.string.unavailable);
        }


        return listItemView;
    }


}
