package com.example.ptspakaji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterRestoran adapter;
    private ArrayList<ModelRestoran> orangArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button buttonLihat = findViewById(R.id.btnlihatselengkapnya);
        buttonLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ListPage.class));
            }
        });



        addData();

        recyclerView = (RecyclerView) findViewById(R.id.rvlistrestoran);

        adapter = new AdapterRestoran(orangArrayList);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(MainMenu.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        orangArrayList = new ArrayList<>();
        orangArrayList.add(new ModelRestoran("0.6 KM", "Paparon's Pizza", "4.0", R.drawable.paparons));
        orangArrayList.add(new ModelRestoran("1.1 KM", "Pizza Hut", "4.5", R.drawable.logo_pizzahut));
        orangArrayList.add(new ModelRestoran("2.8 KM", "Domino's Pizza", "4.8", R.drawable.logo_dominopizza));
        orangArrayList.add(new ModelRestoran("3.5 KM", "Geprek Oliv", "4.3", R.drawable.logo_geprekoliv));
        orangArrayList.add(new ModelRestoran("2.0 KM", "Kopi JanjiJiwa", "4.2", R.drawable.logo_janjijiwa));
        orangArrayList.add(new ModelRestoran("1.5 KM", "Beli Kopi", "4.1", R.drawable.logo_belikopi));
        orangArrayList.add(new ModelRestoran("2.8 KM", "Es Teh", "4.9", R.drawable.logo_esteh));
        orangArrayList.add(new ModelRestoran("5.2 KM", "Chatime", "3.9", R.drawable.logo_chatime));
        orangArrayList.add(new ModelRestoran("3.4 KM", "Kopi Kenangan", "4.2", R.drawable.logo_kopikenangan));

    }



}
