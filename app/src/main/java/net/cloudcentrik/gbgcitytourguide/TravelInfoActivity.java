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

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("GBG Travel Info");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

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
}
