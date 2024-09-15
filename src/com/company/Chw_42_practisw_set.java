package com.company;

class Cylinder{
    private float radius;
    private float height;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double calcuteVolumeOfCylinder(){
      return  Math.PI * radius * radius * height;
    }

    public double calcuteSurfaceAreaOfCylinder() {
        return 2 * Math.PI * radius * height + 2 * 3.142 * radius * radius;
    }

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }
}

class NewRectangle{
    private  int length;
    private int breadth;

    public NewRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public NewRectangle() {
        this.length = 3;
        this.breadth = 5;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

public class Chw_42_practisw_set {
    public static void main(String[] args) {
        /*
        Cylinder cylinder = new Cylinder(3.7f, 5.20f);
//        cylinder.setRadius(3.7f);
//        cylinder.setHeight(5.20f);

        float r = cylinder.getRadius();
        float h = cylinder.getHeight();

        double v = cylinder.calcuteVolumeOfCylinder();
        double s = cylinder.calcuteSurfaceAreaOfCylinder();

        System.out.println("Cylinder Radius is " + r + " mm");
        System.out.println("Cylinder Height is " + h + " mm");
        System.out.println("Volume Of Cylinder is " + v + " mm");
        System.out.println("Surface Area Of Cylinder is " + s + " mm");
        */


        NewRectangle newRectangle = new NewRectangle(3,5);
        System.out.println(newRectangle.getBreadth());
        System.out.println(newRectangle.getLength());

    }
}
