package org.technischools.oop;

public class Point {
    private float X;
    private float Y;

    public Point(float x, float y) {
        X = x;
        Y = y;
    }

    public float getX(){
      return this.X;
    }

    public float getY(){
        return this.Y;
    }

    public void move(float deltaX, float deltaY){
        X += deltaX;
        Y += deltaY;
    }

    public void move(Point p){
        X += p.getX();
        Y += p.getY();
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((X - p.getX()), 2) + Math.pow((Y - p.getY()), 2));
    }
}