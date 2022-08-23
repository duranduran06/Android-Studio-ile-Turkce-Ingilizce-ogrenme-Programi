package com.example.Turk_Ing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void telaffuzagit(View view) {
        Intent git=new Intent(getApplicationContext(),telaffuzActivity.class);
        startActivity(git);
    }
    public void buttonhikayegit(View view) {
        Intent git=new Intent(getApplicationContext(),HikayeActivity.class);
        startActivity(git);
    }
    public void testgit(View view)
    {
        Intent git=new Intent(getApplicationContext(),TestActivity.class);
        startActivity(git);
    }

    public void oyungit(View view) {
        Intent git=new Intent(getApplicationContext(),oyunActivity.class);
        startActivity(git);
    }
}