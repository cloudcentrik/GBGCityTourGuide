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

public class TicketFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_ticket, container, false);

        /*Resources res3 = getResources();
        String[] stadMuseum3 = res3.getStringArray(R.array.stad_museam_maritiman);

        final TextView textView3 = (TextView) rootView.findViewById(R.id.txtStadMuseumTicket);
        textView3.setText(stadMuseum3[7]);*/

        return rootView;
    }

}