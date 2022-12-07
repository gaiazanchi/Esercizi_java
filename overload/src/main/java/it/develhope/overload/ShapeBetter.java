package it.develhope.overload;

public class ShapeBetter {

    public String shapeName;
    public int numberOfEdges;

    public ShapeBetter(){
        this.shapeName = "undefined shape";
        this.numberOfEdges = 0;
        System.out.println("I'm creating an " + this.shapeName);
    }

    /**
     * Method constructor for the circle
     * @param radiusCm Radius length of the circle [cm]
     */
    public ShapeBetter(double radiusCm){
        this.shapeName = "circle";
        this.numberOfEdges = 0;
        System.out.println("I'm creating a " + this.shapeName + ". Its radius is " + radiusCm + " cm");
    }

    /**
     * Method constructor for the square
     * @param edges Number of edges of the square
     * @param edgeLengthCm Side length of the square [cm]
     */
    public ShapeBetter(int edges, double edgeLengthCm){
        this.shapeName = "square";
        this.numberOfEdges = edges;
        System.out.println("I'm creating a " + this.shapeName +". Its side is " + edgeLengthCm + " cm");
    }

    /**
     * Method constructor for the rectangle
     * @param edges Number of edges of the rectangle
     * @param e1 One side length of the rectangle [cm]
     * @param e2 The other side length [cm]
     */
    public ShapeBetter(int edges, double e1, double e2){
        this.shapeName = "rectangle";
        this.numberOfEdges = edges;
        System.out.println("I'm creating a " + this.shapeName + ". Its sides are " + e1 + " cm and " + e2 + " cm");
    }

    /**
     * Method constructor for the triangle
     * @param edges Number of edges of the triangle
     * @param e1 First side length of the triangle
     * @param e2 Second side length of the triangle
     * @param e3 Third side length of the triangle
     */
    public ShapeBetter(int edges, double e1, double e2, double e3){
        this.shapeName = "triangle";
        this.numberOfEdges = edges;
        System.out.println("I'm creating a " + this.shapeName + ". Its sides are " + e1 + " cm, " + e2 + " cm and " + e3 + " cm");
    }

    public String getShapeDetails(){
        return "My shape is a " + this.shapeName + " and has " + this.numberOfEdges + " edges.";
    }

}
