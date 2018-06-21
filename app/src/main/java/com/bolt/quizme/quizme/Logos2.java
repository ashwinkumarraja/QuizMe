package com.bolt.quizme.quizme;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Logos2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logos2);

        String str = getIntent().getStringExtra("option");
        String str2 = getIntent().getStringExtra("Score");
        TextView score = findViewById(R.id.scorem1);
        int z;
        if(str.equals("time's up")){
            score.setText(str2);
        }
        else if(str.equals("Bitcoin")){
            int s =Integer.parseInt(str2);
            s++;
            str2 = Integer.toString(s);
            score.setText(str2);
        }
        else{
            score.setText(str2);
        }
        final CountDownTimer myn =new CountDownTimer(10000, 1000) {
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

                        Intent i=new Intent(Logos2.this,Logos3.class);
                        TextView score = findViewById(R.id.scorem1);
                        i.putExtra("option","time's up");
                        i.putExtra("Score",score.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 1500);
            }
        }.start();

        final Button opt1 = (Button)findViewById(R.id.opt1);
        opt1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myn.cancel();
                final Animation myAnim;
                myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                opt1.startAnimation(myAnim);

                MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                myAnim.setInterpolator(interpolator);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i=new Intent(Logos2.this,Logos3.class);
                        TextView score = findViewById(R.id.scorem1);
                        i.putExtra("option",opt1.getText().toString());
                        i.putExtra("Score",score.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 200);
            }
        });
        final Button opt2 = (Button)findViewById(R.id.opt2);
        opt2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myn.cancel();
                final Animation myAnim;
                myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                opt2.startAnimation(myAnim);

                MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                myAnim.setInterpolator(interpolator);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i=new Intent(Logos2.this,Logos3.class);
                        TextView score = findViewById(R.id.scorem1);
                        i.putExtra("option",opt2.getText().toString());
                        i.putExtra("Score",score.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 200);
            }
        });
        final Button opt3 = (Button)findViewById(R.id.opt3);
        opt3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myn.cancel();
                final Animation myAnim;
                myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                opt3.startAnimation(myAnim);

                MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                myAnim.setInterpolator(interpolator);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i=new Intent(Logos2.this,Logos3.class);
                        TextView score = findViewById(R.id.scorem1);
                        i.putExtra("option",opt3.getText().toString());
                        i.putExtra("Score",score.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 200);
            }
        });
        final Button opt4 = (Button)findViewById(R.id.opt4);
        opt4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myn.cancel();
                final Animation myAnim;
                myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                opt4.startAnimation(myAnim);

                MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                myAnim.setInterpolator(interpolator);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i=new Intent(Logos2.this,Logos3.class);
                        TextView score = findViewById(R.id.scorem1);
                        i.putExtra("option",opt4.getText().toString());
                        i.putExtra("Score",score.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 200);
            }
        });
    }

}
