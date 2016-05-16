package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class ResturentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturent);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("GBG Resturent");

        // olearys resturent btn
        final Button button = (Button) findViewById(R.id.gbg_btn_oleresrys_restaurent);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(ResturentActivity.this, OlearysResturentActivity.class);
                startActivity(intent);


            }
        });

        final Button btn_Fiskekrogen = (Button) findViewById(R.id.gbg_btn_Fiskekrogen);
        btn_Fiskekrogen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intentFisk = new Intent(ResturentActivity.this, Fiskekrogen_RestaurantActivity.class);
                startActivity(intentFisk);


            }
        });

        // hardrockcafe  btn
        final Button hrcbutton = (Button) findViewById(R.id.gbg_btn_hardrockcafe);
        hrcbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(ResturentActivity.this, HardRockCafeActivity.class);
                startActivity(intent);


            }
        });


    }
}
