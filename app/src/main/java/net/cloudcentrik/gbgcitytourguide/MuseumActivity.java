package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Gothenburg Museum");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        topToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


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


