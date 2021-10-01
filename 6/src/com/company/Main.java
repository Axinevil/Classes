package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = 0, x2 = 0, x3 = 0, y1 = 0, y2 = 0, y3 = 0, res_first = 0, res_second = 0;
        System.out.println("Введите 1-ый аргумент 1-го уравнения: ");
        x1 = in.nextDouble();
        System.out.println("Введите 2-ой аргумент 1-го уравнения: ");
        x2 = in.nextDouble();
        System.out.println("Введите 3-ий аргумент 1-го уравнения: ");
        x3 = in.nextDouble();
        System.out.println("Введите 1-ый аргумент 2-го уравнения: ");
        y1 = in.nextDouble();
        System.out.println("Введите 2-ой аргумент 2-го уравнения: ");
        y2 = in.nextDouble();
        System.out.println("Введите 3-ий аргумент 2-го уравнения: ");
        y3 = in.nextDouble();
        double delta_first = 0, delta_second = 0, delta_third = 0;
        delta_first = x1*y2 - x2*y1;
        delta_second = x3*y2 - y3*x2;
        delta_third = x1*y3 - y1*x3;
        if (delta_first == 0 && (x1 != 0 || x2 != 0 || x3 != 0 || y1 != 0 || y2 != 0 || y3 != 0))
        {
            System.out.println("Решений нет ");
        }
        else if (x1 == 0 && x2 == 0 && x3 == 0 && y1 == 0 && y2 == 0 && y3 == 0)
        {
            System.out.println("Бесконечное множество решений");
        }
        else
        {
            res_first = delta_second/delta_first;
            res_second = delta_third/delta_first;
            System.out.printf("x1 = %f \n", res_first);
            System.out.printf("x2 = %f \n", res_second);
        }
    }
}
