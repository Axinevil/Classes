package com.company;

public class Vector3D {
    private Point3D start;
    private Point3D end;
    public Vector3D(Point3D point_1, Point3D point_2){
        this.start = point_1;
        this.end = point_2;
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    private double x, y, z;
    public Vector3D(){};
    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getModule() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
}
