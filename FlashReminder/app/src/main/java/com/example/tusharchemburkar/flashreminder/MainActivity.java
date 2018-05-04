package com.example.tusharchemburkar.flashreminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(this, Main4Activity.class);
        final Intent intent1 = new Intent(this, Main2Activity.class);

        final DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.rightarrow);

         final String day = String.valueOf(datePicker.getDayOfMonth());
        final String month = String.valueOf(datePicker.getMonth() + 1);
        final String year = String.valueOf(datePicker.getYear());
//        final String dayStr = Integer.toString(day);
//        final String monthStr = Integer.toString(month);
//        final String yearStr = Integer.toString(year);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               intent.putExtra("day",day);
               intent.putExtra("month",month);
               intent.putExtra("year",year);
               startActivity(intent1);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void killAll(View view) {
        this.finish();
    }
}
