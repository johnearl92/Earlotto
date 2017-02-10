package com.example.jagbay.earlotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Lotto649Activity extends Game {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotto649);
        this.setBoundary(50);
        this.setTxtView(R.id.content_649);
        generateNum();
    }
}
