package com.example.jain.teacherevaluation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FifthSemesterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_semester);
    }

    public void QuestionList(View view) {
        Intent intent = new Intent(FifthSemesterActivity.this, QuestionListActivity.class);
        //finish();
        startActivity(intent);
    }
}
