package com.example.ptspakaji;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMakanan extends RecyclerView.Adapter<AdapterMakanan.OrangViewHolder> {

    private ArrayList<ModelMakanan> datalist;

    public AdapterMakanan(ArrayList <ModelMakanan> datalist) {
        this.datalist = datalist;
    }

        @Override
        public OrangViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_makanan, parent, false);
        return new OrangViewHolder(view);
    }

        @Override
        public void onBindViewHolder(OrangViewHolder holder, int position){
        holder.nama.setText(datalist.get(position).getNama());
        holder.desc.setText(datalist.get(position).getDesc());
        holder.desc2.setText(datalist.get(position).getDesc2());
        holder.harga.setText(datalist.get(position).getHarga());
        holder.image.setImageResource(datalist.get(position).getImage());
    }

        @Override
        public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;
    }

        public class OrangViewHolder extends RecyclerView.ViewHolder {
            TextView nama, desc, desc2, harga;
            ImageView image;
            public OrangViewHolder(@NonNull View itemView) {
                super(itemView);

                nama = itemView.findViewById(R.id.tvnamamenu);
                desc = itemView.findViewById(R.id.tvdesc);
                desc2 = itemView.findViewById(R.id.tvdesc2);
                harga = itemView.findViewById(R.id.tvharga);
                image = itemView.findViewById(R.id.ivfood1);

            }
        }

    }

