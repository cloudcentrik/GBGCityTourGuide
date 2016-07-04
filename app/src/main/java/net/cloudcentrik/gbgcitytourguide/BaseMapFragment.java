package net.cloudcentrik.gbgcitytourguide;

/**
 * Created by Packard Bell on 2016-04-04.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.osmdroid.DefaultResourceProxyImpl;
import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.ItemizedIconOverlay;
import org.osmdroid.views.overlay.ItemizedOverlayWithFocus;
import org.osmdroid.views.overlay.OverlayItem;
import org.osmdroid.views.overlay.ScaleBarOverlay;
import org.osmdroid.views.overlay.SimpleLocationOverlay;

import java.util.ArrayList;

public class BaseMapFragment extends Fragment{

    private MapView mapView;
    private IMapController mapController;
    private SimpleLocationOverlay mMyLocationOverlay;
    private ScaleBarOverlay mScaleBarOverlay;
    private ItemizedIconOverlay<OverlayItem> currentLocationOverlay;
    private DefaultResourceProxyImpl resourceProxy;

    public static BaseMapFragment newInstance(String address, String contactInfo, String mapId) {
        BaseMapFragment fragment = new BaseMapFragment();
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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_map, container, false);


        //map
        MapView map = (MapView) rootView.findViewById(R.id.openmap);
        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);

        IMapController mapController = map.getController();
        mapController.setZoom(15);

        Double lad=Double.parseDouble("57.7067050");
        Double lan=Double.parseDouble("11.9690680");

        GeoPoint startPoint = new GeoPoint(lad,lan);
        mapController.setCenter(startPoint);

        //your items
        ArrayList<OverlayItem> items = new ArrayList<OverlayItem>();
        items.add(new OverlayItem("Title", "Description", new GeoPoint(lad,lan))); // Lat/Lon decimal degrees
        DefaultResourceProxyImpl mResourceProxy = new DefaultResourceProxyImpl(getContext());

        //the overlay
        ItemizedOverlayWithFocus<OverlayItem> mOverlay = new ItemizedOverlayWithFocus<OverlayItem>(items,
                new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
                    @Override
                    public boolean onItemSingleTapUp(final int index, final OverlayItem item) {
                        //do something
                        return true;
                    }
                    @Override
                    public boolean onItemLongPress(final int index, final OverlayItem item) {
                        return false;
                    }
                }, mResourceProxy);
        mOverlay.setFocusItemsOnTap(true);

        map.getOverlays().add(mOverlay);

        return rootView;
    }

    private int convertStringToId(String id) {
        Context context = getActivity().getApplicationContext();
        int resID = context.getResources().getIdentifier(id, "drawable", context.getPackageName());
        return resID;
    }
}