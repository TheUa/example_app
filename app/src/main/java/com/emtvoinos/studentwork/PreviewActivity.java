package com.emtvoinos.studentwork;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PreviewActivity extends AppCompatActivity {

    private BounceLoadingView loadingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);


        loadingView = findViewById(R.id.loadingView);

        loadingView.addBitmap(R.drawable.mp1);
        loadingView.addBitmap(R.drawable.mp2);
        loadingView.addBitmap(R.drawable.mp3);
        loadingView.addBitmap(R.drawable.mp4);
        loadingView.addBitmap(R.drawable.mp5);
        loadingView.addBitmap(R.drawable.mp6);
        loadingView.addBitmap(R.drawable.mp7);
        loadingView.addBitmap(R.drawable.mp9);
        loadingView.setShadowColor(Color.DKGRAY);
        loadingView.setDuration(900);
        loadingView.start();

    }
}
