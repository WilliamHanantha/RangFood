package com.example.ptspakaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        TextInputEditText namaPanggilan = findViewById(R.id.etnamakamu);
        Editable getNamaPanggilan = namaPanggilan.getText();
        String nama = "William";
        Button button = findViewById(R.id.btnmasuk);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getNamaPanggilan != null){
                    if(nama.contentEquals(getNamaPanggilan)){
                        Toast.makeText(IntroActivity.this, "Welcome "+getNamaPanggilan, Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), MainMenu.class));
                    }else {
                        Toast.makeText(IntroActivity.this, "Sorry, your name has been taken", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}