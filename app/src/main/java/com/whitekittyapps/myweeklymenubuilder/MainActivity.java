package com.whitekittyapps.myweeklymenubuilder;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.widget.TextView;

import com.whitekittyapps.myweeklymenubuilder.Listeners.AddWeekButtonClickListener;

public class MainActivity extends BaseAuthorizedActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context ctx = getApplicationContext();

        FloatingActionButton btnCreateWeek = findViewById(R.id.btn_add_week);
        btnCreateWeek.setOnClickListener(new AddWeekButtonClickListener(ctx));

        if (user == null) {
            return;
        }
        ((TextView)findViewById(R.id.list_weeks_welcome)).setText(String.format("Hi %s!", user.getDisplayName()));
    }
}
