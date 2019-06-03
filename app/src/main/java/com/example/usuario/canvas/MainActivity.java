package com.example.usuario.canvas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Mycanvas myCanvas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       myCanvas=findViewById(R.id.vFrame);
        Button canvas1=findViewById(R.id.canvas1);

        canvas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });

    }

    public static class Mycanvas extends View{
        private Paint mpaint;

        public Mycanvas(Context context){
            super(context);
        }

        public  Mycanvas(Context context, @Nullable AttributeSet attrs){
            super(context,attrs);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            mpaint= new Paint();
            mpaint.setAntiAlias(true);
            mpaint.setColor(Color.RED);
            mpaint.setStyle(Paint.Style.STROKE);
            mpaint.setStrokeWidth(10f);
            float maxW = canvas.getWidth();
            float maxH = canvas.getHeight();
            /*float offset = 10;
            for (int i = 0; i < maxW; i += offset) {
                canvas.drawLine(maxW-i,0,0,i,mpaint);
            }*/

            //caratula
            int a=(int)(Math.random()*500)+1;
            int r=(int)(Math.random()*500)+1;
            int g=(int)(Math.random()*500)+1;
            int b=(int)(Math.random()*500)+1;
            mpaint.setARGB(a,r,g,b);
            for (int i = 0; i < maxW; i += 40) {
                canvas.drawLine(maxW-i,0,0,i,mpaint);
            }
            a=(int)(Math.random()*500)+1;
            r=(int)(Math.random()*500)+1;
            g=(int)(Math.random()*500)+1;
            b=(int)(Math.random()*500)+1;
            mpaint.setARGB(a,r,g,b);
            for (int i = 0; i < maxW; i += 40) {
                canvas.drawLine(0+i,maxH,maxW,maxH-i,mpaint);
            }

        }

        @Override
        public void setOnTouchListener(OnTouchListener l) {
            super.setOnTouchListener(l);
        }

    }
}
