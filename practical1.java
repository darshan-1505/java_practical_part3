
//21CE019-Darshan Chavda
// Create an abstract class GeometricObject as the superclass for Circle and 
// Rectangle. GeometricObject models common features of geometric 
// objects. Both Circle and Rectangle contain the getArea() and 
// getPerimeter() methods for computing the area and perimeter of a circle 
// and a rectangle. Since you can compute areas and perimeters for all 
// geometric objects, so define the getArea() and getPerimeter() methods 
// in the GeometricObject class. Give implementation in the specific type of 
// geometric object. Create TestGeometricObject class to display area and 
// perimeter of Rectangle and Triangle, compare area of both and display 
// results. Design of all classes are given in the 
// following UML diagram. 
import java.util.*;

abstract class Geometricobject {
    abstract void getArea();

    abstract void getPerimeter();
}

class circle extends Geometricobject {
    double area1, perimeter1;
    float radius;
    Scanner sc = new Scanner(System.in);

    void getdata() {
        System.out.println("Enter the radius of circle : ");
        radius = sc.nextFloat();
    }

    void getArea() {
        area1 = 3.14 * radius * radius;
        System.out.println("Area of circle : " + area1);
    }

    void getPerimeter() {
        perimeter1 = 2 * 3.14 * radius;
        System.out.println("Perimeter of circle : " + perimeter1);
    }
}

class rectangle extends Geometricobject {
    Scanner sc = new Scanner(System.in);
    float l, b;
    float area2, perimeter2;

    void get() {
        System.out.println("Enter the length of rectangle : ");
        l = sc.nextFloat();
        System.out.println("Enter the width of rectangle : ");
        b = sc.nextFloat();
    }

    void getArea() {
        area2 = l * b;
        System.out.println("Area of rectangle : " + area2);
    }

    void getPerimeter() {
        perimeter2 = 2 * (l + b);
        System.out.println("Perimeter of reactangle : " + perimeter2);
    }
}

class TestGeometricObject {
    void getArea(int a, int b, int c, int d) {
        int s2 = b;
        int h1 = d;
        double area3 = 0.5 * s2 * h1;
        System.out.println("Area of triangle is :" + area3);
    }

    void getPerimeter(int p, int q, int r) {
        int a = p;
        int b = q;
        int c = r;
        double perimeter3 = a + b + c;
        System.out.println("Perimeter of triangle is :" + perimeter3);
    }
}

public class practical1 {
    public static void main(String[] args) {
        circle oc = new circle();
        rectangle or = new rectangle();
        TestGeometricObject ot = new TestGeometricObject();

        oc.getdata();
        oc.getArea();
        oc.getPerimeter();
        System.out.println();

        or.get();
        or.getArea();
        or.getPerimeter();
        System.out.println();

        System.out.println("For Triangle : ");
        ot.getArea(4, 5, 6, 7);
        ot.getPerimeter(4, 5, 6);
    }
}