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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Methamat extends AppCompatActivity {
    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methamat);


        final CountDownTimer myn = new CountDownTimer(10000, 1000) {
            TextView mTextField = (TextView) findViewById(R.id.textview);

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

                        Intent i = new Intent(Methamat.this, Mathemata2.class);
                        TextView scorem1 = findViewById(R.id.scorem1);
                        i.putExtra("option", "time's up");
                        i.putExtra("Score", scorem1.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 1500);
            }
        }.start();


        boolean game = true;



            final Button optm11 = (Button) findViewById(R.id.optm11);
            optm11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myn.cancel();
                    final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                    optm11.startAnimation(myAnim);

                    MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                    myAnim.setInterpolator(interpolator);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Intent i = new Intent(Methamat.this, Mathemata2.class);
                            TextView scorem1 = findViewById(R.id.scorem1);
                            i.putExtra("option", optm11.getText().toString());

                            i.putExtra("Score", scorem1.getText().toString());
                            startActivity(i);
                            finish();
                        }
                    }, 200);

                }
            });



            final Button optm12 = findViewById(R.id.optm12);
            optm12.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    myn.cancel();
                    final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                    optm12.startAnimation(myAnim);

                    MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                    myAnim.setInterpolator(interpolator);

                    optm12.startAnimation(myAnim);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Intent i = new Intent(Methamat.this, Mathemata2.class);
                            TextView scorem1 = findViewById(R.id.scorem1);
                            i.putExtra("option", optm12.getText().toString());
                            i.putExtra("Score", scorem1.getText().toString());
                            startActivity(i);
                            finish();
                        }
                    }, 200);

                }

            });
        final Button optm13 = findViewById(R.id.optm13);
        optm13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myn.cancel();
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                optm13.startAnimation(myAnim);

                MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                myAnim.setInterpolator(interpolator);

                optm13.startAnimation(myAnim);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i = new Intent(Methamat.this, Mathemata2.class);
                        TextView scorem1 = findViewById(R.id.scorem1);
                        i.putExtra("option", optm13.getText().toString());
                        i.putExtra("Score", scorem1.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 200);

            }

        });
        final Button optm14 = findViewById(R.id.optm14);
        optm14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                myn.cancel();
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                optm14.startAnimation(myAnim);

                MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                myAnim.setInterpolator(interpolator);

                optm14.startAnimation(myAnim);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i = new Intent(Methamat.this, Mathemata2.class);
                        TextView scorem1 = findViewById(R.id.scorem1);
                        i.putExtra("option", optm14.getText().toString());
                        i.putExtra("Score", scorem1.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 200);
            }
        });
    }
}
