package com.example.animation_transition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_ex1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);

        findViewById(R.id.btn_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_ex1.this,activity_ex2.class));
                overridePendingTransition(R.anim.exit,R.anim.exit);
            }
        });
    }
}