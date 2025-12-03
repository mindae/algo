package org.mindae;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int arr[] = {4, 9, 2, 3, 11};
//        max(arr);
        rev(arr);
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
}
