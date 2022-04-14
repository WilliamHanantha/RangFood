package com.example.ptspakaji;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRestoran extends RecyclerView.Adapter<AdapterRestoran.OrangViewHolder> {

    private ArrayList<ModelRestoran> datalist;
    private Context mContext;

    public AdapterRestoran(ArrayList<ModelRestoran> datalist) {this.datalist = datalist;}

    @Override
    public AdapterRestoran.OrangViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_restaurant, parent, false);
        return new OrangViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterRestoran.OrangViewHolder holder, int position) {
        holder.jarak.setText(datalist.get(position).getJarak());
        holder.nama.setText(datalist.get(position).getNama());
        holder.rate.setText(datalist.get(position).getRate());
        holder.image.setImageResource(datalist.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;
    }

    public class OrangViewHolder extends RecyclerView.ViewHolder {
        TextView nama, jarak, rate;
        ImageView image;
        public OrangViewHolder(@NonNull View itemView) {
            super(itemView);

            nama =itemView.findViewById(R.id.tvnamarestaurant);
            jarak =itemView.findViewById(R.id.tvjarak);
            rate =itemView.findViewById(R.id.tvrate);
            image =itemView.findViewById(R.id.ivrestaurant);
        }
    }
}