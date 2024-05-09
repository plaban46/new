package com.example.lab_test;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //book boo = new book();
        //boo.add_book("CSE","KUET","mystery","1");


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText et1 = findViewById(R.id.et1);
                EditText et2 = findViewById(R.id.et2new);
                EditText et3 = findViewById(R.id.et3);

                book boo = new book();
                boo.add_book(et2.getText().toString(),et3.getText().toString(),et1.getText().toString(),"1");

                if(et1.getText().toString().equals("mystery")){

                }else if(et1.getText().toString().equals("fantasy")){

                }else if(et1.getText().toString().equals("thriller")){

                }
            }
        });

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText et1 = findViewById(R.id.et1);
                genre ge = new genre();
                TextView textView = findViewById(R.id.tv);

                if(et1.getText().toString().equals("mystery")){
                         ge.show_book_info_by_genre(textView,"mystery");
                }else if(et1.getText().toString().equals("fantasy")){
                        ge.show_book_info_by_genre(textView,"fantasy");
                }else if(et1.getText().toString().equals("thriller")){
                        ge.show_book_info_by_genre(textView,"thriller");
                }
            }
        });

    }
}