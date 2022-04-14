package com.example.ptspakaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        TextView login = findViewById(R.id.tvhavelogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });

        TextInputEditText email = findViewById(R.id.etemail);
        TextInputEditText password = findViewById(R.id.etpassword);
        TextInputEditText username = findViewById(R.id.etusername);
        Editable getUsername = username.getText();
        Editable getPassword = password.getText();
        Editable getEmail = email.getText();
        String adminEmail = "william@gmail.com";
        String adminPassword = "12345";
        String adminUsername = "William";
        Button button = findViewById(R.id.btnregister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getUsername != null && getPassword != null && getEmail != null) {
                    if (adminEmail.contentEquals(getEmail) && adminPassword.contentEquals(getPassword) && adminUsername.contentEquals(getUsername)) {
                        Toast.makeText(getApplicationContext(), "Regsiter Succsess", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), IntroActivity.class));
                    }else {
                        Toast.makeText(getApplicationContext(), "Invalid Email Or Username", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}