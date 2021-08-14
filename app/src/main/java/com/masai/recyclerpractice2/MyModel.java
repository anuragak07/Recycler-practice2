package com.masai.recyclerpractice2;

public class MyModel {
    private String name;
    private int imageCross;
    public MyModel(String name,int imageCross){
        this.name =name;
        this.imageCross = imageCross;
    }
    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name =name;
    }

    public int getImageCross() {
        return imageCross;
    }

    public void setImageCross(int imageCross) {
        this.imageCross = imageCross;
    }
}
