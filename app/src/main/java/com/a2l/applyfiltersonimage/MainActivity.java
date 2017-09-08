package com.a2l.applyfiltersonimage;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageview;
    Button blue, red, reddark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview = (ImageView) findViewById(R.id.imageview);
        blue = (Button) findViewById(R.id.blue);
        red = (Button) findViewById(R.id.red);
        reddark = (Button) findViewById(R.id.reddark);
        blue.setOnClickListener(this);
        red.setOnClickListener(this);
        reddark.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.blue:
                ColorMatrix matrix = new ColorMatrix();
                matrix.setSaturation(0);
                ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
                imageview.setColorFilter(filter);
                break;
            case R.id.red:
                ColorMatrix matrix2 = new ColorMatrix();
                matrix2.setSaturation(50);
                ColorMatrixColorFilter filter2 = new ColorMatrixColorFilter(matrix2);
                imageview.setColorFilter(filter2);
                break;
            case R.id.reddark:
                ColorMatrix matrix3 = new ColorMatrix();
                matrix3.setSaturation(50);
                ColorMatrixColorFilter filter3 = new ColorMatrixColorFilter(matrix3);
                imageview.setColorFilter(filter3);
                break;

        }
    }
}
