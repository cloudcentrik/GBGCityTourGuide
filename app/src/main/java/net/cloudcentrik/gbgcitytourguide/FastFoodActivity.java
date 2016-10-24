package net.cloudcentrik.gbgcitytourguide;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class FastFoodActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker marker1;


    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



        //Macdoland location
        LatLng macdolandNordstan = new LatLng(57.70755,11.96961);
        mMap.addMarker(new MarkerOptions()
                .position(macdolandNordstan)
                .title("Macdoland")
                .snippet("Nordstan")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
        );

        LatLng macdolandKunsportplatsen = new LatLng(57.70454,11.96781);
        mMap.addMarker(new MarkerOptions()
                .position(macdolandKunsportplatsen)
                .title("Macdoland")
                .snippet("Kunsportplatsen")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
        );

        LatLng macdolandAvenyn = new LatLng(57.69938,11.97684);
        mMap.addMarker(new MarkerOptions()
                .position(macdolandAvenyn)
                .title("Macdoland")
                .snippet("Avenyn")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
        );

        LatLng macdolandScandinavium = new LatLng(57.69983,11.98695);
        mMap.addMarker(new MarkerOptions()
                .position(macdolandScandinavium)
                .title("Macdoland")
                .snippet("Scandinavium")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
        );
        LatLng macdolandBackaplan = new LatLng(57.72129,11.95278);
        mMap.addMarker(new MarkerOptions()
                .position(macdolandBackaplan)
                .title("Macdoland")
                .snippet("Backaplan")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
        );

        // Add a burgerking marker
        LatLng burgerkingJarntorget = new LatLng(57.69951650,11.95302110);
        mMap.addMarker(new MarkerOptions()
                .position(burgerkingJarntorget)
                .title("Burgerking")
                .snippet("Jarntorget")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );

        LatLng burgerkingLisaberg = new LatLng(57.69699970,11.99101470);
        mMap.addMarker(new MarkerOptions()
                .position(burgerkingLisaberg)
                .title("Burgerking")
                .snippet("Lisaberg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );

        LatLng burgerkingAvenyn = new LatLng(57.70103560,11.97451620);
        mMap.addMarker(new MarkerOptions()
                .position(burgerkingAvenyn)
                .title("Burgerking")
                .snippet("Avenyn")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );

        LatLng burgerkingCentralstation = new LatLng(57.70936490,11.97207970);
        mMap.addMarker(new MarkerOptions()
                .position(burgerkingCentralstation)
                .title("Burgerking")
                .snippet("Centralstation")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );



        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(burgerking, 14));


        mMap.setInfoWindowAdapter(new CustomInfoWindowAdapter());

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(macdolandNordstan, 12));



        /*final LatLng MELBOURNE = new LatLng(-37.813, 144.962);
        Marker melbourne = mMap.addMarker(new MarkerOptions()
                .position(MELBOURNE)
                .title("Melbourne")
                .snippet("Population: 4,137,400")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_location_on_black_18dp)));*/

    }

    //custom infowindow
    class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

        private final View mWindow;

        private final View mContents;

        CustomInfoWindowAdapter() {
            mWindow = getLayoutInflater().inflate(R.layout.custom_infowindow, null);
            mContents = getLayoutInflater().inflate(R.layout.custom_infowindow, null);
        }

        @Override
        public View getInfoWindow(Marker marker) {

            render(marker, mWindow);
            return mWindow;
        }

        @Override
        public View getInfoContents(Marker marker) {

            render(marker, mContents);
            return mContents;
        }

        private void render(Marker marker, View view) {

            if(marker.getTitle().equals("Macdoland")){
                ((ImageView) view.findViewById(R.id.fast_food_image)).setImageResource(R.drawable.mcdonalds);
            }else{
                ((ImageView) view.findViewById(R.id.fast_food_image)).setImageResource(R.drawable.burgerking);
            }



            String title = marker.getSnippet();
            TextView titleUi = ((TextView) view.findViewById(R.id.fast_food_title));
            if (title != null) {
                // Spannable string allows us to edit the formatting of the text.
                SpannableString titleText = new SpannableString(title);
                titleText.setSpan(new ForegroundColorSpan(Color.RED), 0, titleText.length(), 0);
                titleUi.setText(titleText);
            } else {
                titleUi.setText("");
            }


        }

    }
}
