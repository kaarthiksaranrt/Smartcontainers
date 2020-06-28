package com.example.dwis.smartcontainer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT=2960;
    Animation topAnime,bottomAnime;
    ImageView icon;
    TextView appname,version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();

                }
            }, SPLASH_SCREEN_TIME_OUT);

            topAnime= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.top_anime);
            bottomAnime= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bottom_anime);

            icon=findViewById(R.id.appicon);
            appname=findViewById(R.id.appname);
            version=findViewById(R.id.version);

            icon.startAnimation(topAnime);
            appname.startAnimation(bottomAnime);
            version.startAnimation(bottomAnime);



        }
}
