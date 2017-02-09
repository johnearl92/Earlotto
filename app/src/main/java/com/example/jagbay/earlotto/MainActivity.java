package com.example.jagbay.earlotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSuetres(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, SuetresActivity.class);
        startActivity(intent);
    }

    public void startLotto658(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Lotto658Activity.class);
        startActivity(intent);
    }

    public void startLotto655(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Lotto655Activity.class);
        startActivity(intent);
    }

    public void startLotto649(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Lotto649Activity.class);
        startActivity(intent);
    }

    public void startLotto645(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Lotto645Activity.class);
        startActivity(intent);
    }

    public void startLotto642(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Lotto642Activity.class);
        startActivity(intent);
    }
}
