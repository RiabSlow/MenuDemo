package com.team.speedcoders.menudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ((TextView)findViewById(R.id.detail_name)).setText(getIntent().getStringExtra("Name"));
    }
}
