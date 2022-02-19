package com.sekirin;

public class Circle {
    private Point center;
    private double radius;

    public Circle(){
        this.center = new Point();
        this.radius = 1.0;
    }

    public Circle(int xCenter, int yCenter, double radius){
        center = new Point(xCenter, yCenter);
        this.radius = radius;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //Getters and Setters
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getCenterX(){
        return center.getX();
    }
    
    public void setCenterX(int x){
        center.setX(x);
    }

    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }

    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }

    @Override
    public String toString() {
        return "Круг[центр=" + center + ", радиус=" + radius + ']';
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public double distance(Circle another){
        return center.distance(another.center);
    }
}
