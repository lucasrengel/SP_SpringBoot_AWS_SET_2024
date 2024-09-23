package heranca.exercicio02.application;

import heranca.exercicio02.model.entities.Circle;
import heranca.exercicio02.model.entities.Rectangle;
import heranca.exercicio02.model.entities.Shape;
import heranca.exercicio02.model.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            String type = sc.next();
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next();
            if(type.equals("c")){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Circle circle = new Circle(Color.valueOf(color), radius);
                list.add(circle);
            }
            if(type.equals("r")){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Rectangle rectangle = new Rectangle(Color.valueOf(color), width, height);
                list.add(rectangle);
            }
        }
        System.out.println("\nSHAPE AREAS:");
        for(Shape s : list){
            System.out.println(s.area());
        }
    }
}
