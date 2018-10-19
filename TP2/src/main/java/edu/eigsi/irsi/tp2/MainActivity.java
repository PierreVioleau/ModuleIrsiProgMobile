package edu.eigsi.irsi.tp2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"ça marche !", Toast.LENGTH_LONG).show();
        Log.i("MonInfo","OnCreate");
    }

    protected void onDestroy() {
        Toast.makeText(this,"onDestroy", Toast.LENGTH_LONG).show();
        Log.i("destroy","onDestroy");
        super.onDestroy();
        //setContentView(R.layout.activity_main);
    }

    protected void onStart() {
        super.onStart();
        //setContentView(R.layout.activity_main);
        Toast.makeText(this,"onStart", Toast.LENGTH_LONG).show();
        Log.i("start","onStart");
    }

    protected void onStop() {
        Toast.makeText(this,"onStop", Toast.LENGTH_LONG).show();
        Log.i("stop","onStop");
        super.onStop();
        //setContentView(R.layout.activity_main);

    }

    protected void onRestart() {
        super.onRestart();
        //setContentView(R.layout.activity_main);
        Toast.makeText(this,"onRestart", Toast.LENGTH_LONG).show();
        Log.i("restart","onRestart");
    }

    protected void onPause() {
        Toast.makeText(this,"en pause", Toast.LENGTH_LONG).show();
        Log.i("pause","onPause");
        super.onPause();
        //setContentView(R.layout.activity_main);

    }

    protected void onResume() {
        super.onResume();
        //setContentView(R.layout.activity_main);
        Toast.makeText(this,"onResume", Toast.LENGTH_LONG).show();
        Log.i("resume","onResume");
    }

    protected void onSaveInstanceState(Bundle savedInstanceState) {
        Toast.makeText(this,"OnSaveInstanceState", Toast.LENGTH_LONG).show();
        Log.i("save","OnSaveInstanceState");
        super.onSaveInstanceState(savedInstanceState);
        //setContentView(R.layout.activity_main);

    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Toast.makeText(this,"OnRestoreInstanceState", Toast.LENGTH_LONG).show();
        Log.i("restore","OnRestoreInstanceState");
    }
}
