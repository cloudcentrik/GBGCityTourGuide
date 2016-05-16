package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class HistoricalPlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_place);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("GBG Historical Places");


        // btn_AlvsborgCastleHPActivity
        final Button btn_Alvsborg = (Button) findViewById(R.id.gbg_btn_historicalplace1);
        btn_Alvsborg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HistoricalPlaceActivity.this, AlvsborgCastleHPActivity.class);
                startActivity(intent);


            }
        });

        /*
        // btn GustafAdlofsSquareHPActivity
        final Button btn_Gustaf = (Button) findViewById(R.id.gbg_btn_historicalplace2);
        btn_Gustaf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HistoricalPlaceActivity.this, GustafAdlofsSquareHPActivity.class);
                startActivity(intent);


            }
        });   */

        // East India Company btn
        final Button button = (Button) findViewById(R.id.gbg_btn_historicalplace3);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HistoricalPlaceActivity.this, EastIndiaCompanyHPActivity.class);
                startActivity(intent);


            }
        });


        //CarlstenFortHPActivity btn
        final Button btn_CarlstenF = (Button) findViewById(R.id.gbg_btn_historicalplace4);
        btn_CarlstenF.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HistoricalPlaceActivity.this, CarlstenFortHPActivity.class);
                startActivity(intent);


            }
        });

        /*

        final Button btn_SKronan = (Button) findViewById(R.id.gbg_btn_historicalplace5);
        btn_SKronan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(HistoricalPlaceActivity.this, CarlstenFortHPActivity.class);
                startActivity(intent);


            }
        });   */
    }
}
