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
                textOpeningHours.setText(StringsUtils.getEastIndiaCompanyHPValues().get("openingHours"));
                textTicketPrice.setText(StringsUtils.getEastIndiaCompanyHPValues().get("ticketPrice"));
                textTravelInfo.setText(StringsUtils.getEastIndiaCompanyHPValues().get("travelInfo"));
                break;
            case "AlvsborgCastleHPActivity":
                textOpeningHours.setText(StringsUtils.getAlvsborgCastleHPActivity().get("openingHours"));
                textTicketPrice.setText(StringsUtils.getAlvsborgCastleHPActivity().get("ticketPrice"));
                textTravelInfo.setText(StringsUtils.getAlvsborgCastleHPActivity().get("travelInfo"));
                break;
            case "CarlstenFortHPActivity":
                textOpeningHours.setText(StringsUtils.getCarlstenFortHPActivity().get("openingHours"));
                textTicketPrice.setText(StringsUtils.getCarlstenFortHPActivity().get("ticketPrice"));
                textTravelInfo.setText(StringsUtils.getCarlstenFortHPActivity().get("travelInfo"));
                break;
            case "VingaIslandActivity":
                textOpeningHours.setText(StringsUtils.getVingaIslandValues().get("opening_hours"));
                textTicketPrice.setText(StringsUtils.getVingaIslandValues().get("ticket"));
                textTravelInfo.setText(StringsUtils.getVingaIslandValues().get("travel"));
                break;
            case "HonoIslandActivity":
                textOpeningHours.setText(StringsUtils.getHonoIslandValues().get("opening_hours"));
                textTicketPrice.setText(StringsUtils.getHonoIslandValues().get("ticket"));
                textTravelInfo.setText(StringsUtils.getHonoIslandValues().get("travel"));
                break;
            case "RoroIslandActivity":
                textOpeningHours.setText(StringsUtils.getRoroIslandValues().get("opening_hours"));
                textTicketPrice.setText(StringsUtils.getRoroIslandValues().get("ticket"));
                textTravelInfo.setText(StringsUtils.getRoroIslandValues().get("travel"));
                break;
            case "StyrsoIslandActivity":
                textOpeningHours.setText(StringsUtils.getStyrsoIslandValues().get("opening_hours"));
                textTicketPrice.setText(StringsUtils.getStyrsoIslandValues().get("ticket"));
                textTravelInfo.setText(StringsUtils.getStyrsoIslandValues().get("travel"));
                break;
            case "OlearysResturentActivity":
                textOpeningHours.setText(StringsUtils.getOlearysValues().get("opening_hours"));
                textTicketPrice.setText(StringsUtils.getOlearysValues().get("ticket"));
            case "HardRockCafeActivity":
                textOpeningHours.setText(StringsUtils.getHardRockCafeValues().get("opening_hours"));
                textTicketPrice.setText(StringsUtils.getHardRockCafeValues().get("ticket"));
                textTravelInfo.setText(StringsUtils.getHardRockCafeValues().get("travel"));
                break;
            case "NordstanSCActivity":
                textOpeningHours.setText(StringsUtils.getNordstanValues().get("opening_hours"));
                textTravelInfo.setText(StringsUtils.getNordstanValues().get("travel"));
                textTicketPrice.setText(StringsUtils.getNordstanValues().get("ticket"));
                break;


            default:
                textOpeningHours.setText("Value is Not Defined");
                break;
        }
    }
}