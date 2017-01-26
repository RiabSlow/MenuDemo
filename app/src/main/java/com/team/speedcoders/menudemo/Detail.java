package com.team.speedcoders.menudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final String name=((EditText)findViewById(R.id.name_field)).getText().toString();
        final String dept=((EditText)findViewById(R.id.dept_field)).getText().toString();
        ((Button)findViewById(R.id.submit)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getIntent().putExtra("Name",name);
                getIntent().putExtra("Dept",dept);
                finish();
            }
        });
    }
}
