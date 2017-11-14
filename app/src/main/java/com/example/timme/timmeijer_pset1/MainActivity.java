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
        imageEars = findViewById(R.id.imageEars);
        imageMust = findViewById(R.id.imageMust);
        imageNose = findViewById(R.id.imageNose);
        imageShoes = findViewById(R.id.imageShoes);
        imageGlasses = findViewById(R.id.imageGlasses);
        imageEyebrows = findViewById(R.id.imageEyebrows);
        imageEyes = findViewById(R.id.imageEyes);
        imageMouth = findViewById(R.id.imageMouth);
        imageHat = findViewById(R.id.imageHat);
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

