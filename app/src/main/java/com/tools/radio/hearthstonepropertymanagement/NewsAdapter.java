package com.tools.radio.hearthstonepropertymanagement;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class NewsAdapter extends ArrayAdapter<NewsLister> {

    private int mColorResourceId;

    public NewsAdapter(Activity context, ArrayList<NewsLister> NewsLister, int colorResourceId) {

        super(context, 0, NewsLister);
        this.mColorResourceId=colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_view, parent, false);
        }


        NewsLister currentNewBlurb = getItem(position);

        ImageView houseView = (ImageView) listItemView.findViewById(R.id.news_image);
        houseView.setImageResource(currentNewBlurb.getmImageResourceId());
        if(currentNewBlurb.hasImage()) {
            houseView.setVisibility(View.VISIBLE);
        }else{
            houseView.setVisibility(View.GONE);

        }

        TextView house_address_line_1 = (TextView) listItemView.findViewById(R.id.new_headline);
        house_address_line_1.setText(currentNewBlurb.getmNewsTitle());

        TextView house_address_line_2 = (TextView) listItemView.findViewById(R.id.news_content);
        house_address_line_2.setText(currentNewBlurb.getmNewsSummary());







        return listItemView;
    }


}
