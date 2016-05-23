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
        setContentView(R.layout.activity_hotel);

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

        // avalon vanila
        final Button buttonVanilaHotel = (Button) findViewById(R.id.btn_hotel_vanila);
        buttonVanilaHotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HotelActivity.this, VanilaHotelActivity.class);
                startActivity(intent);


            }
        });

    }
}
