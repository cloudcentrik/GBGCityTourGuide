package net.cloudcentrik.gbgcitytourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BaseGalleryFragment extends Fragment {

    private ImageView galleryImage;
    private String galleryImageId;

    public static BaseGalleryFragment newInstance(String imageId) {
        BaseGalleryFragment fragment = new BaseGalleryFragment();
        Bundle args = new Bundle();
        args.putString("GALLERY", imageId);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        this.galleryImageId = getArguments().getString("GALLERY", "");

        galleryImage=(ImageView) rootView.findViewById(R.id.image_gallery);
        galleryImage.setScaleType(ImageView.ScaleType.CENTER_CROP);

        this.setGalleryImage();


        return rootView;
    }

    private void setGalleryImage(){

                galleryImage.setImageResource(this.convertStringToId(this.galleryImageId));

    }

    private int convertStringToId(String id){
        Context context=getActivity().getApplicationContext();
        int resID = context.getResources().getIdentifier(id, "drawable", context.getPackageName());
        return resID;
    }

}
