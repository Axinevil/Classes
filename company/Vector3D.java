package com.company;

public class Vector3D {
    private Point3D start;
    private Point3D end;
    public Vector3D(Point3D point_1, Point3D point_2){
        this.start = point_1;
        this.end = point_2;
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

    public boolean isEqual(Vector3D vector){
        return x == vector.x && y == vector.y && z == vector.z;
    }

    public Vector3D getSum(Vector3D vector) {
        return new Vector3D(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector3D getSubtraction(Vector3D vector) {
        return new Vector3D(x - vector.x, y - vector.y, z - vector.z);
    }

    public double getScalar(Vector3D vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector3D getVectorProduct(Vector3D vector) {
        return new Vector3D(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    public boolean getCollinear(Vector3D vector) {
        return ((x / vector.x) - (y / vector.y) < 0.00000001) && ((x / vector.x) - (z / vector.z) < 0.00000001) && ((y / vector.y) - (z / vector.z) < 0.00000001);
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "start=" + start +
                ", end=" + end +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
