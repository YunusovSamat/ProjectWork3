package com.example.systemintentsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickShowWeb(View v) {
        intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://developer.android.com/"));
        startActivity(intent);
    }


    public void onClickShowMap(View v) {
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:55.749479,37.613944"));
        startActivity(intent);
    }


    public void onClickShowCall(View v) {
        intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:12345"));
        startActivity(intent);
    }
}
