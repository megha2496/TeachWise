package com.example.jain.teacherevaluation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FacultyLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_login);
    }

    public void LoginFaculty(View view) {
        Intent intent = new Intent(FacultyLoginActivity.this, FacultyHomeActivity.class);
        //finish();
        startActivity(intent);
    }
}


