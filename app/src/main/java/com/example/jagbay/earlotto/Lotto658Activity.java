package com.example.jagbay.earlotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto658Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotto658);
        generateNum();
    }

    public void generateNum(){
        Random r = new Random();
        List<Integer> numList = new ArrayList<Integer>();
        StringBuilder str = new StringBuilder();
        while(numList.size()<6){
            Integer num = r.nextInt(59);
            if((num != 0)&&(!numList.contains(num))){
                numList.add(num);
            }
        }
        Collections.sort(numList);

        for(Integer number:numList){
            str.append(number+" ");
        }

        TextView textView = (TextView) findViewById(R.id.content_658);
        textView.setTextSize(40);
        textView.setText(str);
    }

    public void generate(View view){
        generateNum();
    }
}
