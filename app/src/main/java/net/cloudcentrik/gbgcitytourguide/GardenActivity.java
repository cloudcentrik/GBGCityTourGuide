package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class GardenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garden);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Garden");

        // botanical garden
        final Button btnBotanicalGarden = (Button) findViewById(R.id.btn_botanical_garden);
        btnBotanicalGarden.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(GardenActivity.this, BotanicalGardenActivity.class);
                startActivity(intent);


            }
        });


        // TradgardsforeningenActivity
        final Button btnTradgardsforeningen = (Button) findViewById(R.id.btn_tradgardsforeningen);
        btnTradgardsforeningen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(GardenActivity.this, TradgardsforeningenActivity.class);
                startActivity(intent);


            }
        });


        /*
        // Roro Island
        final Button buttonRoro = (Button) findViewById(R.id.btn_Rörö_island);
        buttonRoro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(IslandActivity.this, RoroIslandActivity.class);
                startActivity(intent);


            }
        });

        // styrso Island
        final Button buttonStyrsoIsland = (Button) findViewById(R.id.btn_styrsö_island);
        buttonStyrsoIsland.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(IslandActivity.this, StyrsoIslandActivity.class);
                startActivity(intent);


            }
        });
*/

    }
}
