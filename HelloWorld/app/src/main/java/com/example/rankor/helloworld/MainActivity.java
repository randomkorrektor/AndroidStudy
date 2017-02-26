package com.example.rankor.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView specialTextViwe;
    private EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        specialTextViwe = (TextView)findViewById(R.id.textView4);
        nameEditText = (EditText) findViewById(R.id.editText);
    }

    public void onClick(View view) {
        if(nameEditText.getText().length() == 0){
            specialTextViwe.setText("Fhtagn!");
        } else {
            specialTextViwe.setText(nameEditText.getText() + " fhtagn!");
            //nameEditText.setEnabled(false);
            //nameEditText.setCursorVisible(false);
            //nameEditText.setKeyListener(null);
            nameEditText.setFocusable(false);
            nameEditText.setBackgroundColor(Color.TRANSPARENT);
        }
    }

    public void nameOnClik(View view) {
        //nameEditText.requestFocus();
        //nameEditText.setEnabled(true);
        //if(!nameEditText.hasFocusable()){
            nameEditText.setFocusable(true);


        //nameEditText.setCursorVisible(true);
    }
}
