package net.cloudcentrik.gbgcitytourguide;

/**
 * Created by Packard Bell on 2016-04-04.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class BaseGoogleMapFragment extends Fragment implements OnMapReadyCallback{

    private String mapInfo;

    private MapView mMapView;
    private Bundle mBundle;

    private Double lad,lan;

    public static BaseGoogleMapFragment newInstance(String address, String contactInfo, String mapId) {
        BaseGoogleMapFragment fragment = new BaseGoogleMapFragment();
        Bundle args = new Bundle();
        args.putString("ADDRESS", address);
        args.putString("CONTACT_INFO", contactInfo);
        args.putString("MAP", mapId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_google_map, container, false);


        this.mapInfo = getArguments().getString("MAP", "");
        String mapDetails[]= TextUtils.split(this.mapInfo,",");

        lad=Double.parseDouble(mapDetails[0]); //lad
        lan=Double.parseDouble(mapDetails[1]);

        //map
        mMapView = (MapView) rootView.findViewById(R.id.mymap);
        mMapView.getMapAsync(this);
        mMapView.onCreate(mBundle);

        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap map)
    {
        LatLng marker = new LatLng(lad,lan);
        map.addMarker(new MarkerOptions()
                .position(marker)
                .title("Burgerking")
                .snippet("Centralstation")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        );

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(marker,15));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBundle = savedInstanceState;
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        mMapView.onDestroy();
        super.onDestroy();
    }

    private int convertStringToId(String id) {
        Context context = getActivity().getApplicationContext();
        int resID = context.getResources().getIdentifier(id, "drawable", context.getPackageName());
        return resID;
    }
}