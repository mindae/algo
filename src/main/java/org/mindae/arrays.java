package org.mindae;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrays {
    public static void main(String[] args) {
        int arr[] = {4, 9, 2, 3, 11, 2, 2};
//        max(arr);
//        rev(arr);
        rev2(arr);
//        countNum(arr, 2);
    }

    public static void countNum(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void rev(int arr[]) {
        //int arr[]={4, 9, 2, 3, 11};
        int arr2[] = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        for (int i = 0; i < arr2.length / 2; i++) {
            int t;
            t = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = t;
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static void rev2(int[] arr) {
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        int left = 0, right = arr2.length - 1;
        while (left < right) {
            int t = arr2[left];
            arr2[left++] = arr2[right];
            arr2[right--] = t;
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

