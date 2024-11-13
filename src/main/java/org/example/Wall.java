package org.example;

public class Wall {
    double width;double height;
    public Wall(double width,double height){
        this.width=width;
        this.height=height;

    }
    public double getWidth(){
        return width;
    }
    public double getHeight (){
        return height;
    }
    public double setWidth(double width2) {
        this.width = width2;
        if(width<0){
            width=0;
        }
        return width;
    }
    public double setHeight (double height2) {
        this.height = height2;
        if(height<0){
            height=0;
        }
        return height;
    }
    public double getArea(){
        return this.width * this.height;
    }
}
