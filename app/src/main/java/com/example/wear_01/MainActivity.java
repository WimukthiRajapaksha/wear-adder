package com.example.wear_01;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends WearableActivity {

    private TextView textView;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.count);
        count = 0;

    }

    public void onPlus(View view) {
        count ++;
        textView.setText(Integer.toString(count));
    }

    public void onReset(View view) {
        count = 0;
        textView.setText(Integer.toString(count));
    }
}
