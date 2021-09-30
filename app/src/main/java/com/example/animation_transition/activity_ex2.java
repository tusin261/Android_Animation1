package com.example.animation_transition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class activity_ex2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        getWindow().setEnterTransition(fade);

        getWindow().setExitTransition(fade);

        final ImageView imageView = findViewById(R.id.img3);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_ex2.this, activity_share_element1.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity_ex2.this,imageView, ViewCompat.getTransitionName(imageView));
                startActivity(intent,options.toBundle());
            }
        });
    }
}