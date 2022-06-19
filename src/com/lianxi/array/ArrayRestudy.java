package com.lianxi.array;

import org.omg.CORBA.ARG_OUT;

/**
 * @author yuz11s
 * @date 20221-06-2022/6/18-18:26
 */
public class ArrayRestudy {
    public static void main(String[] args) {
        //1.1数组的静态初始化:数组的初始化和元素的赋值操作同时进行。
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[]{1,2,3,4};
        //1.2数组的动态初始化：数组的初始化和数组元素的赋值操作分开进行。
        String[] names = new String[4];
        //总结：数组一旦初始化完成，那么长度就确定了。

        //2.获取指定位置的元素
        System.out.println(arr1[0]);
        System.out.println(arr1[3]);

        //3.获取数组长度
        System.out.println("数组长度为："+arr1.length);

        //4.遍历数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //5.数组元素的默认初始化
        char[] i = new char[10];
        for (int j = 0; j < i.length;j++){
//            if (i[j] == 0){
//                System.out.println("yes,char型数组的默认初始化值是0");
//            }
             if(i[j] == '\u0000'){
                System.out.println("yes,char型数组的默认初始化值是'\u0000'");
            }else{
                System.out.println("没有初始化值");
            }
        }

        //6.内存解析
        int[] arr = new int[]{1,2,3,4};
        String[] arr3 = new String[4];
        arr3[1]  = "张学友";
        arr3[2] = "刘德华";
        arr3 = new String[3];


    }
}
