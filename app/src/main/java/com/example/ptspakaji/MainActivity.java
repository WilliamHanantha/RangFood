package com.example.ptspakaji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText username = findViewById(R.id.etusername);
        TextInputEditText password = findViewById(R.id.etpassword);
        Editable getUsername = username.getText();
        Editable getPassword = password.getText();
        String admin = "Vincen";
        String adminPassword = "300106";
        Button button = findViewById(R.id.btnlogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getUsername != null && getPassword != null){
                    if (admin.contentEquals(getUsername) && adminPassword.contentEquals(getPassword)){
                        Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), MainMenu.class));
                    } else {
                        Toast.makeText(MainActivity.this, "Login Gagal, Harap Coba Lagi", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        TextView register = findViewById(R.id.tvregister2);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(getApplicationContext(), RegisterPage.class));
                startActivity(intent);
            }
        });
    }
}