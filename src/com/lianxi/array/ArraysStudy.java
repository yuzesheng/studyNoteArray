package com.lianxi.array;

import java.util.Arrays;

/**
 * @author yuzs
 * @date 2022-06-2022/6/19-10:50
 */
public class ArraysStudy {
    public static void main(String[] args) {
        int[] arr1 = {5, 8, 6, 3, 4, 9, 2, 1, 8};
        int[] arr2 = {5, 8, 6, 3, 4, 9, 2, 1, 8};
        int[] arr3 = {6,8,5,3};
        //Arrays
        // public static boolean equals(int[] a, int[] a2) {
        //        if (a==a2)
        //            return true;
        //        if (a==null || a2==null)
        //            return false;
        //
        //        int length = a.length;
        //        if (a2.length != length)
        //            return false;
        //
        //        for (int i=0; i<length; i++)
        //            if (a[i] != a2[i])
        //                return false;
        //
        //        return true;
        //    }
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr3,1);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int i = Arrays.binarySearch(arr1,6) ;
        System.out.println(i);
    }

}
