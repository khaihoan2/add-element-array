package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {10, 4, 6, 7, 8};
        System.out.println("Nhập chỗ cần chèn");
        int index = scanner.nextInt();
        System.out.println("Nhập số cần chèn");
        int element = scanner.nextInt();

        int[] result = addElementArray(arr, index, element);
        showArray(result);
    }

    public static void showArray(int arr[]) {
        for (int element : arr) {
            System.out.println(element + " ");
        }
    }

    public static int[] addElementArray(int arr[], int index, int element) {
        int newArray[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            if (i < index) {
                newArray[i] = arr[i];
            } else if(i == index){
                newArray[i] = element;
            } else {
                newArray[i] = arr[i - 1];
            }
        }
        return newArray;
    }
}