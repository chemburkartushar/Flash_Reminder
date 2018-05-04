package com.example.tusharchemburkar.flashreminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        TextView textView= (TextView)(findViewById(R.id.textView));
//        Intent intent = getIntent();
//        textView.setText(intent.getExtras().getString("day"));
//        TextView textView1= (TextView)(findViewById(R.id.textView2));
//
//        textView1.setText(intent.getExtras().getString("month"));
//        TextView textView2= (TextView)(findViewById(R.id.textView3));
//
//        textView2.setText(intent.getExtras().getString("year"));

        TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
        final Intent intent = new Intent(this, Main4Activity.class);
        final Intent intent1 = new Intent(this, Main3Activity.class);
        int hour = timePicker.getHour();
        int minute = timePicker.getMinute();
        final String hourStr = Integer.toString(hour);
        final String minuteStr = Integer.toString(minute);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.rightarrow);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("hour",hourStr);
                intent.putExtra("minute",minuteStr);
                startActivity(intent1);
            }
        });
    }

}
