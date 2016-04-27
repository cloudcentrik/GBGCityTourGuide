package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                // Toolbar
        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("GBG City Tour Guide");

        final Button button = (Button) findViewById(R.id.gbg_btn_mesuem);


        // BtnMuseum

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(MainActivity.this, MuseumActivity.class);
                startActivity(intent);


            }
        });


        // BtnHistoricalPlace
        final Button buttonHp = (Button) findViewById(R.id.gbg_btn_historical);
        buttonHp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent2 = new Intent(MainActivity.this, HistoricalPlaceActivity.class);
                startActivity(intent2);


            }
        });

        // Btn Island
        final Button buttonIsland = (Button) findViewById(R.id.gbg_btn_island);
        buttonIsland.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent3 = new Intent(MainActivity.this, IslandActivity.class);
                startActivity(intent3);


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_museum) {
            Toast.makeText(MainActivity.this, "Seetings", Toast.LENGTH_LONG).show();

            return true;
        }
        if(id == R.id.action_island){
            Toast.makeText(MainActivity.this, "About", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_info){
            Toast.makeText(MainActivity.this, "information", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);


    }


}
