package net.cloudcentrik.gbgcitytourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class GalleryFragment extends Fragment {

    private ImageView galleryImage;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        galleryImage=(ImageView) rootView.findViewById(R.id.image_gallery1);

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
                galleryImage.setImageResource(R.drawable.east_india_company_house);
                break;
            case "AlvsborgCastleHPActivity":
                galleryImage.setImageResource(R.drawable.avsborgcast);
                break;
            case "CarlstenFortHPActivity":
                galleryImage.setImageResource(R.drawable.carlstenfort);
                break;
            case "VrangoIslandActivity":
                galleryImage.setImageResource(R.drawable.vrango_island);
                break;
            case "VingaIslandActivity":
                galleryImage.setImageResource(R.drawable.vinga_island);
                break;
            case "HonoIslandActivity":
                galleryImage.setImageResource(R.drawable.hono_island);
                break;
            case "RoroIslandActivity":
                galleryImage.setImageResource(R.drawable.roro_island);
                break;
            case "StyrsoIslandActivity":
                galleryImage.setImageResource(R.drawable.styrso_island);
                break;
            case "NordstanSCActivity":
                galleryImage.setImageResource(R.drawable.nordstan);
                break;
            default:
                galleryImage.setImageResource(R.drawable.gothenburg_city);
                break;
        }

    }

}
