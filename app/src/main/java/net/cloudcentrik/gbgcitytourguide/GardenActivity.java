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

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Garden");

        // vrango Island
        final Button buttonVrangoIsland = (Button) findViewById(R.id.btn_garden1);
        buttonVrangoIsland.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(GardenActivity.this, BaseTestActivity.class);
                startActivity(intent);


            }
        });
        /*
        // vinga Island
        final Button buttonVingaIsland = (Button) findViewById(R.id.btn_vinga_island);
        buttonVingaIsland.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(IslandActivity.this, VingaIslandActivity.class);
                startActivity(intent);


            }
        });

        // Hönö Island
        final Button buttonHohoIsland = (Button) findViewById(R.id.btn_hönö_island);
        buttonHohoIsland.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(IslandActivity.this, HonoIslandActivity.class);
                startActivity(intent);


            }
        });



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
