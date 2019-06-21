package com.example.alllist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class gridview extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        ArrayList<model> arrayList=new ArrayList<>();
        arrayList.add(new model(R.drawable.ic_brightness_2_black_24dp,"black","this is very good color"));
        arrayList.add(new model(R.drawable.ic_directions_walk_black_24dp,"brown","this is very very good color"));
       adapter adapter=new adapter(this,arrayList);
        gridView=findViewById(R.id.gridview);
        gridView.setAdapter(adapter);
    }
}
