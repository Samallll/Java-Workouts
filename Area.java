import java.util.Scanner;

public class Area {
    
    Scanner scanObj=new Scanner(System.in);

    void circle(){
        
        double radius;
        System.out.println("Enter Radius");
        radius =scanObj.nextDouble();
        double circleArea;
        circleArea=(radius*radius)*Math.PI;
        System.out.println("Area of the circle is :"+circleArea);
    }

    void square(){

        double height;
        double width;
        double area;
        System.out.println("Enter Height");
        height=scanObj.nextDouble();
        System.out.println("Enter width");
        width=scanObj.nextDouble();     
        area=height*width;   
        System.out.println("Area of the Square is :"+area);
    }

    void rectangle(){

        System.out.println("Enter Height");
        double height=scanObj.nextDouble();
        System.out.println("Enter width");
        double width =scanObj.nextDouble();
        double Area=height*width;
        System.out.println("Area of the Rectangle is :"+Area);
    }

    void triangle(){

        System.out.println("Enter base");
        double base = scanObj.nextDouble();
        System.out.println("Enter altitude");
        double altitude = scanObj.nextDouble();
        double area = (base*altitude)/2;
        System.out.println("Area of the Triangle is :"+area);
    }
}