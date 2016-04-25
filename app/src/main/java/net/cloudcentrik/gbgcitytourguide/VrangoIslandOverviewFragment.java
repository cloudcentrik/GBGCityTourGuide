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

public class VrangoIslandOverviewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_vrango_island_overview, container, false);

        final TextView txtOverview = (TextView) rootView.findViewById(R.id.txtVrangoIslandOverview);

        txtOverview.setText(StringsUtils.getStadMesuemValues().get("history"));


        return rootView;
    }
}