package com.example.acer.newtabview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    String[] strings;
    int[] ints;
    public MyAdapter(Context context, String[] names, int[] images) {
        this.context=context;
        this.strings=names;
        this.ints=images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.design,parent,false);
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       holder.image.setImageResource(ints[position]);
       holder.tv.setText(strings[position]);


    }

    @Override
    public int getItemCount() {
        return strings.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView tv;
        public MyViewHolder(View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.imageview);
            tv=itemView.findViewById(R.id.textview);
        }
    }
}
