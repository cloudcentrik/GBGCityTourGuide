package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ParkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Lakes");

        // Lisaberg park
        final Button buttonDelsjonLake = (Button) findViewById(R.id.btn_park_lisabery);
        buttonDelsjonLake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(ParkActivity.this, LisabergParkActivity.class);
                startActivity(intent);


            }
        });

        // Slottsskogen park
        final Button buttonBerjsonLake = (Button) findViewById(R.id.btn_park_Slottsskogen);
        buttonBerjsonLake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(ParkActivity.this, SlotsskogenParkActivity.class);
                startActivity(intent);


            }
        });

        // Lindholmen science park
        final Button buttonHarlandaLake = (Button) findViewById(R.id.btn_park_lindholmen);
        buttonHarlandaLake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(ParkActivity.this, LindholmenParkActivity.class);
                startActivity(intent);


            }
        });

    }
}
