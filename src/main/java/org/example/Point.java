package org.example;

public class Point {
    private int x;
    private int y;

    public Point(){
        setLocation(0, 0);
    }

    public Point(int x, int y){
        setLocation(0, 0);
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public double getDistanceFromOrigin(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}
