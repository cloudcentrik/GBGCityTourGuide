package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class IslandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_island);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Islands");

        // vrango Island
        final Button buttonVrangoIsland = (Button) findViewById(R.id.btn_vrango_island);
        buttonVrangoIsland.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(IslandActivity.this, VrangoIslandActivity.class);
                startActivity(intent);


            }
        });

        // vinga Island
        final Button buttonVingaIsland = (Button) findViewById(R.id.btn_vinga_island);
        buttonVingaIsland.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(IslandActivity.this, VingaIslandActivity.class);
                startActivity(intent);


            }
        });

        /*// vrango Island
        final Button button = (Button) findViewById(R.id.btn_vrango_island);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
               *//* Intent intent = new Intent(IslandActivity.this, VrangoIslandActivity.class);
                startActivity(intent);*//*


            }
        });

        // vrango Island
        final Button button = (Button) findViewById(R.id.btn_vrango_island);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                *//*Intent intent = new Intent(IslandActivity.this, VrangoIslandActivity.class);
                startActivity(intent);*//*


            }
        });

        // vrango Island
        final Button button = (Button) findViewById(R.id.btn_vrango_island);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                *//*Intent intent = new Intent(IslandActivity.this, VrangoIslandActivity.class);
                startActivity(intent);*//*


            }
        });*/


    }
}