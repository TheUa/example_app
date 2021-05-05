package com.emtvoinos.studentwork;



public enum Symbols {
    LEOPARD(100, "@drawable/mp9"),
    RHINO(80, "@drawable/mp5"),
    LION(75, "@drawable/lion"),
    BUFFALO(60, "@drawable/mp2"),
    ELEPHANT(50, "@drawable/mp3"),
    ALLIGATOR(40, "@drawable/mp1"),
    HIPPO(30, "@drawable/mp4"),
    SNAKE(20, "@drawable/mp6"),
    ZEBRA(10, "@drawable/mp8"),
    SPRINGBOK(5, "@drawable/mp7"),
    SPIN(1, "@drawable/freespin");

    public String imageName;
    public int value;

    Symbols(int value, String imageName){
     this.imageName = imageName;
     this.value = value;
    }

    public String getImageName() {
        return imageName;
    }

    public int getValue() {
        return value;
    }

}
