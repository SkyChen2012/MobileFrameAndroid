package com.benson.mobileframe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.benson.mobileframe.React.ReactActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent =new Intent(MainActivity.this,ReactActivity.class);
        //启动
        startActivity(intent);

    }
}
