package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.myapp_list.R;

public class MainActivity3 extends AppCompatActivity {

    EditText name_in;
    EditText author_in;
    EditText year_of_create_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }


    public void Clickfive(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void Clickfour(View view){
        name_in = findViewById(R.id.name_in);
        String name = name_in.getText().toString();

        author_in = findViewById(R.id.author_in);
        String author = author_in.getText().toString();

        year_of_create_in = findViewById(R.id.year_of_create_in);
        String year = year_of_create_in.getText().toString();


        if(!name.isEmpty() && !author.isEmpty() && !year.isEmpty()){

            Book.Add(author,name,year);

            name_in.setText("");
            author_in.setText("");
            year_of_create_in.setText("");

            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);


        }
    }
}