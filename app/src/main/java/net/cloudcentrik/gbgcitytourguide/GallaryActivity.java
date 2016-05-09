package net.cloudcentrik.gbgcitytourguide;

import java.util.ArrayList;
import android.content.Intent;
import android.os.Bundle;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class GallaryActivity extends AppCompatActivity {
    private GridView gridView;
    private GallaryViewAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallary);

        gridView = (GridView) findViewById(R.id.gridView);
        gridAdapter = new GallaryViewAdapter(this, R.layout.gallary_item_layout, getData());
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                GallaryImage item = (GallaryImage) parent.getItemAtPosition(position);

                //Create intent
                Intent intent = new Intent(GallaryActivity.this, DetailsGallaryActivity.class);
                intent.putExtra("title", item.getTitle());
                intent.putExtra("image", item.getImage());

                //Start details activity
                startActivity(intent);
            }
        });
    }

    /**
     * Prepare  data for gridview
     */
    private ArrayList<GallaryImage> getData() {
        final ArrayList<GallaryImage> imageItems = new ArrayList<>();
        TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);
        for (int i = 0; i < imgs.length(); i++) {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
            imageItems.add(new GallaryImage(bitmap, "Image#" + i));
        }
        return imageItems;
    }
}
