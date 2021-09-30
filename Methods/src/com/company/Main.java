package com.company;

public class Main {

    public static void main(String[] args) {
        Point3D point = new Point3D();
        point.setX(5);
        point.setY(6);
        point.setZ(8);
        System.out.print("Point 1 = ");
        point.printPoint();
        System.out.println("\n");
        Point3D point1 = new Point3D();
        point1.setX(5);
        point1.setY(8);
        point1.setZ(8);
        System.out.print("Point 2 = ");
        point1.printPoint();
        System.out.println("\n");
        double x1, y1, z1;
        double x2, y2, z2;
        x1 = point.getX();
        y1 = point.getY();
        z1 = point.getZ();
        x2 = point1.getX();
        y2 = point1.getY();
        z2 = point1.getZ();
        if (x1 == x2 && y1 == y2 && z1 == z2) System.out.println("Они равны");
        Vector3D vector1 = new Vector3D(point, point1);
        System.out.printf("%s", vector1.toString());
    }
}

