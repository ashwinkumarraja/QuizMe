package com.bolt.quizme.quizme;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

public class End extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        String str = getIntent().getStringExtra("option");
        String str2 = getIntent().getStringExtra("Score");
        TextView score = findViewById(R.id.score);

        int z=Integer.parseInt(str2);
        if(str.equals("time's up")){
            score.setText(str2);
        }
        else if(str.equals("1")) {
            z++;
            str2 = Integer.toString(z);
            score.setText(str2);
        }
        else if(str.equals("Dwapara Yuga")) {
            z++;
            str2 = Integer.toString(z);
            score.setText(str2);
        }
        else if(str.equals("Ford")) {
            z++;
            str2 = Integer.toString(z);
            score.setText(str2);
        }
        else if(str.equals("Swimming")) {
            z++;
            str2 = Integer.toString(z);
            score.setText(str2);
        }

        else if(str.equals("Ivory Coast")) {
            z++;
            str2 = Integer.toString(z);
            score.setText(str2);
        }
        else if(str.equals("Gucci")) {
            z++;
            str2 = Integer.toString(z);
            score.setText(str2);
        }

        else {
            score.setText(str2);
        }

        ImageView i = findViewById(R.id.imageView9);
        switch(z)
        {
            case 0 :
            i.setImageResource(R.drawable.tryhard);
                break;
            case 1 :
                i.setImageResource(R.drawable.tryhard);
                break;
            case 2 :
                i.setImageResource(R.drawable.tryhard);
                break;
            case 3 :
                i.setImageResource(R.drawable.second);
                break;
            case 4 :
                i.setImageResource(R.drawable.first);
                break;



        }
    }

        public void end(View v){
            Intent iii = new Intent(End.this, MainActivity.class);
            startActivity(iii);
            finish();
            Toast.makeText(getApplicationContext(), "Hope you Enjoyed! :) ",
                    Toast.LENGTH_LONG).show();
        }



}

