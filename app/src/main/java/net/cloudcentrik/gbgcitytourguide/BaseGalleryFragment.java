package net.cloudcentrik.gbgcitytourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BaseGalleryFragment extends Fragment {

    private ImageView galleryImage1,galleryImage2,galleryImage3;
    private String galleryImageId;
    private String[] images;

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
        this.images= TextUtils.split(this.galleryImageId," ");

        galleryImage1=(ImageView) rootView.findViewById(R.id.image_gallery1);
        //galleryImage1.setScaleType(ImageView.ScaleType.FIT_XY);

        galleryImage2=(ImageView) rootView.findViewById(R.id.image_gallery2);
        //galleryImage2.setScaleType(ImageView.ScaleType.FIT_CENTER);

        galleryImage3=(ImageView) rootView.findViewById(R.id.image_gallery3);
        //galleryImage3.setScaleType(ImageView.ScaleType.FIT_CENTER);

        this.setGalleryImage();


        return rootView;
    }

    private void setGalleryImage(){

        if(this.images.length>2){
            galleryImage1.setImageResource(this.convertStringToId(this.images[0]));
            galleryImage2.setImageResource(this.convertStringToId(this.images[1]));
            galleryImage3.setImageResource(this.convertStringToId(this.images[2]));

        }

    }

    private int convertStringToId(String id){
        Context context=getActivity().getApplicationContext();
        int resID = context.getResources().getIdentifier(id, "drawable", context.getPackageName());
        return resID;
    }

}
