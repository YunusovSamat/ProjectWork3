package com.example.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent intent = new Intent(Intent.ACTION_PICK);
//        intent.setType("*/*");
//        startActivityForResult(intent, 1);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "mirea");
        Intent chosenIntent = Intent.createChooser(intent, "Title to dialog");
        startActivity(chosenIntent);
    }
}
