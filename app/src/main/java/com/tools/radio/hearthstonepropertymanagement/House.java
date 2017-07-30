package com.tools.radio.hearthstonepropertymanagement;


public class House {

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mPrice, mBeds, mBaths, mSqfeet;
    private String mAddressLine1;
    private String mAddressLine2;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    //private String mLat, mLong;


    public House(int price, String AddressLine1, String AddressLine2, int ImageResourceId, int beds, int baths, int sqfeet) {
        this.mPrice = price;
        this.mImageResourceId = ImageResourceId;
        this.mBeds = beds;
        this.mBaths = baths;
        this.mSqfeet = sqfeet;
        this.mAddressLine1 = AddressLine1;
        this.mAddressLine2 = AddressLine2;
//        this.mLat=lat;
//        this.mLong=Long;


    }

    public String getmPrice() {
        return Integer.toString(mPrice);
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

    public String getGoogleMapsAddress() {

        String part1 = "google.navigation:q=";
        String part2 = this.mAddressLine1 + ",+";
        String part3 = this.mAddressLine2;

        return part1 + part2 + part3;
    }
// potential use as a way to get to google maps
//    public String getGoogleMapsStreetView() {
//
//        String part1 = "google.streetview:cbll=";
//
//        String part2 = this.mLat + ",+";
//        String part3 = this.mLong;
//
//        return "part1+part2+part3";
//    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
