package com.tools.radio.hearthstonepropertymanagement;


public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mPrice, mBeds, mBaths, mSqfeet;
    private String mAddressLine1, mAddressLine2;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Word(int price, String AddressLine1, String AddressLine2, int ImageResourceId, int beds, int baths, int sqfeet) {
        this.mPrice = price;
        this.mImageResourceId = ImageResourceId;
        this.mBeds = beds;
        this.mBaths = baths;
        this.mSqfeet = sqfeet;
        this.mAddressLine1 = AddressLine1;
        this.mAddressLine2 = AddressLine2;

    }

    public String getmPrice() {
        return Integer.toString(mPrice) ;
    }

    public int getmBeds() {
        return mBeds;
    }

    public int getmBaths() {
        return mBaths;
    }

    public int getmSqfeet() {
        return mSqfeet;
    }

    public String getmAddressLine1() {
        return mAddressLine1;
    }

    public String getmAddressLine2() {
        return mAddressLine2;
    }

    public int getmImageResourceId() {

        return mImageResourceId;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
