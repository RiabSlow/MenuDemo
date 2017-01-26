package com.team.speedcoders.menudemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ((Button) findViewById(R.id.submit)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                String name = ((EditText) findViewById(R.id.name_field)).getText().toString();
                String dept = ((EditText) findViewById(R.id.dept_field)).getText().toString();
                intent.putExtra("Name", name);
                intent.putExtra("Dept", dept);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
