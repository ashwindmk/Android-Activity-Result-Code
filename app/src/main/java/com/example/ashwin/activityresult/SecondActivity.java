package com.example.ashwin.activityresult;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ashwin on 24/9/16.
 */

public class SecondActivity extends AppCompatActivity {

    //private final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void ok(View view)
    {
        setResult(RESULT_OK);
        finish();
    }

    public void canceled(View view)
    {
        setResult(RESULT_CANCELED);
        finish();
    }

}
