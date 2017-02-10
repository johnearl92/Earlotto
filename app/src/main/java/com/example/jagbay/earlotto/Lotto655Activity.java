package com.example.jagbay.earlotto;

import android.os.Bundle;
import android.util.Log;

public class Lotto655Activity extends Game {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotto655);
        this.setBoundary(56);
        this.setTxtView(R.id.content_655);
        generateNum();
    }
}
