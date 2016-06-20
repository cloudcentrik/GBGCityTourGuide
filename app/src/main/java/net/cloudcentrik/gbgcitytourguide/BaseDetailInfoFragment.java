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


public class BaseDetailInfoFragment extends Fragment {

    private String openingHours;
    private String ticketPrice;
    private String travelInfo;

    private TextView textOpeningHours;
    private TextView textTicketPrice;
    private TextView textTravelInfo;

    public static BaseDetailInfoFragment newInstance(String openingHours,String ticketPrice,String travelInfo) {
        BaseDetailInfoFragment fragment = new BaseDetailInfoFragment();
        Bundle args = new Bundle();
        args.putString("OPENING_HOURS",openingHours);
        args.putString("TICKET_PRICE",ticketPrice);
        args.putString("TRAVEL_INFO",travelInfo);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_base_detail_info, container, false);

        this.openingHours = getArguments().getString("OPENING_HOURS", "");
        this.ticketPrice = getArguments().getString("TICKET_PRICE", "");
        this.travelInfo = getArguments().getString("TRAVEL_INFO", "");

        textOpeningHours = (TextView) rootView.findViewById(R.id.txtStadMuseumOpeningHours);


        textTicketPrice = (TextView) rootView.findViewById(R.id.txtStadMuseumTicketPrice);


        textTravelInfo = (TextView) rootView.findViewById(R.id.txtStadMuseumTravelInfo);

        this.setTextDetailsInfo();


        return rootView;
        //
    }

    //set history text
    private void setTextDetailsInfo() {

                textOpeningHours.setText(this.openingHours);
                textTicketPrice.setText(this.ticketPrice);
                textTravelInfo.setText(this.travelInfo);
    }
}