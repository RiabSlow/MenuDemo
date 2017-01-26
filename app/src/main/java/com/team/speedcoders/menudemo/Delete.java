package com.team.speedcoders.menudemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Delete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        ((Button) findViewById(R.id.submit_delete)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                String name = ((EditText) findViewById(R.id.name_area)).getText().toString();
                intent.putExtra("Name", name);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
