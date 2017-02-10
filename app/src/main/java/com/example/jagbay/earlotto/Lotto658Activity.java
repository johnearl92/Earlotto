package com.example.jagbay.earlotto;

import android.os.Bundle;

public class Lotto658Activity extends Game {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotto658);
        this.setBoundary(59);
        this.setTxtView(R.id.content_658);
        generateNum();
    }
}
