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

public class CustomAdapterChair extends RecyclerView.Adapter<CustomAdapterChair.ViewHolder> {
    ArrayList<Chair> mChairs;
    OnClickListener listener;

    public CustomAdapterChair(ArrayList<Chair> chairs,OnClickListener listener) {
        mChairs = chairs;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chair_item,parent,false);
        return new ViewHolder(view);
    }



    @Override
    public int getItemCount() {
        return mChairs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Chair mChair;
        ImageView imgChair;
        TextView tvPrice,tvName;
        ImageButton imgbtn_plus;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgChair = itemView.findViewById(R.id.imgChair);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvName = itemView.findViewById(R.id.tvName);
            imgbtn_plus = itemView.findViewById(R.id.imgbtn_plus);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.itemClick(mChair);
                }
            });
        }
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Chair chair = mChairs.get(position);
        holder.mChair = chair;
        holder.imgChair.setImageResource(chair.getAnh());
        holder.imgbtn_plus.setImageResource(chair.getAnhCong());
        holder.tvPrice.setText(chair.getPrice()+"");
        holder.tvName.setText(chair.getName());
    }
}
