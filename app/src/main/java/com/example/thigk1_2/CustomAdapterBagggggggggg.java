package com.example.thigk1_2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapterBagggggggggg extends RecyclerView.Adapter<CustomAdapterBagggggggggg.ViewHolder> {
    ArrayList<Chair> mChairs;

    public CustomAdapterBagggggggggg(ArrayList<Chair> chairs) {
        mChairs = chairs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bag_item,parent,false);
        return new ViewHolder(view);
    }



    @Override
    public int getItemCount() {
        return mChairs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgChair_bag;
        TextView tvName_bag,tvPrice_bag,tvSo_bag;
        ImageButton imgbtn_plusbag,imgbtn_minusbag;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgChair_bag = itemView.findViewById(R.id.imgChair_bag);
            tvName_bag = itemView.findViewById(R.id.tvNamebag);
            tvPrice_bag = itemView.findViewById(R.id.tvPrice_bag);
            tvSo_bag = itemView.findViewById(R.id.tvSobag);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Chair chair = mChairs.get(position);
        holder.imgChair_bag.setImageResource(chair.getAnh());
        holder.tvPrice_bag.setText(chair.getPrice()+"");
        holder.tvName_bag.setText(chair.getName());

    }
}
