package com.example.activityforresultapp;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bSend;
    private EditText etData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        etData = findViewById(R.id.etDate);
        bSend = findViewById(R.id.bSend);

        bSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("name", etData.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
