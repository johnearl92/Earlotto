package com.example.jagbay.earlotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Lotto645Activity extends Game {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotto645);
        this.setBoundary(46);
        this.setTxtView(R.id.content_645);
        generateNum();
    }
}
