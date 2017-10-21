package com.tools.radio.hearthstonepropertymanagement.RecyclerViewClasses;


public class Images {


    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Images(int houseImage) {

        mImageResourceId = houseImage;

    }

    public int getmImageResourceId2() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
