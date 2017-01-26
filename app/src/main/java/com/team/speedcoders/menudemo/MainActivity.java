package com.team.speedcoders.menudemo;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<Drawable> drawable;
    ArrayList<String> name,department;
    ListView listView;
    MyAddapter myAddapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=new ArrayList<>();
        department=new ArrayList<>();
        drawable=new ArrayList<>();
        listView= (ListView) findViewById(R.id.myList);
        name.addAll(Arrays.asList(getResources().getStringArray(R.array.name)));
        department.addAll(Arrays.asList(getResources().getStringArray(R.array.department)));
        for (int j = 1; j <= name.size(); j++) {
            drawable.add(getResources().getDrawable(getResources()
                    .getIdentifier("person"+j, "drawable", getPackageName())));
        }
        myAddapter=new MyAddapter(this,department,drawable,name);
        listView.setAdapter(myAddapter);
        registerForContextMenu(listView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Select Action").
                add(0,1901,1,"Show detail");
        menu.add(0,1902,2,"detel");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return super.onContextItemSelected(item);
    }
}
