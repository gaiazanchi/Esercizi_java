package it.develhope.overload;

public class Shape {

    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        this.shapeName = "undefined shape";
        this.numberOfEdges = 0;
        System.out.println("I'm creating an " + this.shapeName);
    }

    public Shape(double radius){
        this.shapeName = "circle";
        this.numberOfEdges = 0;
        System.out.println("I'm creating a " + this.shapeName);
    }

    public Shape(int edges, double edgeLength){
        this.shapeName = "square";
        this.numberOfEdges = edges;
        System.out.println("I'm creating a " + this.shapeName);
    }

    public Shape(int edges, double e1, double e2){
        this.shapeName = "rectangle";
        this.numberOfEdges = edges;
        System.out.println("I'm creating a " + this.shapeName);
    }

    public Shape(int edges, double e1, double e2, double e3){
        this.shapeName = "triangle";
        this.numberOfEdges = edges;
        System.out.println("I'm creating a " + this.shapeName);
    }

    public String getShapeDetails(){
        return "My shape is a " + this.shapeName + " and has " + this.numberOfEdges + " edges.";
    }

}
