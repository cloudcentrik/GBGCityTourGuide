package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Packard Bell on 2016-09-26.
 */
public class YouthHotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youth_hotels);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        // Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Youth Hotel ");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        // Slottsskogen Youth Hostel
        final Button buttonSlottsskogenYouthHostel = (Button) findViewById(R.id.btn_youth_hostel_1);
        buttonSlottsskogenYouthHostel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(YouthHotelsActivity.this, SlottsskogenYouthHostelActivity.class);
                startActivity(intent);

            }
        });


        // Backpackers Youth Hostel
        final Button btnBackpackersYouthHostel = (Button) findViewById(R.id.btn_backpackers_goteborg);
        btnBackpackersYouthHostel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(YouthHotelsActivity.this, BackpackersYouthHostelActivity.class);
                startActivity(intent);

            }
        });


        // STF Vandrarhem Stigbergsliden
        final Button buttonSTFvandrarhemStigbergsliden = (Button) findViewById(R.id.btn_stf_vandrarhem_stigbergsliden);
        buttonSTFvandrarhemStigbergsliden.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(YouthHotelsActivity.this, STFvandrarhemStigbergslidenActivity.class);
                startActivity(intent);


            }
        });


        // Linneplatsens Hotel and Hostel
        final Button btnLinneplatsensHotelandHostel = (Button) findViewById(R.id.btn_linneplatsens_hotel_and_hostel);
        btnLinneplatsensHotelandHostel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(YouthHotelsActivity.this, LinneplatsensHotelandHostelActivity.class);
                startActivity(intent);


            }
        });


        // Radisson Blue hotel
        final Button btnKvibergsVandrarhem = (Button) findViewById(R.id.btn_kvibergs_hostel_and_cabins);
        btnKvibergsVandrarhem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(YouthHotelsActivity.this, KvibergsVandrarhemActivity.class);
                startActivity(intent);


            }
        });


    }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.main_menu, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle item selection
            switch (item.getItemId()) {
                case R.id.action_infocenter:
                    Intent infoCenter = new Intent(this, InfoCenterActivity.class);
                    startActivity(infoCenter);
                    return true;
                case R.id.action_hotel:
                    Intent hotel = new Intent(this, HotelActivity.class);
                    startActivity(hotel);
                    return true;
                case R.id.action_restuarent:
                    Intent restaurant = new Intent(this, FineDyningResturentActivity.class);
                    startActivity(restaurant);
                    return true;
                case R.id.action_tourist_spots:
                    Intent touristSpot = new Intent(this, TouristSpotsActivity.class);
                    startActivity(touristSpot);
                    return true;

                case R.id.action_travelinfo:
                    Intent travelInfo = new Intent(this, TravelInfoActivity.class);
                    startActivity(travelInfo);
                    return true;
                case R.id.action_shoping_center:
                    Intent shopingCenter = new Intent(this, ShoppingCentreActivity.class);
                    startActivity(shopingCenter);
                    return true;
                case R.id.action_home:
                    Intent mainScreen = new Intent(this, MainActivity.class);
                    startActivity(mainScreen);
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }
    }

