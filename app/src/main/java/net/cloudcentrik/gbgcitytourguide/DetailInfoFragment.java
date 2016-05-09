package net.cloudcentrik.gbgcitytourguide;

/**
 * Created by Packard Bell on 2016-04-04.
 */

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DetailInfoFragment extends Fragment {

    private TextView textOpeningHours;
    private TextView textTicketPrice;
    private TextView textTravelInfo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_detail_info, container, false);

        textOpeningHours = (TextView) rootView.findViewById(R.id.txtStadMuseumOpeningHours);


        textTicketPrice = (TextView) rootView.findViewById(R.id.txtStadMuseumTicketPrice);


        textTravelInfo = (TextView) rootView.findViewById(R.id.txtStadMuseumTravelInfo);

        //get activity name
        String strActivity = getActivity().toString();
        this.setTextDetailsInfo(strActivity);


        return rootView;
        //
    }

    //set history text
    private void setTextDetailsInfo(String activity) {

        switch (activity) {
            case "MaritimanMuseumActivity":
                textOpeningHours.setText(StringsUtils.getStadMesuemValues().get("history"));
                break;
            case "EastIndiaCompanyHPActivity":
                textOpeningHours.setText(StringsUtils.getEastIndiaCompanyHPValues().get("history"));
                break;
            case "VingaIslandActivity":
                textOpeningHours.setText(StringsUtils.getVingaIslandValues().get("opening_hours"));
                textTicketPrice.setText(StringsUtils.getVingaIslandValues().get("ticket"));
                textTravelInfo.setText(StringsUtils.getVingaIslandValues().get("travel"));
                break;
            default:
                textOpeningHours.setText("Value is Not Defined");
                break;
        }
    }
}