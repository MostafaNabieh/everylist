package com.example.alllist;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class customlistActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist);
        listView=findViewById(R.id.custom_list);
        final ArrayList<model>arrayList=new ArrayList<>();
        arrayList.add(new model(R.drawable.ic_brightness_2_black_24dp,"black","this is very good color"));
        arrayList.add(new model(R.drawable.ic_directions_walk_black_24dp,"brown","this is very very good color"));
        adapter adapter=new adapter(this,arrayList);
        listView.setAdapter(adapter);



    }
}
