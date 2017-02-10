package com.example.jagbay.earlotto;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by jagbay on 2/10/2017.
 */

public class Game extends AppCompatActivity {

    private int boundary;
    private int txtView;

    public int getBoundary() {
        return boundary;
    }

    public void setBoundary(int boundary) {
        this.boundary = boundary;
    }

    public int getTxtView() {
        return txtView;
    }

    public void setTxtView(int txtView) {
        this.txtView = txtView;
    }

    public void generateNum(){
        Random r = new Random();
        List<Integer> numList = new ArrayList<Integer>();
        StringBuilder str = new StringBuilder();
        while(numList.size()<6){
            Integer num = r.nextInt(this.getBoundary());
            if((num != 0)&&(!numList.contains(num))){
                numList.add(num);
            }
        }
        Collections.sort(numList);
        for(int i=0;i<numList.size();i++){
            if(i==3)
                str.append("\n");
            str.append(numList.get(i)+"  ");
        }

        TextView textView = (TextView) findViewById(this.getTxtView());
        Log.i("Game","textViewId: "+this.getTxtView());
        textView.setTextSize(40);
        textView.setText(str);
    }

    public void generate(View view){
        generateNum();
    }
}
