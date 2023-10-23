package org.technischools.oop.geometry;

public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public float perimeter(){
        float a = (float) p1.distance(p2);
        float b = (float) p2.distance(p3);
        float c = (float) p3.distance(p1);
        return a + b + c;
    }

    public float area(){
        float a = (float) p1.distance(p2);
        float b = (float) p2.distance(p3);
        float c = (float) p3.distance(p1);
        float p = 0.5f * perimeter();
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
