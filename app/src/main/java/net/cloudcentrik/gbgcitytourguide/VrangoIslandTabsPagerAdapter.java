package net.cloudcentrik.gbgcitytourguide;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class VrangoIslandTabsPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public VrangoIslandTabsPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                VrangoIslandOverviewFragment tab1 = new VrangoIslandOverviewFragment();
                return tab1;
            case 1:
                VrangoIslandDetailInfoFragment tab2 = new VrangoIslandDetailInfoFragment();
                return tab2;
            case 2:
                VrangoIslandVisitFragment tab3 = new VrangoIslandVisitFragment();
                return tab3;
            case 3:
                VrangoIslandGalleryFragment tab4 = new VrangoIslandGalleryFragment();
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