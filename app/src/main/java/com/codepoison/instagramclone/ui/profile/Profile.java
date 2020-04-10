package com.codepoison.instagramclone.ui.profile;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.codepoison.instagramclone.Account_Setting;
import com.codepoison.instagramclone.Imageadapter;
import com.codepoison.instagramclone.R;

public class Profile extends Fragment {

    private ProfileViewModel mViewModel;

    private GridView gridView;
    private ImageView imageView;
    View v;


    public static Profile newInstance() {
        return new Profile();
    }


     @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

         v =  inflater.inflate(R.layout.profile_fragment, container, false);

         gridView = (GridView) v.findViewById(R.id.GridViews);

         gridView.setAdapter(new Imageadapter(getContext()));

         // Image View

         imageView = (ImageView) v.findViewById(R.id.arrowclick);

          // Set On CLick Lisiner

         imageView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(getContext(), Account_Setting.class);
                 startActivity(intent);
             }
         });


         return v;



     }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ProfileViewModel.class);
        // TODO: Use the ViewModel
    }



}
