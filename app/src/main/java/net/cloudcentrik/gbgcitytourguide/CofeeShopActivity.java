package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CofeeShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cofeeshop);



        // Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Hotel ");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        // condeco
        final Button buttonCondecoCofeeShop = (Button) findViewById(R.id.btn_cofee_shop_condeco);
        buttonCondecoCofeeShop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(CofeeShopActivity.this, CondecoCofeeShopActivity.class); //need to be update
                startActivity(intent);


            }
        });

        // Espresso house
        final Button buttonEspressoHouseCofeeShop = (Button) findViewById(R.id.btn_cofee_shop_espresso_house);
        buttonEspressoHouseCofeeShop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(CofeeShopActivity.this, EspressoHouseCofeeShopActivity.class); //need to be update
                startActivity(intent);


            }
        });

        // Le pain francis
        final Button buttonLepainfrancisCofeeShop = (Button) findViewById(R.id.btn_cofee_shop_lepainfrancais);
        buttonLepainfrancisCofeeShop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(CofeeShopActivity.this, LepainfrancisCofeeShopActivity.class); //need to be update
                startActivity(intent);


            }
        });

        // starbucks
        final Button buttonStarbucksCofeeShop = (Button) findViewById(R.id.btn_cofee_shop_starbucks);
        buttonStarbucksCofeeShop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(CofeeShopActivity.this, StarbucksCofeeShopActivity.class); //need to be update
                startActivity(intent);


            }
        });

        // Da mattio
        final Button buttonDamattioCofeeShop = (Button) findViewById(R.id.btn_cofee_shop_damatteo);
        buttonDamattioCofeeShop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(CofeeShopActivity.this, DamattioCofeeShopActivity.class); //need to be update
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
