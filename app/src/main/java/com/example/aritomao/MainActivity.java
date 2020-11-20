package com.example.aritomao;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    ImageButton  start;
    ImageButton  end;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Typeface customFont = Typeface.createFromAsset(getAssets(), "genkai-mincho.ttf");
        TextView myText1 = findViewById(R.id.textView1);
        myText1.setTypeface(customFont);
        myText1.setTextColor(Color.BLUE);
        TextView myText2 = findViewById(R.id.textView2);
        myText2.setTypeface(customFont);
        TextView myText3 = findViewById(R.id.textView3);
        myText3.setTypeface(customFont);
        myText3.setTextColor(Color.RED);

        start = (ImageButton) findViewById(R.id.imageButton);
        start.setOnClickListener(this);
        end = (ImageButton) findViewById(R.id.imageButton2);
        end.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v==start){
                Intent intent = new Intent(this, StoryActivity.class);
                startActivityForResult(intent, 0);
            }
        if(v==end){
                finish();
            }
        }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
    //start.setOnClickListener(this);
    }






