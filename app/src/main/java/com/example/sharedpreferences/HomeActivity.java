package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btnlogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final SharedPrefManager sharedPrefManager = new SharedPrefManager(this);

        btnlogout = findViewById(R.id.btnLogout);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, MainActivity.class);
                sharedPrefManager.saveIsLogin(false);
                finishAffinity();
                startActivity(i);
            }
        });
    }
}