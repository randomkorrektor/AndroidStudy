package com.example.rankor.anotherscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String name;
    private EditText mEditTextName;
    private EditText mEditTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextName = (EditText)findViewById(R.id.editTextName);
        mEditTextMessage = (EditText)findViewById(R.id.editTextMessage);

        mEditTextName.setOnKeyListener(new View.OnKeyListener(){
            public boolean onKey(View v, int keyCode, KeyEvent event){
                if (event.getAction() == KeyEvent.ACTION_DOWN&&
                        (keyCode == KeyEvent.KEYCODE_ENTER)){
                    name = mEditTextName.getText().toString();
                    return true;
                }
                return false;
            }
        });

    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);

    }

    public void onClickBirtday(View view) {
        Intent intent2 = new Intent(MainActivity.this, BirthdayActivity.class);
        intent2.putExtra("username", mEditTextName.getText().toString());
        intent2.putExtra("gift", mEditTextMessage.getText().toString());
        startActivity(intent2);
    }
}
