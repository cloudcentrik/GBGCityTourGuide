package net.cloudcentrik.gbgcitytourguide;

/**
 * Created by Packard Bell on 2016-04-04.
 */

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OverviewFragment extends Fragment {

    private TextView txtOverview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_overview, container, false);

        txtOverview = (TextView) rootView.findViewById(R.id.txtStadMuseumOverview);

        //get activity name
        String strActivity = getActivity().toString();
        //set history text
        this.setTextHistory(strActivity);


        return rootView;
    }

    //set history text
    private void setTextHistory(String activity){

        switch (activity) {
            case "StadMuseumActivity":
                txtOverview.setText(StringsUtils.getStadMesuemValues().get("history"));
                break;
            case "EastIndiaCompanyHPActivity":
                txtOverview.setText(StringsUtils.getEastIndiaCompanyHPValues().get("history"));
                break;
            default: txtOverview.setText("History is Not Defined");
                break;
        }



    }
}