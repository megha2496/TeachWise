package com.example.jain.teacherevaluation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RegistrationFormActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButtonMale;
    RadioButton radioButtonFemale;
    RadioButton radioButtonOther;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);

        radioGroup = (RadioGroup) findViewById(R.id.radioButtonGroupRegistrationForm);
        radioButtonMale = (RadioButton) findViewById(R.id.radioButtonRegistrationFormMale);
        radioButtonFemale = (RadioButton) findViewById(R.id.radioButtonRegistrationFormFemale);
        radioButtonOther = (RadioButton) findViewById(R.id.radioButtonRegistrationFormOther);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.radioButtonRegistrationFormMale) {
                    clearRadioChecked();
                    radioButtonMale.setChecked(true);

                } else if (checkedId == R.id.radioButtonRegistrationFormFemale) {
                    clearRadioChecked();
                    radioButtonFemale.setChecked(true);

                } else if (checkedId == R.id.radioButtonRegistrationFormOther) {
                    clearRadioChecked();
                    radioButtonOther.setChecked(true);

                }
            }
        });

    }

    public void clearRadioChecked() {
        radioButtonMale.setChecked(false);
        radioButtonFemale.setChecked(false);
        radioButtonOther.setChecked(false);
    }

    public void BackToLogin(View view) {
        Intent intent = new Intent(RegistrationFormActivity.this, LoginActivity.class);
        finish();
        startActivity(intent);
    }
}
