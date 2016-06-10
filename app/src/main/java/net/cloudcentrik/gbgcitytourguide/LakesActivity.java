package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class LakesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lakes);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Lakes");

        // Delsjon Lake
        final Button buttonDelsjonLake = (Button) findViewById(R.id.btn_lake_delsjon);
        buttonDelsjonLake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(LakesActivity.this, DelsjonLakeActivity.class);
                startActivity(intent);


            }
        });

        // Bersjon Lake
        final Button buttonBerjsonLake = (Button) findViewById(R.id.btn_lake_Bergsjön);
        buttonBerjsonLake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(LakesActivity.this, BerjsonLakeActivity.class);
                startActivity(intent);


            }
        });

        // Harlanda lake
        final Button buttonHarlandaLake = (Button) findViewById(R.id.btn_lake_Harlanda);
        buttonHarlandaLake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(LakesActivity.this, HarlandaLakeActivity.class);
                startActivity(intent);


            }
        });



        // Suresjon Lake
        final Button buttonSuresjonLake = (Button) findViewById(R.id.btn_lake_Surtesjon);
        buttonSuresjonLake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(LakesActivity.this, SurtesjonLakeActivity.class);
                startActivity(intent);


            }
        });

        // svartemosse lake
        final Button buttonSvarteMosse = (Button) findViewById(R.id.btn_lake_svartemosse);
        buttonSvarteMosse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(LakesActivity.this, SvarteMosseLakeActivity.class);
                startActivity(intent);


            }
        });


    }
}
