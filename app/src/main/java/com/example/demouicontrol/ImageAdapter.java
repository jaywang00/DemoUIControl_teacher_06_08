package com.example.demouicontrol;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    int[] imageResIds = {R.drawable.note, R.drawable.photos,
            R.drawable.contacts,R.drawable.calculator,R.drawable.backup};

    Context mCtx;
    ImageAdapter(Context context){
        mCtx = context;
    }

    @Override
    public int getCount() {
        return imageResIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(mCtx);
        imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        imageView.setImageResource(imageResIds[position]);

        return imageView;
    }
}
