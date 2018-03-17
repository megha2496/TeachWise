package com.example.jain.teacherevaluation;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class QuestionListActivity extends AppCompatActivity {

    ListView quesList;
    /*RadioButton radioButtonOther;
    EditText suggestions;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_list);


        //final List<QuestionDetails> ques_list = new ArrayList<>();
        quesList = (ListView) findViewById(R.id.listViewQuestionListQuestionslist);

        ArrayList<String> questions = new ArrayList<>();
        questions.add("1. Which teaching methodology do you prefer?");
        questions.add("2. Which language do you prefer for classroom teaching?");
        questions.add("3. Do you prefer reciting of notes in lectures?");
        questions.add("4. question4");
        questions.add("5. question5");
        questions.add("6. question6");

        ArrayList<String> option1 = new ArrayList<>();
        option1.add("Blackboard");
        option1.add("English");
        option1.add("Yes");
        option1.add("ans41");
        option1.add("ans51");
        option1.add("ans61");

        ArrayList<String> option2 = new ArrayList<>();
        option2.add("PPT");
        option2.add("Hindi");
        option2.add("No");
        option2.add("ans42");
        option2.add("ans52");
        option2.add("ans62");

        QuestionBaseAdapter adp = new QuestionBaseAdapter(this, questions, option1, option2);
        quesList.setAdapter(adp);
        /*quesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(QuestionListActivity.this, QuestionEntryActivity.class);
                intent.putExtra("ques", ques_list.get(position).getQuestion() + "");
                startActivity(intent);

            }
        });*/


        //For visibility of suggestion box only when option Other is chosen

        /*radioButtonOther = (RadioButton) findViewById(R.id.radioButtonRegistrationFormOther);
        suggestions = (EditText) findViewById(R.id.editTextQuestionViewSuggestionBox);

        radioButtonOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    suggestions.setVisibility(View.VISIBLE);
                } else {
                    suggestions.setVisibility(View.GONE);
                }
            }
        });*/
    }
}

