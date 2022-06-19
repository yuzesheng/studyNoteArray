package com.lianxi.array;

/**
 * @author yuzs
 * @date 2022-06-2022/6/18-21:34
 */
public class ErWeiArrayRestudy {
    public static void main(String[] args) {
        //1.二维数组声明和初始化
        //1.1静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9},{5,2,0}};

        //1.2动态初始化1
        String[][] arr2 = new String[3][2];

        //1.2动态初始化2
        String[][] arr3 = new String[3][];

        //调用指定位置的数组元素
        System.out.println(arr1[2][0]);

        //获取数组长度
        System.out.println(arr1.length);
        System.out.println(arr1[0].length);

        //遍历数组
        for (int i = 0;i < arr1.length;i++){
            for (int j = 0; j < arr1[i].length;j++){
                System.out.print("数组元素分别是："+ arr1[i][j]);
            }
            System.out.println();
        }
    }
}
