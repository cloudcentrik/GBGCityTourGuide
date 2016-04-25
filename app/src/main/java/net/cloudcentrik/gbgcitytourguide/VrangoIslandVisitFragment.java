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

public class VrangoIslandVisitFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_vrango_island_visit, container, false);



        final TextView txtAddress = (TextView) rootView.findViewById(R.id.txtStadMuseumAddress);
        txtAddress.setText(StringsUtils.stadMesuem[1]);

        final TextView txtContactInfo = (TextView) rootView.findViewById(R.id.txtStadMuseumContactInfo);
        txtContactInfo.setText(StringsUtils.stadMesuem[2]);

        return rootView;
    }

}