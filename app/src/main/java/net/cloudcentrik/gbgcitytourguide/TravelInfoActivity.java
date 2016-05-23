package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class TravelInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travelinfo);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("GBG Travel Info");

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

       /*

       // olearys resturent btn
        final Button taxibutton = (Button) findViewById(R.id.gbg_btn_taxi);
        taxibutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(TravelInfoActivity.this, TaxiTravelActivity.class);
                startActivity(intent);


            }
        });

        final Button btn_Fiskekrogen = (Button) findViewById(R.id.gbg_btn_bus);
        btn_Fiskekrogen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intentbus = new Intent(TravelInfoActivity.this, BusTravelActivity.class);
                startActivity(intentbus);


            }
        });

        // hardrockcafe  btn
        final Button airbutton = (Button) findViewById(R.id.gbg_btn_air);
        airbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intentair = new Intent(TravelInfoActivity.this, AirTravelActivity.class);
                startActivity(intentair);


            }
        });

        // hardrockcafe  btn
        final Button boatbutton = (Button) findViewById(R.id.gbg_btn_boat);
        airbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intentboat = new Intent(TravelInfoActivity.this, BoatTravelActivity.class);
                startActivity(intentboat);


            }
        });   */


    }
}
