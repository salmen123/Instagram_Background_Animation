package com.example.salmen.instagram_background_animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference to parent layout
        ConstraintLayout container = findViewById(R.id.container);

        // initialize the animation
        anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(4500);
        anim.setExitFadeDuration(4500);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // start the animation
        if (anim != null && !anim.isRunning())
            anim.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // stop the animation
        if (anim != null && anim.isRunning())
            anim.stop();
    }
}
