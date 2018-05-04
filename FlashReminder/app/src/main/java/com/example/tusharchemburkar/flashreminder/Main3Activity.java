package com.example.tusharchemburkar.flashreminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void remindMe(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        Intent intent = new Intent(this, Main4Activity.class);
        intent.putExtra("reminderText",editText.getText().toString());
        startActivity(intent);
    }
}
