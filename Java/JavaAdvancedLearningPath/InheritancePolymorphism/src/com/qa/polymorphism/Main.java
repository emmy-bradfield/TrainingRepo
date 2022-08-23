package com.qa.polymorphism;

public class Main {

    public static void main(String[] args){
        Shape shapes[] = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Line();
        shapes[3] = new Shape();

        for (int a = 0; a < shapes.length; a++){
            shapes[a].draw();
        }

        // Creating subclasses as their superclass then attempting to run their methods (which are not in
        // the superclass):

        // Method one: Casting the superclass as it's subclass
        // >> Superclass objectName = new Subclass();
        // >> ((Subclass) superclass-objectName).subclassmethod();
        Shape circle = new Circle();
        System.out.println(((Circle) circle).getRadius());

        Shape square = new Square();
        System.out.println(((Square) square).getArea());

        // Method Two: Creating a new version of the subclass which shares the properties of the original
        // >> Superclass objectname = (Subclass) newObjectName
        // >> Subclass-newObjectName.subclassmethod()
        Circle circle2 = (Circle) circle;
        System.out.println(circle2.getRadius());

        Square square2 = (Square) square;
        System.out.println(square2.getArea());

    }
    
}
