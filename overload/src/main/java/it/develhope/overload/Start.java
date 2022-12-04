package it.develhope.overload;

public class Start {

    public static void main(String[] args) {

        Shape shape = new Shape();
        String shape1 = shape.getShapeDetails();
        System.out.println(shape1);

        Shape circle = new Shape(5.5);
        String shape2 = circle.getShapeDetails();
        System.out.println(shape2);

        Shape square = new Shape(4,6.8);
        String shape3 = square.getShapeDetails();
        System.out.println(shape3);

        Shape rectangle = new Shape(4, 7.2, 5);
        String shape4 = rectangle.getShapeDetails();
        System.out.println(shape4);

        Shape triangle = new Shape(3, 4.2, 3, 9.9);
        String shape5 = triangle.getShapeDetails();
        System.out.println(shape5);

    }

}
