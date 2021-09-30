package com.example.animation_transition;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.transition.Fade;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Music> list;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context, ArrayList<Music> list) {
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.item,parent,false);
        return new ViewHolder(v,this);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
        Music m = list.get(position);
        holder.tv1.setText(m.getMusic_name());
        holder.tv2.setText(m.getSinger_name());
        holder.imgView.setImageResource(m.getAvt());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv1,tv2;
        ImageView imgView;
        CustomAdapter customAdapter;

        public ViewHolder(@NonNull View itemView, CustomAdapter customAdapter) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
            imgView = itemView.findViewById(R.id.img_music);
            this.customAdapter = customAdapter;
            imgView.setTransitionName("fade");

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, activity_music.class);
                    ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) context,imgView, ViewCompat.getTransitionName(imgView));
                    context.startActivity(intent,options.toBundle());
                }
            });



        }
    }
}
