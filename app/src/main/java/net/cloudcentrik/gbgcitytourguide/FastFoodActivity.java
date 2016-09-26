package net.cloudcentrik.gbgcitytourguide;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;

import org.osmdroid.DefaultResourceProxyImpl;
import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.ItemizedIconOverlay;
import org.osmdroid.views.overlay.ItemizedOverlayWithFocus;
import org.osmdroid.views.overlay.MyLocationOverlay;
import org.osmdroid.views.overlay.OverlayItem;
import org.osmdroid.views.overlay.mylocation.GpsMyLocationProvider;
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay;

import java.util.ArrayList;

public class FastFoodActivity extends Activity {

    MyLocationNewOverlay mLocationOverlay=null;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);
        //important! set your user agent to prevent getting banned from the osm servers
        org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants.setUserAgentValue(BuildConfig.APPLICATION_ID);

        MapView map = (MapView) findViewById(R.id.fast_food_map);

        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);

        IMapController mapController = map.getController();
        mapController.setZoom(2);

        //my location
        this.mLocationOverlay = new MyLocationNewOverlay(getApplicationContext(), new GpsMyLocationProvider(getApplicationContext()),map);
        map.getOverlays().add(this.mLocationOverlay);


        GeoPoint startPoint = new GeoPoint(48.8583, 2.2944);
        mapController.setCenter(startPoint);

        //your items
        ArrayList<OverlayItem> items = new ArrayList<OverlayItem>();
        items.add(new OverlayItem("Titel","Description", new GeoPoint(38.883333, -77.016667))); // Lat/Lon decimal degrees
        items.add(new OverlayItem("Titel 2","Description 2", new GeoPoint(39.916667, 116.383333)));

        DefaultResourceProxyImpl mResourceProxy = new DefaultResourceProxyImpl(getApplicationContext());

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

    }
}
