package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ShoppingCentreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_centre);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Shopping Centres");


        // btn_Nordstan Activity
        final Button btbNordstan = (Button) findViewById(R.id.btn_nordstanSC);
        btbNordstan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(ShoppingCentreActivity.this, NordstanSCActivity.class);
                startActivity(intent);
            }
        });




        // Frölunda Torg shopping center
        final Button btnFrolunda = (Button) findViewById(R.id.btn_frolundaTorgSC);
        btnFrolunda.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 //Perform action on click
                 Intent intent = new Intent(ShoppingCentreActivity.this, FrolundaTorgActivity.class);
                 startActivity(intent);

            }
        });


        // Nordiska Kompaniet Shopping centre
        final Button btnNK = (Button) findViewById(R.id.btn_NORDISKAKOMPANIET_SC);
        btnNK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(ShoppingCentreActivity.this, NordiskaKompanietActivity.class);
                startActivity(intent);


            }
        });
    }
}
