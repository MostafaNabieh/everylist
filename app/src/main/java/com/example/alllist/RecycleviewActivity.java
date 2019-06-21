package com.example.alllist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleviewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        recyclerView=findViewById(R.id.recycleview);
        ArrayList<model> arrayList=new ArrayList<>();
        arrayList.add(new model(R.drawable.ic_brightness_2_black_24dp,"black","this is very good color"));
        arrayList.add(new model(R.drawable.ic_directions_walk_black_24dp,"brown","this is very very good color"));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recycleviewadapter recycleviewadapter=new recycleviewadapter(arrayList);
        recyclerView.setAdapter(recycleviewadapter);
    }
}
