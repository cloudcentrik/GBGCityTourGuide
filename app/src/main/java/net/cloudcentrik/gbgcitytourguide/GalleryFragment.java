package net.cloudcentrik.gbgcitytourguide;

import android.support.v4.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class GalleryFragment extends Fragment {

    private ImageView galleryImage;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        galleryImage=(ImageView) rootView.findViewById(R.id.image_gallery);

        //get activity name
        String strActivity = getActivity().toString();
        this.setGalleryImage(strActivity);


        return rootView;
    }

    private void setGalleryImage(String activity){

        switch (activity) {
            case "MaritimanMuseumActivity":
                galleryImage.setImageResource(R.drawable.gothenburg_stad_museum);
                break;
            case "EastIndiaCompanyHPActivity":
                galleryImage.setImageResource(R.drawable.gothenburg_stad_museum);
                break;
            case "VingaIslandActivity":
                galleryImage.setImageResource(R.drawable.vinga_island);

                break;
            default:
                galleryImage.setImageResource(R.drawable.gothenburg_city);
                break;
        }

    }

}
