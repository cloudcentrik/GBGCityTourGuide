package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class TouristSpotsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_spots);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Tourist Spots");


        // Historical place button
        final Button historicalPlaceButton = (Button) findViewById(R.id.btn_historical_place);
        historicalPlaceButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(TouristSpotsActivity.this, HistoricalPlaceActivity.class);
                startActivity(intent);


            }
        });

        // Garden Button
        final Button gardenButton = (Button) findViewById(R.id.btn_garden);
        gardenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(TouristSpotsActivity.this, GardenActivity.class);
                startActivity(intent);


            }
        });

        // Island button
        final Button islandButton = (Button) findViewById(R.id.btn_island);
        islandButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(TouristSpotsActivity.this, IslandActivity.class);
                startActivity(intent);


            }
        });


        //Mesuem Button
        final Button mesuemButton = (Button) findViewById(R.id.btn_museum);
        mesuemButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(TouristSpotsActivity.this, MuseumActivity.class);
                startActivity(intent);

            }
        });

        /*

        final Button btn_SKronan = (Button) findViewById(R.id.gbg_btn_historicalplace5);
        btn_SKronan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HistoricalPlaceActivity.this, CarlstenFortHPActivity.class);
                startActivity(intent);


            }
        });   */
    }
}
