package entities;

public class Rectangle {
    public Double height;
    public Double width;

    public Double area(){
        return height * width;
    }

    public Double perimeter(){
        return 2 * (width+height);
    }

    public Double diagonal(){
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }
}
