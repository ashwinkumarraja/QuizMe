package com.bolt.quizme.quizme;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Mathemata3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathemata3);

        String str = getIntent().getStringExtra("option");
        String str2 = getIntent().getStringExtra("Score");
        TextView scorem3 = findViewById(R.id.scorem3);
        int z;
        if(str.equals("time's up")){
            scorem3.setText(str2);
        }
        if(str.equals("11")){
            Log.d("option"," "+str2);
            int s =Integer.parseInt(str2);
            s++;
            str2 = Integer.toString(s);
            scorem3.setText(str2);
        }
        else{
            scorem3.setText(str2);
        }


        final CountDownTimer myn = new CountDownTimer(10000, 1000) {
            TextView mTextField= (TextView) findViewById(R.id.textview);
            public void onTick(long millisUntilFinished) {
                mTextField.setText("Time's Running: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                mTextField.setText("Time's Up!!!");
                mTextField.setTextColor(Color.RED);


                Animation anim = new AlphaAnimation(0.0f, 1.0f);
                anim.setDuration(50); //You can manage the blinking time with this parameter
                anim.setStartOffset(20);
                anim.setRepeatMode(Animation.REVERSE);
                anim.setRepeatCount(Animation.INFINITE);
                mTextField.startAnimation(anim);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        TextView scorem3 = findViewById(R.id.scorem3);
                        Intent i=new Intent(Mathemata3.this,Mathematica4.class);
                        i.putExtra("option", "time's up");
                        i.putExtra("Score", scorem3.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 1500);
            }
        }.start();

        final Button optm31 = findViewById(R.id.optm31);
        optm31.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myn.cancel();
                final Animation myAnim;
                myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                optm31.startAnimation(myAnim);

                MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                myAnim.setInterpolator(interpolator);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        TextView scorem3 = findViewById(R.id.scorem3);
                        Intent i=new Intent(Mathemata3.this,Mathematica4.class);
                        i.putExtra("option",optm31.getText().toString());
                        i.putExtra("Score", scorem3.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 200);

            }
        });
        final Button optm32 = (Button)findViewById(R.id.optm32);
        optm32.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myn.cancel();
                final Animation myAnim;
                myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                optm32.startAnimation(myAnim);

                MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                myAnim.setInterpolator(interpolator);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i=new Intent(Mathemata3.this,Mathematica4.class);
                        i.putExtra("option",optm32.getText().toString());
                        TextView scorem3 = findViewById(R.id.scorem3);
                        i.putExtra("Score", scorem3.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 200);
            }
        });
        final Button optm33 = (Button)findViewById(R.id.optm33);
        optm33.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myn.cancel();
                final Animation myAnim;
                myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                optm33.startAnimation(myAnim);

                MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                myAnim.setInterpolator(interpolator);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i=new Intent(Mathemata3.this,Mathematica4.class);
                        i.putExtra("option",optm33.getText().toString());
                        TextView scorem3 = findViewById(R.id.scorem3);
                        i.putExtra("Score", scorem3.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 200);
            }
        });

        final Button optm34 = (Button)findViewById(R.id.optm34);
        optm34.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myn.cancel();
                final Animation myAnim;
                myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                optm34.startAnimation(myAnim);

                MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                myAnim.setInterpolator(interpolator);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i=new Intent(Mathemata3.this,Mathematica4.class);
                        TextView scorem3 = findViewById(R.id.scorem3);
                        i.putExtra("option",optm34.getText().toString());
                        i.putExtra("Score", scorem3.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 200);
            }
        });
    }

}
