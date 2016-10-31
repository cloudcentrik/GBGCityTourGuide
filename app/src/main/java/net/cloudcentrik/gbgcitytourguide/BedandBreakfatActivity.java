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
public class BedandBreakfatActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bed_and_breakfast);
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

        // Good Morning Goteborg City
        final Button buttonGoodMorningGoteborgCity = (Button) findViewById(R.id.btn_goodmorning_gbg_city);
        buttonGoodMorningGoteborgCity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(BedandBreakfatActivity.this, GoodMorningGoteborgCityActivity.class);
                startActivity(intent);

            }
        });


        // Le Mat B&B Goteborg City
        final Button btnLeMatBandBGoteborgCity = (Button) findViewById(R.id.btn_le_mat_bandb_goteborg_city);
        btnLeMatBandBGoteborgCity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(BedandBreakfatActivity.this, LeMatBandBGoteborgCityActivity.class);
                startActivity(intent);

            }
        });

        // Ans Bed and Breakfast
        final Button buttonAnsBedandBreakfast = (Button) findViewById(R.id.btn_ans_bedand_breakfast);
        buttonAnsBedandBreakfast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(BedandBreakfatActivity.this, AnsBedandBreakfastActivity.class);
                startActivity(intent);
            }
        });

        // Goteborgs Mini Hotel
        final Button btnGoteborgsMiniHotelActivity = (Button) findViewById(R.id.btn_goteborgs_mini_hotel);
        btnGoteborgsMiniHotelActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(BedandBreakfatActivity.this, GoteborgsMiniHotelActivity.class);
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

