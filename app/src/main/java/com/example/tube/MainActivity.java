package com.example.tube;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView cricket = findViewById(R.id.cricket);
        //cricket.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.nature2);
        MediaController mediaController = new MediaController(this);
        cricket.setMediaController(mediaController);
        mediaController.setAnchorView(cricket);
        cricket.start();
    }

    public void play(View view){
        VideoView cricket = findViewById(R.id.cricket);
        cricket.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.nature1);
        cricket.start();

    }

    public void play2(View view){
        VideoView cricket = findViewById(R.id.cricket);
        cricket.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.nature2);
        cricket.start();

    }

    public void play3(View view){
        VideoView cricket = findViewById(R.id.cricket);
        cricket.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.nature3);
        cricket.start();

    }

    public void play4(View view){
        VideoView cricket = findViewById(R.id.cricket);
        cricket.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.nature4);
        cricket.start();

    }

    public void play5(View view){
        VideoView cricket = findViewById(R.id.cricket);
        cricket.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.nature5);
        cricket.start();

    }

    public void play6(View view){
        VideoView cricket = findViewById(R.id.cricket);
        cricket.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.nature6);
        cricket.start();

    }
}