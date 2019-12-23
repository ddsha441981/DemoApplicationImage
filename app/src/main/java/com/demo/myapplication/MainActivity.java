package com.demo.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //for button send Now
    public void sendNow(View view){

        //for display
        Toast.makeText(this, "Sending data from the app......", Toast.LENGTH_SHORT).show();
    }

    //for button receive now
    public void receiveNow(View view){

        //for display
        Toast.makeText(this, "Receiving data from the app....", Toast.LENGTH_SHORT).show();
    }


    //for button delete now
    public void deleteNow(View view){

        //for display
        Toast.makeText(this, "Deleting data from the app....", Toast.LENGTH_SHORT).show();
        
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
