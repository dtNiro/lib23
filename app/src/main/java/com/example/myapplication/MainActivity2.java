package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapp_list.R;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    Book_adapter bookAdapter;
    ArrayList<Book> books = new ArrayList<Book>();
    ListView bookList;

    EditText name_in;
    EditText author_in;
    EditText year_of_create_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //SetInitialDate();
        bookList= findViewById(R.id.bookList);

        bookAdapter = new Book_adapter(this,R.layout.book_layout, Book.boks);
        bookList.setAdapter(bookAdapter);
    }
    private void SetInitialDate(){
        Book.Add("L.Tolstoi","War and world", "1867 y.");
        Book.Add("L.Tooi","War anddvgvsdfvds world", "1867fff y.");
    }
    public void VVVV(){
        Book.Adddd("L.Tolstoi","War and world", "1867 y.");
    }

    public void Clickthree(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}