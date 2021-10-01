package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        double step = 0, min = 0, max = 0, res = 0;
        System.out.print("Введите левую границу: ");
        min = in.nextDouble();
        do{
            System.out.print("Введите правую границу: ");
            max = in.nextDouble();
        }
        while (max < min);
        do {
            System.out.print("Введите шаг:");
            step = in.nextDouble();
        }
        while (step > max || step < min || step < 0);
        for (double i = min; i < max; i += step) {
            x++;
            res = Math.sin(i);
            System.out.printf("Синус на %d шаге при аргументе %f равен: %f \n", x, i, res);
        }
    }
}
