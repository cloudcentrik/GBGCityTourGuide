package net.cloudcentrik.gbgcitytourguide;

/**
 * Created by Packard Bell on 2016-04-04.
 */

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BaseVisitFragment extends Fragment {

    private TextView txtAddress;
    private TextView txtContactInfo;
    private ImageView mapImage;

    private String address;
    private String contactInfo;
    private String mapId;

    public static BaseVisitFragment newInstance(String address,String contactInfo, String mapId) {
        BaseVisitFragment fragment = new BaseVisitFragment();
        Bundle args = new Bundle();
        args.putString("ADDRESS", address);
        args.putString("CONTACT_INFO", contactInfo);
        args.putString("MAP", mapId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_visit, container, false);

        this.address = getArguments().getString("ADDRESS", "");
        this.contactInfo=getArguments().getString("CONTACT_INFO", "");
        this.mapId=getArguments().getString("MAP", "");

        txtAddress = (TextView) rootView.findViewById(R.id.txtStadMuseumAddress);
        txtContactInfo = (TextView) rootView.findViewById(R.id.txtStadMuseumContactInfo);
        mapImage = (ImageView) rootView.findViewById(R.id.map);
        mapImage.setScaleType(ImageView.ScaleType.CENTER_CROP);

        this.setTextDetailsInfo();

        return rootView;
    }

    //set history text
    private void setTextDetailsInfo() {

        txtAddress.setText(this.address);
        txtContactInfo.setText(this.contactInfo);
        mapImage.setImageResource(this.convertStringToId(this.mapId));

    }

    private int convertStringToId(String id){
        Context context=getActivity().getApplicationContext();
        int resID = context.getResources().getIdentifier(id, "drawable", context.getPackageName());
        return resID;
    }

}