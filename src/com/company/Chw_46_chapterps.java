package com.company;

class Circle{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    double areaOfCircle(){
        return (Math.PI * radius * radius);
    }
}

class CylinderNew extends Circle{

    int height;

    public CylinderNew(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    double areaOfCylinder(){
        return (2 * Math.PI * radius * height) + (2 * 3.142 * radius * radius);
    }
}

public class Chw_46_chapterps {
    public static void main(String[] args) {
        CylinderNew cylinderNew = new CylinderNew(3,4);
        double circle = cylinderNew.areaOfCircle();
        System.out.println("Area of Circle :"+circle);
        double cylinder = cylinderNew.areaOfCylinder();
        System.out.println("Area of Cylinder :"+cylinder);
    }
}
