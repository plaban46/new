package com.example.lab_test;

public class book extends genre{

    public String title;
    public String author;

    public void add_book(String title, String author, String genre, String units){
        if(genre.contains("mystery")){
            this.title = title;
            this.author = author;
             mystery.add(title);
        }else if(genre.contains("fantasy")){
            this.title = title;
            this.author = author;
            fantasy.add(title);
        }else if(genre.contains("thriller")){
            this.title = title;
            this.author = author;
            thriller.add(title);
        }
    }
    public void borrow_book(String title,String units){

    }

}
