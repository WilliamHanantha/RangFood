package com.example.ptspakaji;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListPage extends AppCompatActivity {


    private RecyclerView recyclerView;
    private AdapterMakanan adapter;
    private ArrayList<ModelMakanan> orangArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);

        Button buttonFab = findViewById(R.id.fab_keranjang);
        buttonFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),OrderPage.class));
            }
        });

        ImageView buttonBack2 = findViewById(R.id.ivback2);
        buttonBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainMenu.class));
            }
        });


        addData();

        recyclerView = (RecyclerView) findViewById(R.id.rvlistmakanan);

        adapter = new AdapterMakanan(orangArrayList);
        LinearLayoutManager verticalLayoutManager
                = new LinearLayoutManager(ListPage.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(verticalLayoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        orangArrayList = new ArrayList<>();
        orangArrayList.add(new ModelMakanan("Combo Mabar FC M", "5 Fire Chicken + 3 rice + Small / 3 Medium /", "1L Fruitarian Drink", "134.000", R.drawable.food_1));
        orangArrayList.add(new ModelMakanan("Combo Mabar FC", "5 Fire Chicken + 3 Rice + 4 Small/ 3 Medium", "/ 1L Fruitarian Drink + Cheese Sauce", "164.000", R.drawable.food_2));
        orangArrayList.add(new ModelMakanan("Combo Mabar RB M", "2 Fire Chicken + 3 Rice + Small/ 3 Medium /", "1L Fruitarian Drink + Cheese Sauce", "73.000", R.drawable.food_3));
        orangArrayList.add(new ModelMakanan("Combo Mabar RB", "5 Fire Chicken + 3 Rice + Small / 3 Medium / ", "1L Fruitarian Drink", "142.000", R.drawable.food_1));
        orangArrayList.add(new ModelMakanan("Combo Mabar RB", "4 Fire Chicken + Small / 4 Medium /", "1L Fruitarian Drink + BBQ Sauce", "164.000", R.drawable.food_2));
        orangArrayList.add(new ModelMakanan("Combo Mabar RB", "5 Fire Chicken + 3 Rice + Small / 3 Medium /", "1L Fruitarian Drink", "189.000", R.drawable.food_3));
        orangArrayList.add(new ModelMakanan("Combo Mabar RB", "8 Fire Chicken + 4 Rice + Small / 3 Medium /", "1L Fruitarian Drink + Cheese Sauce", "256.000", R.drawable.food_1));
        orangArrayList.add(new ModelMakanan("Combo Mabar RB", "Fire Chicken + Rice + Small / Medium /", "1L Fruitarian Drink + BBQ Sauce", "44.000", R.drawable.food_2));
        orangArrayList.add(new ModelMakanan("Combo Mabar RB", "6 Fire Chicken + 3 Rice + Small / 3 Medium /", "1L Fruitarian Drink", "207.000", R.drawable.food_3));
    }
}
