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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_detail_info, container, false);

        final TextView textOpeningHours = (TextView) rootView.findViewById(R.id.txtStadMuseumOpeningHours);
        textOpeningHours.setText(StringsUtils.getStadMesuemValues().get("history"));

        final TextView textTicketPrice = (TextView) rootView.findViewById(R.id.txtStadMuseumTicketPrice);
        textTicketPrice.setText(StringsUtils.getEastIndiaCompanyHPValues().get("history"));

        final TextView textTravelInfo = (TextView) rootView.findViewById(R.id.txtStadMuseumTravelInfo);
        textTravelInfo.setText(StringsUtils.getAlvsborgCastleHPActivity().get("history"));

        return rootView;
        //
    }
}