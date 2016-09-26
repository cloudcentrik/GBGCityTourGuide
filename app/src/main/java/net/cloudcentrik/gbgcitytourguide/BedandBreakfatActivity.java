package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
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

        // avalon hotel
        final Button buttonBedandBreakfast_1 = (Button) findViewById(R.id.btn_bed_and_breakfast_1);
        buttonBedandBreakfast_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(BedandBreakfatActivity.this, VandrarHemHotelActivity.class);   // Change  here
                startActivity(intent);

            }
        });

        /*
        // Vandrarhem hotel
        final Button vandrarHemHotel = (Button) findViewById(R.id.btn_hotel_vandrarhem);
        vandrarHemHotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HotelActivity.this, VandrarHemHotelActivity.class);
                startActivity(intent);

            }
        });

        // vanila hotel
        final Button buttonVanilaHotel = (Button) findViewById(R.id.btn_hotel_vanila);
        buttonVanilaHotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HotelActivity.this, VanilaHotelActivity.class);
                startActivity(intent);


            }
        });

        // Scandic Europa hotel
        final Button scandicEuropaHotel = (Button) findViewById(R.id.btn_hotel_scandiceuropa);
        scandicEuropaHotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HotelActivity.this, ScandicEuropaHotelActivity.class);
                startActivity(intent);


            }
        });

        // Radisson Blue hotel
        final Button radissonBlueHotel = (Button) findViewById(R.id.btn_hotel_radissonblue);
        radissonBlueHotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HotelActivity.this, RadissonBlueHotelActivity.class);
                startActivity(intent);


            }
        });
        */

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
                Intent restaurant = new Intent(this, ResturentActivity.class);
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

