package application;
import java.util.Scanner;
import entities.Rectangle;

public class rectangle_application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter the Height: ");
        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();
        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();

        System.out.println("AREA: " + rectangle.area());
        System.out.println("AREA: " + rectangle.perimeter());
        System.out.println("AREA: " + rectangle.diagonal());

        sc.close();
    }
}
