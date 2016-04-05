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


public class HistoryFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_history, container, false);

        /*Resources res2 = getResources();
        String[] stadMuseum2 = res2.getStringArray(R.array.stad_museam_maritiman);

        final TextView textView2 = (TextView) rootView.findViewById(R.id.txtStadMuseumTicket);
        textView2.setText(stadMuseum2[4]);*/

        return rootView;
    }
}