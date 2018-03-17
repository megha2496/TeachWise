package com.example.jain.teacherevaluation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void RecordRating(View view) {
        Intent intent = new Intent(HomeActivity.this, SemesterActivity.class);
        //finish();
        startActivity(intent);
    }

    public void ReadInstructions(View view) {
        Intent intent = new Intent(HomeActivity.this, InstructionActivity.class);
        //finish();
        startActivity(intent);
    }

    public void InfoAlert(View view) {
        Intent intent = new Intent(HomeActivity.this, InfoActivity.class);
        //finish();
        startActivity(intent);
    }
}
