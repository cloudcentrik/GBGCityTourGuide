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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class VisitFragment extends Fragment {

    private TextView txtAddress;
    private TextView txtContactInfo;
    private ImageView mapImage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_visit, container, false);

        /*final TextView txtContactInfoHeading = (TextView) rootView.findViewById(R.id.contact_info_heading);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.fade_in_animation);
        txtContactInfoHeading.startAnimation(fadeInAnimation);*/



        txtAddress = (TextView) rootView.findViewById(R.id.txtStadMuseumAddress);
        txtAddress.setText(StringsUtils.getStadMesuemValues().get("history"));

        txtContactInfo = (TextView) rootView.findViewById(R.id.txtStadMuseumContactInfo);
        txtContactInfo.setText(StringsUtils.getStadMesuemValues().get("history"));

        mapImage=(ImageView) rootView.findViewById(R.id.map);

        //get activity name
        String strActivity = getActivity().toString();
        this.setTextDetailsInfo(strActivity);

        return rootView;
    }

    //set history text
    private void setTextDetailsInfo(String activity) {

        switch (activity) {
            case "MaritimanMuseumActivity":
                txtAddress.setText(StringsUtils.getStadMesuemValues().get("history"));
                break;
            case "EastIndiaCompanyHPActivity":
                txtAddress.setText(StringsUtils.getEastIndiaCompanyHPValues().get("history"));
                break;
            case "VingaIslandActivity":
                txtAddress.setText(StringsUtils.getVingaIslandValues().get("address"));
                txtContactInfo.setText(StringsUtils.getVingaIslandValues().get("contact"));
                mapImage.setImageResource(R.drawable.vinga_island_map);
                break;
            default:
                txtAddress.setText("Value is Not Defined");
                break;
        }
    }

}