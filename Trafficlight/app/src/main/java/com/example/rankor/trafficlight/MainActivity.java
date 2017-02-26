package com.example.rankor.trafficlight;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
//import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity  {

    private RelativeLayout mRelativeLayout;
    private TextView mInfoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.activity_main);
        mInfoTextView = (TextView)findViewById(R.id.mInfoTextView);

    }



    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.Red);
        //mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.redColor));
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.redColor));
    }

    public void onYellowButtonClick(View view) {
        mInfoTextView.setText(R.string.Yellow);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellowColor));
    }

    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.Green);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.greenColor));
    }
}
