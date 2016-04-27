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
import android.widget.TextView;

public class VisitFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_visit, container, false);

        /*final TextView txtContactInfoHeading = (TextView) rootView.findViewById(R.id.contact_info_heading);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.fade_in_animation);
        txtContactInfoHeading.startAnimation(fadeInAnimation);*/



        final TextView txtAddress = (TextView) rootView.findViewById(R.id.txtStadMuseumAddress);
        txtAddress.setText(StringsUtils.getStadMesuemValues().get("history"));

        final TextView txtContactInfo = (TextView) rootView.findViewById(R.id.txtStadMuseumContactInfo);
        txtContactInfo.setText(StringsUtils.getStadMesuemValues().get("history"));

        return rootView;
    }

}