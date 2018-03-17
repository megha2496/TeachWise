package com.example.jain.teacherevaluation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jain on 3/14/2018.
 */

public class QuestionBaseAdapter extends BaseAdapter {

    Context ctx;
    //List<QuestionDetails> questionList;
    ArrayList<String> questionList;
    ArrayList<String> opt1;
    ArrayList<String> opt2;

    public QuestionBaseAdapter(Context ctx, ArrayList<String> questionList, ArrayList<String> option1, ArrayList<String> option2) {
        this.ctx = ctx;
        this.questionList = questionList;
        this.opt1 = option1;
        this.opt2 = option2;
    }

    @Override
    public int getCount() {
        return questionList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = inflater.inflate(R.layout.question_view, null);

        TextView textView1 = (TextView) view1.findViewById(R.id.textViewQuestionViewQuestion);
        String sampleQues = questionList.get(i);
        textView1.setText(sampleQues);

        RadioButton op1 = (RadioButton) view1.findViewById(R.id.radioButtonQuestionViewAnswer1);
        String sampleOption1 = opt1.get(i);
        op1.setText(sampleOption1);

        RadioButton op2 = (RadioButton) view1.findViewById(R.id.radioButtonQuestionViewAnswer2);
        String sampleOption2 = opt2.get(i);
        op2.setText(sampleOption2);

        /*TextView textView1 = (TextView) view1.findViewById(R.id.textViewQuestionViewQuestion);
        textView1.setText(questionList.get(i).getQuestion() + "");*/
        return view1;
    }
}
