package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Gothenburg Museum");

        // Maritiman Museum
        final Button btnMaritimanMuseum = (Button) findViewById(R.id.gbg_btn_maritiman_museum);
        btnMaritimanMuseum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(MuseumActivity.this, MaritimanMuseumActivity.class);
                startActivity(intent);


            }
        });

        //NaturalHistoryMuseum
        final Button btnNaturalHistoryMuseum = (Button) findViewById(R.id.gbg_btn_natural_history_museum);
        btnNaturalHistoryMuseum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(MuseumActivity.this, NaturalHistoryMuseumActivity.class);
                startActivity(intent);


            }
        });

        //CityMuseumActivity
        final Button btnCityMuseum = (Button) findViewById(R.id.gbg_btn_city_museum);
        btnCityMuseum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(MuseumActivity.this, CityMuseumActivity.class);
                startActivity(intent);
            }
        });

        //Volvo Museum
        final Button btnVolvo_Museum = (Button) findViewById(R.id.gbg_btn_volvo_museum);
        btnVolvo_Museum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(MuseumActivity.this, VolvoMuseumActivity.class);
                startActivity(intent);
            }
        });

        //Museum of World Culture
        final Button btnWorldCulture_Museum = (Button) findViewById(R.id.gbg_btn_world_culture_museum);
        btnWorldCulture_Museum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(MuseumActivity.this, WorldCultureMuseumActivity.class);
                startActivity(intent);
            }
        });


        //Museum of Art
        final Button btnMuseum_of_Art = (Button) findViewById(R.id.gbg_btn_museum_of_art);
        btnMuseum_of_Art.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(MuseumActivity.this, MuseumOfArtActivity.class);
                startActivity(intent);
            }
        });

        //Universeum
        final Button btnUniverseum = (Button) findViewById(R.id.gbg_btn_universeum);
        btnUniverseum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(MuseumActivity.this, UniverseumActivity.class);
                startActivity(intent);
            }
        });
    }
}


