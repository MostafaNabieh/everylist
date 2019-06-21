package com.example.alllist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class adapter extends ArrayAdapter<model> {
    public adapter(Context context, ArrayList<model> arrayList) {
        super(context, 0, arrayList);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listview=convertView;
        if (listview == null)
        {
            listview= LayoutInflater.from(getContext()).inflate(R.layout.list,parent,false);
        }
        model m=getItem(position);
        TextView textView_title=listview.findViewById(R.id.title_text);
        textView_title.setText(m.getTitle());

        TextView textView_overrview=listview.findViewById(R.id.overview_text);
        textView_overrview.setText(m.getOverview());
        ImageView imageview= listview.findViewById(R.id.image);

        if(m.hasImage())
        {
            imageview.setImageResource(m.getgImageview());
            imageview.setVisibility(View.VISIBLE);

        }
        else
        {
            imageview.setVisibility(View.INVISIBLE);

        }






    return listview;
    }
}
