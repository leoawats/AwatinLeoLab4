package com.awatin.leo;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class AwatinLeoLab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awatin_leo_lab4);
    }

    protected void onStart(){
        super.onStart();
        Log.d("4ITC", "onStart() has started");
    }

    protected void onResume() {
        super.onResume();
        Log.d("4ITC", "onStart() has started");
    }

    protected void onPause() {
        super.onPause();
        Log.d("4ITC", "onStart() has started");
    }

    protected void onStop() {
        super.onStop();
        Log.d("4ITC", "onStart() has started");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("4ITC", "onStart() has started");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITC", "onStart() has started");
    }

    public void showToast(View toast) {
        Toast.makeText ( this, "Sending message...", Toast.LENGTH_LONG).show();
    }

    public void showSnackbar(View bar) {
        Snackbar.make(bar,  "Sending message...", Snackbar.LENGTH_LONG).show();
    }
}