package com.example.sumi.bcuadm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by sumi on 8/28/15.
 */
public class AboutActivity extends manhinh implements View.OnClickListener {
    Button btnbackabout;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutabottt);
        btnbackabout=(Button)findViewById(R.id.btnbackabout);
        btnbackabout.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        finish();
    }
}
