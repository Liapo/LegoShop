package com.example.legoshop;

public class LegoDisney {
    private String name; private String item_code; private String age; private String pieces; private int imageResourceId;

    public static final LegoDisney[] lego_disney = {
            new LegoDisney("LEGO Disney Princess Замок Аренделл","41167","4+","521",R.drawable.lego_disney41167),
            new LegoDisney("LEGO Disney Princess™ Книга приключений Белль","43177","5+","111", R.drawable.lego_disney43177),
            new LegoDisney("LEGO Trolls Вечеринка на Техно-рифе","41250","4+","173",R.drawable.lego_disney41250),
            new LegoDisney("LEGO Toy Story 4 Приключение Базза и Бо Пипа на детской площадке","10768","4+","139",R.drawable.lego_disney10768)
    };

    public LegoDisney(String name, String item_code, String age, String pieces, int imageResourceId) {
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
