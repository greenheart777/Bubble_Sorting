package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner myVar = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        n = myVar.nextInt();

        System.out.println("Исходные значения массива:");
        int[] array = new int[n];
            for(int i = 0; i < array.length; i++){
                array[i] = (int) (Math.random() * 100);
                System.out.print(" "+ array[i]);
            }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] += array[j+1];
                    array[j+1] = array[j] - array[j+1];
                    array[j] -= array[j+1];
                }
            }
        }
        System.out.println("\nОтсортированное значения массива:");
            for(int i = 0; i < array.length; i++){
                System.out.print(" "+ array[i]);
            }
    }
}
