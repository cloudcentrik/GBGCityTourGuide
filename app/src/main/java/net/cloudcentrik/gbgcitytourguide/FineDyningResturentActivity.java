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


public class FineDyningResturentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fine_dyning_resturent);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Restaurant");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        topToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        // olearys resturent btn
        final Button button = (Button) findViewById(R.id.gbg_btn_oleresrys_restaurent);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(FineDyningResturentActivity.this, OlearysResturentActivity.class);
                startActivity(intent);


            }
        });

        final Button btn_Fiskekrogen = (Button) findViewById(R.id.gbg_btn_Fiskekrogen);
        btn_Fiskekrogen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intentFisk = new Intent(FineDyningResturentActivity.this, Fiskekrogen_RestaurantActivity.class);
                startActivity(intentFisk);


            }
        });

        // hardrockcafe  btn
        final Button hrcbutton = (Button) findViewById(R.id.gbg_btn_hardrockcafe);
        hrcbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(FineDyningResturentActivity.this, HardRockCafeActivity.class);
                startActivity(intent);


            }
        });

        // johnScott's btn
        final Button johnScottbtn = (Button) findViewById(R.id.gbg_btn_johnScottsRestaurant);
        johnScottbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(FineDyningResturentActivity.this, JohnScottsRestaurantActivity.class);
                startActivity(intent);


            }
        });

        // Joe Ferellis Restaurant Activity btn
        final Button joeFerellisbtn = (Button) findViewById(R.id.gbg_btn_joeFerellis);
        joeFerellisbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(FineDyningResturentActivity.this, JoeFerellisRestaurantActivity.class);
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
