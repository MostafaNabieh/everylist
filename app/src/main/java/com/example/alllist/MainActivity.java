package com.example.alllist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void list(View view) {
        switch (view.getId())
        {
            case R.id.activity_listviewsimple:
                intent =new Intent(this,listview.class);
                startActivity(intent);
                break;
            case R.id.gridview_activitty:
                intent=new Intent(this,gridview.class);
                startActivity(intent);
                break;
            case R.id.Recycleview_activity:
                intent=new Intent(this,RecycleviewActivity.class);
                startActivity(intent);
                break;
            case R.id.custome_listview:
                intent=new Intent(this,customlistActivity.class);
                startActivity(intent);
                break;

             default:
                 break;

        }
    }
}
