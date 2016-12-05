package com.example.swarupa.menuapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textView = (TextView)findViewById(R.id.t1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);//Menu Resource, Menu
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Red:
                textView.setTextColor(Color.RED);
                Toast.makeText(getApplicationContext(),"Red color change",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Green:
                textView.setTextColor(Color.GREEN);
                Toast.makeText(getApplicationContext(),"Green color change",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Blue:
                textView.setTextColor(Color.BLUE);
                Toast.makeText(getApplicationContext(),"Blue color change",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

