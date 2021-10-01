package com.company;

public class Main {

    public static void main(String[] args) {
        Point3D point = new Point3D(5, 6, 8);
        point.printPoint();
        Point3D point1 = new Point3D(5, 6, 7);
        point1.printPoint();
        if (point.isEqual(point)) System.out.println("Точки совпадают");
        else System.out.println("Точки не совпадают");
        Vector3D vector_1 = new Vector3D(5, 8, 45);
        Vector3D vector_2 = new Vector3D(5, 8, 46);
        System.out.printf("%s \n", vector_1.toString());
        System.out.printf("Length vector = %s.\n", vector_1.getModule());
        if (vector_1.isEqual(vector_2)) System.out.println("Векторы равны");
        else System.out.println("Векторы не равны");
        System.out.printf("Сумма векторов = %s\n", vector_1.getSum(vector_2));
        System.out.printf("Разность векторов = %s\n", vector_1.getSubtraction(vector_2));
        System.out.printf("Скалярное произведение векторов = %s\n", vector_1.getScalar(vector_2));
        System.out.printf("Векторное произведение векторов = %s\n", vector_1.getVectorProduct(vector_2));
        if (vector_1.getCollinear(vector_2)) System.out.println("Векторы коллинеарны");
        else System.out.println("Векторы не коллинеарны");
    }
}

