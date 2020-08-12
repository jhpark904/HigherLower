package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num = (int) (Math.random() * 20 + 1);
    public void guess(View view) {
        EditText input = (EditText) findViewById(R.id.numberEditText);
        int intInput = Integer.parseInt(input.getText().toString());
        Log.i("check", "" + intInput + " "+ num);
        String message = "";
        if (num > intInput) {
            message = "Higher";
        } else if (num < intInput) {
            message = "Lower";
        } else {
            message = "Correct! Try again";
            num = (int) (Math.random() * 20 + 1);
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}