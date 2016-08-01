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

    private String address;
    private String email;
    private String phone;

    private TextView textOpeningHours;
    private TextView textTicketPrice;
    private TextView textTravelInfo;

    private TextView textAddress;
    private TextView textEmail;
    private TextView textPhone;

    public static BaseDetailInfoFragment newInstance(String openingHours,String ticketPrice,
                                                     String travelInfo, String address, String email, String phone) {
        BaseDetailInfoFragment fragment = new BaseDetailInfoFragment();
        Bundle args = new Bundle();
        args.putString("OPENING_HOURS",openingHours);
        args.putString("TICKET_PRICE",ticketPrice);
        args.putString("TRAVEL_INFO",travelInfo);
        args.putString("ADDRESS",address);
        args.putString("EMAIL",email);
        args.putString("PHONE",phone);
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
        this.address = getArguments().getString("ADDRESS", "");
        this.email = getArguments().getString("EMAIL", "");
        this.phone = getArguments().getString("PHONE", "");

        textOpeningHours = (TextView) rootView.findViewById(R.id.txtStadMuseumOpeningHours);


        textTicketPrice = (TextView) rootView.findViewById(R.id.txtStadMuseumTicketPrice);


        textTravelInfo = (TextView) rootView.findViewById(R.id.txtStadMuseumTravelInfo);

        textAddress = (TextView) rootView.findViewById(R.id.txtAddress);
        textEmail = (TextView) rootView.findViewById(R.id.txtEmail);
        textPhone = (TextView) rootView.findViewById(R.id.txtPhone);

        this.setTextDetailsInfo();


        return rootView;
        //
    }

    //set history text
    private void setTextDetailsInfo() {

                textOpeningHours.setText(this.openingHours);
                textTicketPrice.setText(this.ticketPrice);
                textTravelInfo.setText(this.travelInfo);
                textAddress.setText(this.address);
                textEmail.setText(this.email);
                textPhone.setText(this.phone);

    }
}