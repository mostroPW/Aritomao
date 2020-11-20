package com.example.aritomao;

import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;


public class StoryActivity extends AppCompatActivity implements OnClickListener{
    private Button button1;
    @Override
        public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        String string = getString(R.string.story);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(string);

        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(this);


    }
    public void onClick(View v){
        if(v==button1){
            Intent intent = new Intent(this, GameActivity.class);
            startActivityForResult(intent, 0);
        }
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        ImageView img = (ImageView) findViewById(R.id.imageView2);
        img.setBackgroundResource(R.drawable.story_anime);
        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
        frameAnimation.start();
    }
}
