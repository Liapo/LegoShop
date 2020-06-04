package com.example.legoshop;

public class LegoMinions {
    private String name; private String item_code; private String age; private String pieces; private int imageResourceId;

    public static final LegoMinions[] lego_minions = {
            new LegoMinions("LEGO Minions: The Rise of Gru Миньоны и их дом","75551","8+","876", R.drawable.lego_minions75551),
            new LegoMinions("LEGO Minions: The Rise of Gru Невероятная погоня на мотоцикле ","75549","6+","136", R.drawable.lego_minions75549)
    };

    public LegoMinions(String name, String item_code, String age, String pieces, int imageResourceId) {
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
