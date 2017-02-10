package com.example.jagbay.earlotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SuetresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suetres);
        generateNum();
    }

    public void generateNum(){
        Random r = new Random();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<3;i++){
            str.append(r.nextInt(10)+" ");
        }

        TextView textView = (TextView) findViewById(R.id.content_suet);
        textView.setTextSize(40);
        textView.setText(str);
    }

    public void generate(View view){
        generateNum();
    }

}
