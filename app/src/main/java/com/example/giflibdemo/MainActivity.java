package com.example.giflibdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.InputStream;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "mygif";

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.iv);

        String gif = "http://2zhoumu-comic-public-test.oss-cn-hangzhou.aliyuncs.com/cover/comic/gc1100004.gif";
        GlideApp.with(this).as(FrameSequenceDrawable.class).load(gif).into(imageView);
    }
}
