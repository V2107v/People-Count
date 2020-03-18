package com.example.peoplecount;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends WearableActivity {
    TextView textView;

    int count = 0;

    public void increment(View view) {
        count++;
        textView.setText(Integer.toString(count));
    }

    public void reset(View view) {
        count = 0;
        textView.setText(Integer.toString(count));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       textView = findViewById(R.id.textView);

        // Enables Always-on
        setAmbientEnabled();
    }
}
