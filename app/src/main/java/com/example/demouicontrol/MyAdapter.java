package com.example.demouicontrol;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    String[] text1 = {"text1","text2","text3","text4","text5"};
    String[] timeAgo = {"1hr ago","2hr ago","3hr ago","4hr ago","5hr ago"};
    int[] imgResIds = {R.drawable.backup,R.drawable.calculator,R.drawable.contacts,R.drawable.photos,R.drawable.note};

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView imageView01;
        public TextView textView01,textView02;
        public ViewHolder(View v) {
            super(v);
            imageView01 = v.findViewById(R.id.imageView01);
            textView01 = v.findViewById(R.id.textView01);
            textView02 = v.findViewById(R.id.textView02);
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cardview, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.imageView01.setImageResource(imgResIds[position]);
        holder.textView01.setText(text1[position]);
        holder.textView02.setText(timeAgo[position]);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return text1.length;
    }
}
