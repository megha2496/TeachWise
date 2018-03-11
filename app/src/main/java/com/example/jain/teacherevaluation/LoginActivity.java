package com.example.jain.teacherevaluation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Login(View view) {
        Intent intent = new Intent(LoginActivity.this, SemesterActivity.class);
        finish();
        startActivity(intent);
    }
    public void Register(View view) {
        Intent intent = new Intent(LoginActivity.this, RegistrationFormActivity.class);
        finish();
        startActivity(intent);
    }
}
