package com.example.resturantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private TextView rest_name;
    private TextView motto;
    private ImageView line;
    private Animation top, bottom;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        img = findViewById(R.id.img);
        rest_name = findViewById(R.id.rest_name);
        line = findViewById(R.id.line);
        motto = findViewById(R.id.motto);
        top = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        img.setAnimation(top);
        rest_name.setAnimation(bottom);
        line.setAnimation(bottom);
        motto.setAnimation(bottom);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3500);



    }
}