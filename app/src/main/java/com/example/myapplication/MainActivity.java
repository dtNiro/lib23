package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapp_list.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Click(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void Clicktwo(View view){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}