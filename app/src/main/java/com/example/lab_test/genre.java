package com.example.lab_test;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class genre extends info{

            static List<String> mystery = new ArrayList<>();
            static  List<String> fantasy = new ArrayList<>();
            static List<String> thriller = new ArrayList<>();


            public void show_book_info_by_genre(TextView textView,String genre) {

                if(genre.contains("mystery")){
                    Log.d("my_all_values", "show_book_info_by_genre: "+mystery);
                    textView.setText(String.valueOf(mystery));
                    //System.out.println("List values before insertion - " + list1);
                }else if(genre.contains("fantasy")){
                    Log.d("my_all_values", "show_book_info_by_genre: "+fantasy);
                }else if(genre.contains("thriller")){
                    Log.d("my_all_values", "show_book_info_by_genre: "+thriller);
                }
            }


//            al.add(10);
//            al.add(20);
//            al.add(30);
//            al.add(1);
//            al.add(2);
//
//             System.out.println(al);
//
//            al.remove(1);
//
//            al.remove(1);
//
//             System.out.println(al);
//        }


}
