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

public class BaseOverviewFragment extends Fragment {

    private String overView;
    private WebView txtOverviewContent;

    public static BaseOverviewFragment newInstance(String overView) {
        BaseOverviewFragment fragment = new BaseOverviewFragment();
        Bundle args = new Bundle();
        args.putString("over view", overView);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_overview, container, false);

        this.overView = getArguments().getString("over view", "");

        txtOverviewContent = (WebView) rootView.findViewById(R.id.textOverviewContent);


        this.setOverviewContent(this.overView);


        return rootView;
    }

    private void setOverviewContent(String overView){

        StringBuilder text=new StringBuilder();
        text.append("<html><body bgcolor=\"#B2EBF2\" style=\"color:black;\"><p align=\"justify\">");
        text.append(overView);
        text.append("</p></body></html>");
        txtOverviewContent.loadData(text.toString(), "text/html", " UTF-8");

    }

}