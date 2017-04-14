package com.example.rankor.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // получим идентификатор выбранного пункта меню
        int id = item.getItemId();

        TextView infoTextView = (TextView) findViewById(R.id.textView);

        // Операции для выбранного пункта меню
        switch (id) {
            case R.id.action_1:
                infoTextView.setText("Great 1!");
                return true;
            case R.id.action_2:
                infoTextView.setText("Great 2");
                return true;
            case R.id.action_3:
                infoTextView.setText("Great 3");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
