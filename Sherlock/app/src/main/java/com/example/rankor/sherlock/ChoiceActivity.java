package com.example.rankor.sherlock;

import android.content.Intent;
import android.os.Bundle;
//import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ChoiceActivity extends AppCompatActivity {

    public final static String THIEF = "com.example.rankor.sherlock.THIEF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }

    public void onRadioClick(View view) {
        Intent answerIntent = new Intent();
        switch (view.getId()){
            case R.id.radioButton1:
                answerIntent.putExtra(THIEF, "Очень");
                break;
            case R.id.radioButton2:
                answerIntent.putExtra(THIEF,"Не очень");
                break;
            case R.id.radioButton3:
                answerIntent.putExtra(THIEF,"По самые уши");
                break;
            default:
                answerIntent.putExtra(THIEF,"Fuck!");
                break;
        }
        setResult(RESULT_OK,answerIntent);
        finish();
    }
}
