package com.example.animationlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void animate (View view) {

        ImageView cat2 = (ImageView) findViewById(R.id.cat2);

        cat2.animate().translationXBy(2000f).rotation(360).scaleX(0.5f).scaleY(0.5f).setDuration(2000);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView cat2 = (ImageView) findViewById(R.id.cat2);

        cat2.setTranslationX(-2000f);



    }
}
