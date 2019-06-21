package com.example.alllist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class listview extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView=findViewById(R.id.listview);
        ArrayList <Integer> arrayList=new ArrayList<>();
        for (int i=0;i<100;i++)
        {
            arrayList.add(i);
        }
        ArrayAdapter<Integer>arrayAdapter=new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);


    }
}
