package com.example.jain.teacherevaluation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EighthSemesterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth_semester);
    }

    public void QuestionList(View view) {
        Intent intent = new Intent(EighthSemesterActivity.this, QuestionListActivity.class);
        //finish();
        startActivity(intent);
    }

}
