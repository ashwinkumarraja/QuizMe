package com.bolt.quizme.quizme;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TapMyth(View view){
        ImageView img = (ImageView)findViewById(R.id.imageView2);
        final Animation myAnim = AnimationUtils.loadAnimation(this , R.anim.bounce);
        img.startAnimation(myAnim);

        MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
        myAnim.setInterpolator(interpolator);

        img.startAnimation(myAnim);

        Intent i = new Intent(getApplicationContext(),Scriptures.class);
        startActivity(i);
    }
    public void TapCars(View view){
        ImageView img = (ImageView)findViewById(R.id.imageView5);
        final Animation myAnim = AnimationUtils.loadAnimation(this , R.anim.bounce);
        img.startAnimation(myAnim);

        MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
        myAnim.setInterpolator(interpolator);

        img.startAnimation(myAnim);
        Intent i = new Intent(getApplicationContext(),Cars.class);
        startActivity(i);
    }
    public void TapFlag(View view){
        ImageView img = (ImageView)findViewById(R.id.imageView);
        final Animation myAnim = AnimationUtils.loadAnimation(this , R.anim.bounce);
        img.startAnimation(myAnim);

        MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
        myAnim.setInterpolator(interpolator);

        img.startAnimation(myAnim);
        Intent i = new Intent(getApplicationContext(),Flag.class);
        startActivity(i);
    }
    public void TapMath(View view){
        ImageView img = (ImageView)findViewById(R.id.imageView3);
        final Animation myAnim = AnimationUtils.loadAnimation(this , R.anim.bounce);
        img.startAnimation(myAnim);

        MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
        myAnim.setInterpolator(interpolator);

        img.startAnimation(myAnim);
        Intent i = new Intent(getApplicationContext(),Methamat.class);
        startActivity(i);
    }
    public void TapSports(View view){
        ImageView img = (ImageView)findViewById(R.id.imageView7);
        final Animation myAnim = AnimationUtils.loadAnimation(this , R.anim.bounce);
        img.startAnimation(myAnim);

        MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
        myAnim.setInterpolator(interpolator);

        img.startAnimation(myAnim);
        Intent i = new Intent(getApplicationContext(),Sports.class);
        startActivity(i);
    }
    public void TapLogos(View view){
        ImageView img = (ImageView)findViewById(R.id.imageView8);
        final Animation myAnim = AnimationUtils.loadAnimation(this , R.anim.bounce);
        img.startAnimation(myAnim);

        MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
        myAnim.setInterpolator(interpolator);

        img.startAnimation(myAnim);
    }

}
