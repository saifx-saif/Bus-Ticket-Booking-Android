package com.example.busfirstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=4000;

    Animation topanim,bottomanim,right_to_left_anim;
    ImageView imageView;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome_screen);

        topanim= AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        bottomanim=AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        right_to_left_anim=AnimationUtils.loadAnimation(this,R.anim.right_to_left_anim);

        imageView=findViewById(R.id.imageview);
        textView1=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView1.setAnimation(topanim);
        imageView.setAnimation(right_to_left_anim);
        textView2.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(WelcomeScreen.this,Login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}