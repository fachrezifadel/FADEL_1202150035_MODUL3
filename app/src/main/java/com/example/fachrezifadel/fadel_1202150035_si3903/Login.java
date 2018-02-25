package com.example.fachrezifadel.fadel_1202150035_si3903;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button log;
    private EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        log = findViewById(R.id.buttonLogin);
        user = findViewById(R.id.editUser);
        pass = findViewById(R.id.editPass);
    }

    public void login(View view) {
        final String nama = user.getText().toString();
        String word = pass.getText().toString();

        if (nama.equals("EAD") && word.equals("MOBILE")){
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(Login.this, DaftarAir.class);
            startActivity(intent);

        }else if (!nama.equals("EAD") && !word.equals("MOBILE")){
            Toast.makeText(this, "Username atau Password Salah", Toast.LENGTH_LONG).show();

        }else if (nama.isEmpty() && word.isEmpty()){
            Toast.makeText(this, "User dan password tidak sesuai", Toast.LENGTH_LONG).show();
        }
    }
}
