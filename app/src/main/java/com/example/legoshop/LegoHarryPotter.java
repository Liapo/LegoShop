package com.example.legoshop;

public class LegoHarryPotter{
 private String name; private String item_code; private String age; private String pieces; private int imageResourceId;
 public static final LegoHarryPotter[] lego_hr = {
         new LegoHarryPotter("LEGO Harry Potter Автобус «Ночной рыцарь»", "75957","8+", "403",R.drawable.lego_hr75957),
         new LegoHarryPotter("LEGO Harry Potter Астрономическая башня Хогвартса","75969","9+","971", R.drawable.lego_hr75969),
         new LegoHarryPotter("LEGO Harry Potter Новогодний календарь ","75964","9+","305",R.drawable.lego_hr75964)
 };

 public LegoHarryPotter(String name, String item_code, String age, String pieces, int imageResourceId) {
  this.name=name;
  this.item_code=item_code;
  this.age=age;
  this.pieces=pieces;
  this.imageResourceId=imageResourceId;
 }
 public String getName(){return name;}
 public String getItem_code(){return item_code;}
 public String getAge(){return age;}
 public String getPieces(){return pieces;};
 public int getImageResourceId(){return imageResourceId;}



}
