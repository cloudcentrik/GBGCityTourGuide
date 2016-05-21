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

    public BaseTabsPagerAdapter(FragmentManager fm, int NumOfTabs, HashMap<String, String> values) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;

        this.overView=values.get("OVERVIEW");

        this.openingHours=values.get("OPENING_HOURS");
        this.ticketPrice=values.get("TICKET_PRICE");
        this.travelInfo=values.get("TRAVEL_INFO");


    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                BaseOverviewFragment tab1 = BaseOverviewFragment.newInstance(this.overView);
                return tab1;
            case 1:
                BaseDetailInfoFragment tab2 = BaseDetailInfoFragment.newInstance(this.openingHours,this.ticketPrice,this.travelInfo);
                return tab2;
            case 2:
                BaseOverviewFragment tab3 = BaseOverviewFragment.newInstance(this.overView);
                return tab3;
            case 3:
                BaseOverviewFragment tab4 = BaseOverviewFragment.newInstance(this.overView);
                return tab4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    private int convertStringToId(String id, Context context){
        int resID = context.getResources().getIdentifier("widget_blue", "layout", context.getPackageName());
        return resID;
    }
}