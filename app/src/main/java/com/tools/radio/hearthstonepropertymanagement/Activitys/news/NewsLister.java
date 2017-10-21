package com.tools.radio.hearthstonepropertymanagement.Activitys.news;


public class NewsLister {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mNewsTitle, mNewsSummary;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public NewsLister(int ImageResourceId, String NewsTitle, String NewsSummary) {
        this.mImageResourceId = ImageResourceId;
        this.mNewsTitle = NewsTitle;
        this.mNewsSummary = NewsSummary;

    }

    public int getmImageResourceId() {

        return mImageResourceId;
    }

    public String getmNewsTitle() {
        return mNewsTitle;
    }

    public String getmNewsSummary() {
        return mNewsSummary;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
