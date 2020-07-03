package com.example.day_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends Activity {
    TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        txtName = (TextView) findViewById(R.id.text2);
        Intent iName = getIntent();

        String uname = (String) iName.getSerializableExtra("USERNAME");

        txtName.setText("welcome " + uname);
    }
}
