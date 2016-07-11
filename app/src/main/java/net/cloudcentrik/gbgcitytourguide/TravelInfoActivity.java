package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class TravelInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travelinfo);

                // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("GBG Travel Info");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        topToolBar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick( View v) {
            onBackPressed();
            }
        });

        // airport transport btn
        final Button airporttravelbutton = (Button) findViewById(R.id.gbg_btn_airporttran);
        airporttravelbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(TravelInfoActivity.this, AirportTransportActivity.class);
                startActivity(intent);


            }
        });

        // public transport btn
        final Button publictranbutton = (Button) findViewById(R.id.gbg_btn_publictran);
        publictranbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent1 = new Intent(TravelInfoActivity.this, PublicTransportActivity.class);
                startActivity(intent1);


            }
        });

        // Taxi Button
        final Button buttonTaxi = (Button) findViewById(R.id.gbg_btn_taxi);
        buttonTaxi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(TravelInfoActivity.this, TaxiActivity.class);
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
            case R.id.action_home:
                Intent mainScreen = new Intent(this,MainActivity.class);
                startActivity(mainScreen);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
