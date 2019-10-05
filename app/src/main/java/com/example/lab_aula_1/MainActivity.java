package com.example.lab_aula_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendToB(View view) {
        // Do something in response to button
        Intent i = new Intent(this, ActivityB.class);
        startActivityForResult(i, 1);
    }


    /** Called when the user taps the Send button */
    public void sendToC(View view) {
        // Do something in response to button
        Intent i = new Intent(this, ActivityC.class);
        startActivityForResult(i, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                String result = data.getStringExtra("result");
                TextView textViewA = (TextView) findViewById(R.id.textViewA);
                textViewA.setText("You came from " + result);
            }
        }
    }//onActivityResult

}
