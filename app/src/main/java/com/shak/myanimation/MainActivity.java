package com.shak.myanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAnim;
    Button translateBtn, rotateBtn, scaleBtn, alphaBtn, lottieBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAnim = findViewById(R.id.txtAnim);
        translateBtn = findViewById(R.id.translate);
        rotateBtn = findViewById(R.id.rotate);
        scaleBtn = findViewById(R.id.scale);
        alphaBtn = findViewById(R.id.alpha);
        lottieBtn = findViewById(R.id.lottieBtn);


        Animation translateAnim = AnimationUtils.loadAnimation(this, R.anim.translate);
        Animation rotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate);
        Animation scaleAnim = AnimationUtils.loadAnimation(this, R.anim.scale);
        Animation alphaAnim = AnimationUtils.loadAnimation(this, R.anim.alpha);

        translateBtn.setOnClickListener(v -> txtAnim.startAnimation(translateAnim));
        rotateBtn.setOnClickListener(v -> txtAnim.startAnimation(rotateAnim));
        scaleBtn.setOnClickListener(v -> txtAnim.startAnimation(scaleAnim));
        alphaBtn.setOnClickListener(v -> txtAnim.startAnimation(alphaAnim));
        lottieBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MylottieAnimation.class);
            startActivity(intent);
        });
    }
}