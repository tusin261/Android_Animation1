package com.example.animation_transition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

import java.util.ArrayList;

public class activity_list_item extends AppCompatActivity {
    RecyclerView rcv;
    ArrayList<Music> list;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);

        rcv = findViewById(R.id.rcv_list);
        list = new ArrayList<>();
        list.add(new Music(1,"Love Story","Taylor Swift",R.drawable.avt_music));
        list.add(new Music(2,"Love Story","Taylor Swift",R.drawable.avt_music));
        list.add(new Music(3,"Love Story","Taylor Swift",R.drawable.avt_music));
        list.add(new Music(4,"Love Story","Taylor Swift",R.drawable.avt_music));
        list.add(new Music(5,"Love Story","Taylor Swift",R.drawable.avt_music));
        list.add(new Music(6,"Love Story","Taylor Swift",R.drawable.avt_music));
        adapter = new CustomAdapter(activity_list_item.this,list);
        rcv.setAdapter(adapter);
        rcv.setLayoutManager(new LinearLayoutManager(activity_list_item.this,LinearLayoutManager.VERTICAL,false));




    }
}