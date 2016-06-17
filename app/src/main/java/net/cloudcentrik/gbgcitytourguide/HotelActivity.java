package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_sample_one);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Hotel");

        // avalon hotel
        final Button buttonAvalonHotel = (Button) findViewById(R.id.btn_hotel_avalon);
        buttonAvalonHotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HotelActivity.this, AvalonHotelActivity.class);
                startActivity(intent);

            }
        });

        // Vandrarhem hotel
        final Button vandrarHemHotel = (Button) findViewById(R.id.btn_hotel_vandrarhem);
        vandrarHemHotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HotelActivity.this, VandrarHemHotelActivity.class);
                startActivity(intent);

            }
        });

        // vanila hotel
        final Button buttonVanilaHotel = (Button) findViewById(R.id.btn_hotel_vanila);
        buttonVanilaHotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HotelActivity.this, VanilaHotelActivity.class);
                startActivity(intent);


            }
        });

        // Scandic Europa hotel
        final Button scandicEuropaHotel = (Button) findViewById(R.id.btn_hotel_scandiceuropa);
        scandicEuropaHotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HotelActivity.this, ScandicEuropaHotelActivity.class);
                startActivity(intent);


            }
        });

        // Radisson Blue hotel
        final Button radissonBlueHotel = (Button) findViewById(R.id.btn_hotel_radissonblue);
        radissonBlueHotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HotelActivity.this, RadissonBlueHotelActivity.class);
                startActivity(intent);


            }
        });

    }
}
