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
import android.widget.TextView;

import org.w3c.dom.Text;

public class Mathemata2 extends AppCompatActivity {
    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathemata2);

        String str = getIntent().getStringExtra("option");
        String str2 = getIntent().getStringExtra("Score");
        TextView scorem2 = findViewById(R.id.scorem2);
        int z;
        if(str.equals("time's up")){
            scorem2.setText(str2);
        }
        else if(str.equals("6")){
            int s =Integer.parseInt(str2);
            s++;
            str2 = Integer.toString(s);
            scorem2.setText(str2);

        }
        else{
            scorem2.setText(str2);
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

                    TextView scorem2 =findViewById(R.id.scorem2);
                    Intent i=new Intent(Mathemata2.this,Mathemata3.class);
                    i.putExtra("option", "time's up");
                    i.putExtra("Score", scorem2.getText().toString());
                    startActivity(i);
                    finish();
                }
            }, 1500);
        }
    }.start();

        final Button optm21 = findViewById(R.id.optm21);
        optm21.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            myn.cancel();
            final Animation myAnim;
            myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            optm21.startAnimation(myAnim);

            MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
            myAnim.setInterpolator(interpolator);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent i=new Intent(Mathemata2.this,Mathemata3.class);
                    TextView scorem2 = findViewById(R.id.scorem2);
                    i.putExtra("option",optm21.getText().toString());
                    i.putExtra("Score", scorem2.getText().toString());
                    startActivity(i);
                    finish();
                }
            }, 200);

    }
        });
        final Button optm22 = (Button)findViewById(R.id.optm22);
        optm22.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myn.cancel();
                final Animation myAnim;
                myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                optm22.startAnimation(myAnim);

                MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
                myAnim.setInterpolator(interpolator);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i=new Intent(Mathemata2.this,Mathemata3.class);
                        TextView scorem2 = findViewById(R.id.scorem2);
                        i.putExtra("option",optm22.getText().toString());
                        i.putExtra("Score", scorem2.getText().toString());
                        startActivity(i);
                        finish();
                    }
                }, 200);
            }
        });
    final Button optm23 = (Button)findViewById(R.id.optm23);
        optm23.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            myn.cancel();
            final Animation myAnim;
            myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            optm23.startAnimation(myAnim);

            MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
            myAnim.setInterpolator(interpolator);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent i=new Intent(Mathemata2.this,Mathemata3.class);
                    TextView scorem2 = findViewById(R.id.scorem2);
                    i.putExtra("option",optm23.getText().toString());
                    i.putExtra("Score", scorem2.getText().toString());
                    startActivity(i);
                    finish();
                }
            }, 200);
        }
    });

    final Button optm24 = (Button)findViewById(R.id.optm24);
        optm24.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            myn.cancel();
            final Animation myAnim;
            myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
            optm24.startAnimation(myAnim);

            MyBounceInterpolater interpolator = new MyBounceInterpolater(0.2, 20);
            myAnim.setInterpolator(interpolator);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i=new Intent(Mathemata2.this,Mathemata3.class);
                    TextView scorem2 = findViewById(R.id.scorem2);
                    i.putExtra("option",optm24.getText().toString());
                    i.putExtra("Score", scorem2.getText().toString());
                    startActivity(i);
                    finish();
                }
            }, 200);
        }
    });
}
}

