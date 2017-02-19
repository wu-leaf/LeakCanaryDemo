package com.veyron.www.leakcanarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityPool.getActivity().addActivity(this);
        //对象一直被ActivityPool应引用，导致不能及时回收
    }
}
