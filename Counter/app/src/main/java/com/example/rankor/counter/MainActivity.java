package com.example.rankor.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mCrowsCounterButton;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrowsCounterButton = (Button)findViewById(R.id.crowsCounterButton);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView mCountTextView = (TextView)findViewById(R.id.fhtagnTextView);
                mCountTextView.setText(++mCount + " crows in the sky!" );
            }
        });
    }

    public void onFhtagnClik(View view) {
        TextView fhtagnTextView = (TextView)findViewById(R.id.fhtagnTextView);
        fhtagnTextView.setText("Fhtagn");
    }
}
