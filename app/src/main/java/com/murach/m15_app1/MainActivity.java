package com.murach.m15_app1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends Activity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView)findViewById(R.id.imageView);
    }

    public void onMove(View v)
    {
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        iv.startAnimation(animation);
    }

}
