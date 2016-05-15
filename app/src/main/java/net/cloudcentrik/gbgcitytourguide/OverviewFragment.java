package net.cloudcentrik.gbgcitytourguide;

/**
 * Created by Packard Bell on 2016-04-04.
 */

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

public class OverviewFragment extends Fragment {

    private TextView txtOverview;
    private WebView txtOverviewContent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_overview, container, false);

        //txtOverview = (TextView) rootView.findViewById(R.id.txtStadMuseumOverview);

        txtOverviewContent = (WebView) rootView.findViewById(R.id.textOverviewContent);

        //get activity name
        String strActivity = getActivity().toString();
        //set history text
        //this.setTextHistory(strActivity);
        this.setOverviewContent(strActivity);


        return rootView;
    }

    private void setOverviewContent(String activity){

        StringBuilder text=new StringBuilder();
        text.append("<html><body bgcolor=\"#B2EBF2\" style=\"color:black;\"><p align=\"justify\">");
        switch (activity) {
            case "MaritimanMuseumActivity":
                text.append(StringsUtils.getStadMesuemValues().get("history"));
                break;
            case "EastIndiaCompanyHPActivity":
                text.append(StringsUtils.getEastIndiaCompanyHPValues().get("history"));
                break;
            case "VingaIslandActivity":
                text.append(StringsUtils.getVingaIslandValues().get("Overview"));
                break;
            case "VrangoIslandActivity":
                text.append(StringsUtils.getVingaIslandValues().get("Overview"));
                break;
            case "HonoIslandActivity":
                text.append(StringsUtils.getHonoIslandValues().get("Overview"));
                break;
            case "RoroIslandActivity":
                text.append(StringsUtils.getRoroIslandValues().get("Overview"));
                break;
            case "StyrsoIslandActivity":
                text.append(StringsUtils.getStyrsoIslandValues().get("Overview"));
                break;
            case "OlearysResturentActivity":
                text.append(StringsUtils.getOlearysValues().get("Overview"));
                break;
            case "HardRockCafeActivity":
                text.append(StringsUtils.getHardRockCafeValues().get("Overview"));
                break;
            default: text.append("History is Not Defined");
                break;
        }
        text.append("</p></body></html>");
        txtOverviewContent.loadData(text.toString(), "text/html", " UTF-8");

    }

    //set history text
    /*private void setTextHistory(String activity){

        switch (activity) {
            case "MaritimanMuseumActivity":
                txtOverview.setText(StringsUtils.getStadMesuemValues().get("history"));
                break;
            case "EastIndiaCompanyHPActivity":
                txtOverview.setText(StringsUtils.getEastIndiaCompanyHPValues().get("history"));
                break;
            case "VingaIslandActivity":
                txtOverview.setText(StringsUtils.getVingaIslandValues().get("Overview"));
                break;
            case "VrangoIslandActivity":
                txtOverview.setText(StringsUtils.getVingaIslandValues().get("Overview"));
                break;
            case "HonoIslandActivity":
                txtOverview.setText(StringsUtils.getHonoIslandValues().get("Overview"));
                break;
            case "RoroIslandActivity":
                txtOverview.setText(StringsUtils.getRoroIslandValues().get("Overview"));
                break;
            case "StyrsoIslandActivity":
                txtOverview.setText(StringsUtils.getStyrsoIslandValues().get("Overview"));
                break;
            case "OlearysResturentActivity":
                txtOverview.setText(StringsUtils.getOlearysValues().get("Overview"));
                break;
            case "HardRockCafeActivity":
                txtOverview.setText(StringsUtils.getHardRockCafeValues().get("Overview"));
                break;
            default: txtOverview.setText("History is Not Defined");
                break;
        }



    }*/
}