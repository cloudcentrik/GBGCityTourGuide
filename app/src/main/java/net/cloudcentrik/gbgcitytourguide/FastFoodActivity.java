package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import android.Manifest;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class FastFoodActivity extends AppCompatActivity implements OnMapReadyCallback,ActivityCompat.OnRequestPermissionsResultCallback {

    private GoogleMap mMap;
    private Marker marker1;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;
    private boolean mPermissionDenied = false;


    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Fast Food");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        topToolBar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View v) {
                onBackPressed();
            }
        });

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

        LatLng subwayCentralstation = new LatLng(57.739627,10.507651);
        mMap.addMarker(new MarkerOptions()
                .position(subwayCentralstation)
                .title("Subway")
                .snippet("Nils Ericsonplatsen")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );

        LatLng subwayKunsportsplatsen = new LatLng(57.704994, 11.969941);
        mMap.addMarker(new MarkerOptions()
                .position(subwayKunsportsplatsen)
                .title("Subway")
                .snippet("Ostra Larmgatan 15")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );

        LatLng subwayLilabomen = new LatLng(57.709960, 11.968092);
        mMap.addMarker(new MarkerOptions()
                .position(subwayLilabomen)
                .title("Subway")
                .snippet("Lilla Kladpressaregatan 7")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );



        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(burgerking, 14));


        mMap.setInfoWindowAdapter(new CustomInfoWindowAdapter());

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(macdolandNordstan, 12));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);

        enableMyLocation();





        /*final LatLng MELBOURNE = new LatLng(-37.813, 144.962);
        Marker melbourne = mMap.addMarker(new MarkerOptions()
                .position(MELBOURNE)
                .title("Melbourne")
                .snippet("Population: 4,137,400")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_location_on_black_18dp)));*/

    }

    private void enableMyLocation() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            // Permission to access the location is missing.
            PermissionUtils.requestPermission(this, LOCATION_PERMISSION_REQUEST_CODE,
                    Manifest.permission.ACCESS_FINE_LOCATION, true);
        } else if (mMap != null) {
            // Access to the location has been granted to the app.
            mMap.setMyLocationEnabled(true);
        }
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
            }else if(marker.getTitle().equals("Burgerking")){
                ((ImageView) view.findViewById(R.id.fast_food_image)).setImageResource(R.drawable.burgerking);
            }else{
                ((ImageView) view.findViewById(R.id.fast_food_image)).setImageResource(R.drawable.subway);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_infocenter:
                Intent infoCenter = new Intent(this,InfoCenterActivity.class);
                startActivity(infoCenter);
                return true;
            case R.id.action_hotel:
                Intent hotel = new Intent(this,HotelActivity.class);
                startActivity( hotel);
                return true;
            case R.id.action_restuarent:
                Intent restaurant = new Intent(this,FineDyningResturentActivity.class);
                startActivity(restaurant);
                return true;
            case R.id.action_tourist_spots:
                Intent touristSpot = new Intent(this,TouristSpotsActivity.class);
                startActivity(touristSpot);
                return true;

            case R.id.action_travelinfo:
                Intent travelInfo = new Intent(this,TravelInfoActivity.class);
                startActivity(travelInfo);
                return true;
            case R.id.action_shoping_center:
                Intent shopingCenter = new Intent(this,ShoppingCentreActivity.class);
                startActivity(shopingCenter);
                return true;
            case R.id.action_home:
                Intent mainScreen = new Intent(this,MainActivity.class);
                startActivity(mainScreen);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
