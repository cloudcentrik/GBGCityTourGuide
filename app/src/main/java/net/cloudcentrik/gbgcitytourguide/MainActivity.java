package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sample_one);

        // Tourist spots button
        final Button buttonTouristSpot = (Button) findViewById(R.id.gbg_btn_touristspots);
        buttonTouristSpot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent2 = new Intent(MainActivity.this, TouristSpotsActivity.class);
                startActivity(intent2);

            }
        });

        // shoping center button
        final Button btnShoppingCentre = (Button) findViewById(R.id.gbg_btn_shoping_center);
        btnShoppingCentre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent3 = new Intent(MainActivity.this, ShoppingCentreActivity.class);
                startActivity(intent3);



            }
        });


        // Btn resturent
        final Button buttonResturent = (Button) findViewById(R.id.gbg_btn_restaurent);
        buttonResturent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent4 = new Intent(MainActivity.this, ResturentActivity.class);
                startActivity(intent4);


            }
        });

        // Btn hotel
        final Button buttonHotel = (Button) findViewById(R.id.gbg_btn_hotel);
        buttonHotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent4 = new Intent(MainActivity.this, HotelActivityNew.class);
                startActivity(intent4);
            }
        });

        // Btn infocenter
        final Button buttoninfocenter = (Button) findViewById(R.id.gbg_btn_info_center);
        buttoninfocenter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent5 = new Intent(MainActivity.this, InfoCenterActivity.class);
                startActivity(intent5);


            }
        });
           //
        final Button travelinfobutton = (Button) findViewById(R.id.gbg_btn_travel_info);
        travelinfobutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent6 = new Intent(MainActivity.this, TravelInfoActivity.class);
                startActivity(intent6);


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
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
                Intent restaurant = new Intent(this,ResturentActivity.class);
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
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
