package com.procured.android.procured_inc;

import android.app.Activity;
import android.os.Bundle;


public class Activity_Honeycomb extends DashBoardActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honeycomb);
        setHeader(getString(R.string.HoneycombActivityTitle), true, true);

    }
}
