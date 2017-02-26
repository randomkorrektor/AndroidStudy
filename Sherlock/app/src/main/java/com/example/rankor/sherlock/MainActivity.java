package com.example.rankor.sherlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final private int CHOOSE_THIEF = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickChoice(View view) {
        Intent questionIntent = new Intent(MainActivity.this, ChoiceActivity.class);
        startActivityForResult(questionIntent, CHOOSE_THIEF);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        TextView infoTextView = (TextView)findViewById(R.id.textViewAnswer);

        if(requestCode == CHOOSE_THIEF){
            if (resultCode == -1){
                String ans = data.getStringExtra(ChoiceActivity.THIEF);

                infoTextView.setText(ans);
            }else {
                infoTextView.setText("");
            }
        }

    }
}
