package com.example.usuario.canvas;

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

public class Main3Activity extends AppCompatActivity {

    Mycanvas myCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        myCanvas=findViewById(R.id.vFrame);
        Button canvas1=findViewById(R.id.canvas1);

        canvas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
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

            //Circulos
            for(int i=0;i<500;i+=10){
                int a=(int)(Math.random()*500)+1;
                int r=(int)(Math.random()*500)+1;
                int g=(int)(Math.random()*500)+1;
                int b=(int)(Math.random()*500)+1;
                mpaint.setARGB(a,r,g,b);
                canvas.drawCircle(maxW/2,maxH/2,i*2,mpaint);
            }

        }

        @Override
        public void setOnTouchListener(OnTouchListener l) {
            super.setOnTouchListener(l);
        }

    }
}
