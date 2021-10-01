package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantity_elem;
        do {
            System.out.print("Введите количество элементов массива: ");
            quantity_elem = in.nextInt();
        }
        while (quantity_elem < 0);
        double [] arr = new double[quantity_elem];
        enter_Arr(arr);
        print_Arr(arr);
        double arr_res = sum_Arr(arr);
        System.out.printf("Сумма элементов = %f \n", arr_res);
        double even_sum = even_sum_Arr(arr);
        System.out.printf("Сумма чётных элементов = %f \n", even_sum);
        int even_count = count_even_element(arr);
        System.out.printf("Количество чётных элементов: %d \n", even_count);
        System.out.print("Введите начало отрезка: ");
        double start_segment = in.nextDouble();
        System.out.print("Введите конец отрезка: ");
        double end_segment = in.nextDouble();
        int count_number_segment = number_segment(arr, start_segment, end_segment);
        System.out.printf("Количество элементов массива, находящихся на отрезке от %f до %f = %d \n", start_segment, end_segment, count_number_segment);
        int positive = all_positive(arr);
        if (positive == 1){
            System.out.println("Все элементы положительны");
        }
        else{
            System.out.println("Не все элементы положительны");
        }
        arr_reverse(arr, quantity_elem);
        System.out.println("Реверс массив: ");
        for (double elem : arr){
            System.out.printf("Элемент: %f \n", elem);
        }
    }
    public static void enter_Arr(double[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i<arr.length; i++) {
            System.out.printf("Введите [%d] элемент массива: ", i);
            arr[i] = in.nextDouble();
        }
    }
    public static void print_Arr(double[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.printf("Arr[%d] = %f \n", i, arr[i]);
        }
    }
    public static double sum_Arr(double[] arr){
        double arr_res = 0;
        for (double elem : arr) {
            arr_res += elem;
        }
        return arr_res;
    }
    public static double even_sum_Arr(double[] arr){
        double even_sum = 0;
        for (double elem : arr) {
            if (elem % 2 == 0) {
                even_sum += elem;
            }
        }
        return even_sum;
    }
    public static int count_even_element(double[] arr){
        int count = 0;
        for (double elem : arr){
            if (elem % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static int number_segment(double[] arr, double a, double b){
        int count = 0;
        for (double i = a; i <= b; i++){
            for (double elem : arr){
                if (elem == i){
                    count++;
                }
            }
        }
        return count;
    }
    public static int all_positive(double[] arr){
        int count = 0;
        for (double elem : arr){
            if (elem > 0){
                count++;
            }
        }
        if (count == arr.length){
            return 1;
        }
        else return 0;
    }
    public static void arr_reverse(double[] arr, int quantity_elem){
        double temp;
        for (int i = 0; i < quantity_elem/2; i++){
            temp = arr[i];
            arr[i] = arr[quantity_elem - i - 1];
            arr[quantity_elem - i - 1] = temp;
        }
    }
}


