package com.company;

public class Point3D {
    private double x;
    private double y;
    private double z;
    public Point3D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void printPoint()
    {
        System.out.printf("(Координаты точки: %f; %f; %f)\n", x, y, z);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    public boolean isEqual(Point3D point) {
        return x == point.x && y == point.y && z == point.z;
    }
}
