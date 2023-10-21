package com.shak.myanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.Random;

public class MylottieAnimation extends AppCompatActivity {
    LottieAnimationView laAnim;
    Button laAnimBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylottie_animation);
        laAnim = findViewById(R.id.laAnim);
        laAnimBtn = findViewById(R.id.laAnimBtn);

        laAnimBtn.setOnClickListener(v -> {
            ArrayList<Integer> animList = new ArrayList<>();
            animList.add(R.raw.lottie_anim);
            animList.add(R.raw.skull);
            animList.add(R.raw.bat_ball);
            animList.add(R.raw.halloween);
            animList.add(R.raw.heart);
            animList.add(R.raw.horror);
            animList.add(R.raw.music);
            animList.add(R.raw.rotated_ball);
            animList.add(R.raw.running_watch);
            Random random = new Random();
            int randomIndex = random.nextInt(animList.size());
            int randomAnim = animList.get(randomIndex);
            laAnim.setAnimation(randomAnim);
            laAnim.playAnimation();
        });
    }
}