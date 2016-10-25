package net.cloudcentrik.gbgcitytourguide;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.HashMap;

public class BaseTabsPagerAdapter extends FragmentStatePagerAdapter {
    private int mNumOfTabs;

    private String overView;

    private String openingHours;
    private String ticketPrice;
    private String travelInfo;

    private String address;
    private String email;
    private String phone;

    private String contactInfo;
    private String mapId;

    private String galleryImageId;

    public BaseTabsPagerAdapter(FragmentManager fm, int NumOfTabs, HashMap<String, String> values) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;

        this.overView=values.get("OVERVIEW");

        this.openingHours=values.get("OPENING_HOURS");
        this.ticketPrice=values.get("TICKET_PRICE");
        this.travelInfo=values.get("TRAVEL_INFO");

        this.address=values.get("ADDRESS");
        this.email=values.get("EMAIL");
        this.phone=values.get("PHONE");

        this.contactInfo=values.get("CONTACT_INFO");
        this.mapId=values.get("MAP");

        this.galleryImageId=values.get("GALLERY");


    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                BaseOverviewFragment tab1 = BaseOverviewFragment.newInstance(this.overView);
                return tab1;
            case 1:
                BaseDetailInfoFragment tab2 = BaseDetailInfoFragment.newInstance(this.openingHours,this.ticketPrice,this.travelInfo, this.address, this.email, this.phone);
                return tab2;
            case 2:
                //BaseVisitFragment tab3 = BaseVisitFragment.newInstance(this.address,this.contactInfo,this.mapId);
                //BaseMapFragment tab3 = BaseMapFragment.newInstance(this.address,this.contactInfo,this.mapId);
                BaseGoogleMapFragment tab3 = BaseGoogleMapFragment.newInstance(this.address,this.contactInfo,this.mapId);
                return tab3;
            case 3:
                BaseGalleryFragment tab4 = BaseGalleryFragment.newInstance(this.galleryImageId);
                return tab4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

}