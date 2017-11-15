package com.example.timme.timmeijer_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageArms, imageMust, imageMouth, imageNose, imageShoes, imageGlasses, imageHat,
        imageEars, imageEyebrows, imageEyes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageArms = findViewById(R.id.imageArms);
        imageArms.setVisibility(View.INVISIBLE);
        imageEars = findViewById(R.id.imageEars);
        imageEars.setVisibility(View.INVISIBLE);
        imageMust = findViewById(R.id.imageMust);
        imageMust.setVisibility(View.INVISIBLE);
        imageNose = findViewById(R.id.imageNose);
        imageNose.setVisibility(View.INVISIBLE);
        imageShoes = findViewById(R.id.imageShoes);
        imageShoes.setVisibility(View.INVISIBLE);
        imageGlasses = findViewById(R.id.imageGlasses);
        imageGlasses.setVisibility(View.INVISIBLE);
        imageEyebrows = findViewById(R.id.imageEyebrows);
        imageEyebrows.setVisibility(View.INVISIBLE);
        imageEyes = findViewById(R.id.imageEyes);
        imageEyes.setVisibility(View.INVISIBLE);
        imageMouth = findViewById(R.id.imageMouth);
        imageMouth.setVisibility(View.INVISIBLE);
        imageHat = findViewById(R.id.imageHat);
        imageHat.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Arms", imageArms.getVisibility());
        outState.putInt("Ears", imageEars.getVisibility());
        outState.putInt("Hat", imageHat.getVisibility());
        outState.putInt("Shoes", imageShoes.getVisibility());
        outState.putInt("Eyes", imageEyes.getVisibility());
        outState.putInt("Eyebrows", imageEyebrows.getVisibility());
        outState.putInt("Nose", imageNose.getVisibility());
        outState.putInt("Mouth", imageMouth.getVisibility());
        outState.putInt("Glasses", imageGlasses.getVisibility());
        outState.putInt("Must", imageMust.getVisibility());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        imageArms.setVisibility(savedInstanceState.getInt("Arms"));
        imageEars.setVisibility(savedInstanceState.getInt("Ears"));
        imageMust.setVisibility(savedInstanceState.getInt("Must"));
        imageNose.setVisibility(savedInstanceState.getInt("Nose"));
        imageShoes.setVisibility(savedInstanceState.getInt("Shoes"));
        imageGlasses.setVisibility(savedInstanceState.getInt("Glasses"));
        imageEyebrows.setVisibility(savedInstanceState.getInt("Eyebrows"));
        imageEyes.setVisibility(savedInstanceState.getInt("Eyes"));
        imageMouth.setVisibility(savedInstanceState.getInt("Mouth"));
        imageHat.setVisibility(savedInstanceState.getInt("Hat"));
    }

    // on checkbox click
    public void click(View view) {
        CheckBox checkbox = (CheckBox) view;
        int id = checkbox.getId();
        ImageView corView;

        // find corresponding ImageView
        switch(id) {
            case R.id.checkShoes:
                corView = imageShoes;
                break;
            case R.id.checkEyes:
                corView = imageEyes;
                break;
            case R.id.checkMust:
                corView = imageMust;
                break;
            case R.id.checkArms:
                corView = imageArms;
                break;
            case R.id.checkHat:
                corView = imageHat;
                break;
            case R.id.checkEars:
                corView = imageEars;
                break;
            case R.id.checkEyebrows:
                corView = imageEyebrows;
                break;
            case R.id.checkGlasses:
                corView = imageGlasses;
                break;
            case R.id.checkMouth:
                corView = imageMouth;
                break;
            default:
                corView = imageNose;
                break;
        }

        // set viewVis correct
        if (checkbox.isChecked()) {
            corView.setVisibility(View.VISIBLE);
        }
        else {
            corView.setVisibility(View.INVISIBLE);
        }
    }
}

