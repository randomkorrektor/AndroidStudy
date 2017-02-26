package com.example.rankor.anotherscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        String user = "Животное";
        String message = "дырку от бублика";

        if ((getIntent().getExtras().getString("username") != null)
                && (getIntent().getExtras().getString("gift") != null)){
            user = getIntent().getExtras().getString("username");
            message = getIntent().getExtras().getString("gift");
        }


        TextView infoTextView = (TextView)findViewById(R.id.infoTextView);
        infoTextView.setText(user + ", вам передали " + message);
    }
}
