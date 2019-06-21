package com.example.alllist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class recycleviewadapter extends RecyclerView.Adapter<recycleviewadapter.viewholder> {
    ArrayList<model>arrayList;

    public recycleviewadapter(ArrayList<model> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list,viewGroup,false);
        return new viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int i) {
        model model=arrayList.get(i);
       holder.textView_title.setText(model.getTitle());
       holder.textView_overrview.setText(model.getOverview());
       holder.imageview.setImageResource(model.getgImageview());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class viewholder extends RecyclerView.ViewHolder{
        public  TextView textView_title,textView_overrview;
        public ImageView imageview;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            textView_title=itemView.findViewById(R.id.title_text);
            textView_overrview=itemView.findViewById(R.id.overview_text);
             imageview= itemView.findViewById(R.id.image);
        }
    }
}
