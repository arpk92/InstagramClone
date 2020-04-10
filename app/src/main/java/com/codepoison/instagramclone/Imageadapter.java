package com.codepoison.instagramclone;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.codepoison.instagramclone.ui.profile.Profile;

public class Imageadapter extends BaseAdapter


{

     public Context context;

     public  int [] imagearry ={

      R.drawable.ar,R.drawable.ar2,R.drawable.girl, R.drawable.girl1, R.drawable.girl3, R.drawable.girl5,
             R.drawable.ar,R.drawable.ar2,R.drawable.girl, R.drawable.girl1, R.drawable.girl3, R.drawable.girl5,
             R.drawable.ar,R.drawable.ar2,R.drawable.girl, R.drawable.girl1, R.drawable.girl3, R.drawable.girl5,

     };

    public Imageadapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return imagearry.length;
    }

    @Override
    public Object getItem(int position) {
        return imagearry[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(context);
        imageView.setImageResource(imagearry[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(400,400));



        return imageView;
    }
}
