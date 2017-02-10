package com.example.jagbay.earlotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Lotto642Activity extends Game {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotto642);
        this.setBoundary(43);
        this.setTxtView(R.id.content_642);
        generateNum();
    }
}
