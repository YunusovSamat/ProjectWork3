package com.example.simplefragmentapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Fragment fragment1, fragment2;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
    }


    public void onClick(View v) {
        fragmentManager = getSupportFragmentManager();
        switch (v.getId()) {
            case R.id.btnFragment1:
                fragmentManager.beginTransaction().replace(R.id.frgmCont, fragment1).commit();
                break;

            case  R.id.btnFragment2:
                fragmentManager.beginTransaction().replace(R.id.frgmCont, fragment2).commit();
                break;
        }
    }
}
