package net.cloudcentrik.gbgcitytourguide;

/**
 * Created by Johir on 4/18/2016.
 */

import android.graphics.Bitmap;

public class GallaryImage {
    private Bitmap image;
    private String title;

    public GallaryImage(Bitmap image, String title) {
        super();
        this.image = image;
        this.title = title;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

