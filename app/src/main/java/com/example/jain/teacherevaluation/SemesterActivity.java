package com.example.jain.teacherevaluation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SemesterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
    }

    public void EighthSemester(View view) {
        Intent intent = new Intent(SemesterActivity.this, EighthSemesterActivity.class);
        //finish();
        startActivity(intent);
    }

    public void SeventhSemester(View view) {
        Intent intent = new Intent(SemesterActivity.this, SeventhSemesterActivity.class);
        //finish();
        startActivity(intent);
    }

    public void SixthSemester(View view) {
        Intent intent = new Intent(SemesterActivity.this, SixthSemesterActivity.class);
        //finish();
        startActivity(intent);
    }

    public void FifthSemester(View view) {
        Intent intent = new Intent(SemesterActivity.this, FifthSemesterActivity.class);
        //finish();
        startActivity(intent);
    }

    public void FourthSemester(View view) {
        Intent intent = new Intent(SemesterActivity.this, FourthSemesterActivity.class);
        //finish();
        startActivity(intent);
    }

    public void ThirdSemester(View view) {
        Intent intent = new Intent(SemesterActivity.this, ThirdSemesterActivity.class);
        //finish();
        startActivity(intent);
    }
}
