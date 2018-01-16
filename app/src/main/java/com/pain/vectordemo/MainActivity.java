package com.pain.vectordemo;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * 注意做版本判断 sdk版本大于21才会有path动画
 * 矢量图的大小默认由iamgeview决定
 * 如果矢量图动画开启，则矢量图path发生改变时 from 和to的操作数要保持一致
 */
public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        Drawable drawable = imageView.getDrawable();
        if(drawable instanceof Animatable){
            ((Animatable) drawable).start();
        }

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = imageView.getDrawable();
                if(drawable instanceof Animatable){
                    ((Animatable) drawable).start();
                }
            }
        });
    }
}
