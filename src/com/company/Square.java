package com.company;

public class Square {
    int side;
    public int calculatingAreaOfSquare(int side){
        return side * side;
    }

    public int calculatePerimeterOfSquare(int side){
        return 4 * side;
    }

}

class Rectangle {
    int length;
    int width;

    public int calculatingAreaOfRectangle(int length,int width){
        return length * width;
    }

    public int calculatePerimeterOfRectangle(int length,int width){
        return 2 * (length + width);
    }
}
