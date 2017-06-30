package com.bignerdranch.android.criminalintent;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class ImageViewFragment extends DialogFragment {
    private static final String ARG_PHOTO = "photo";

    private ImageView mPhotoView;

    public static ImageViewFragment newInstance(String photoPath) {
        Bundle args = new Bundle();
        args.putString(ARG_PHOTO, photoPath);

        ImageViewFragment fragment = new ImageViewFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String photoPath = getArguments().getString(ARG_PHOTO);

        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.dialog_image, null);

        mPhotoView = (ImageView) v.findViewById(R.id.photo_zoom);
        Bitmap bitmap = PictureUtils.getScaledBitmap(photoPath, getActivity());
        mPhotoView.setImageBitmap(bitmap);

        return new AlertDialog.Builder(getActivity())
                .setView(v).create();
    }
}
