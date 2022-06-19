package com.lianxi.array;

import sun.security.util.Length;

/**
 * @author yuzs
 * @date 2022-06-2022/6/19-10:11
 */
public class ShuZuTiMu {
    public static void main(String[] args) {
       //杨辉三角
        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length;i++){
            yanghui[i] = new int[i+1];
           //给首末元素赋值
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
            //给每行的非首末元素赋值
            if (i > 1){
                for (int j = 1;j < yanghui[i].length-1;j++){
                    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
                }
            }
        }
        //遍历一下
        for (int i = 0; i < yanghui.length; i++) {
            //System.out.println(yanghui[i]);
            for (int j = 0; j < yanghui[i].length ; j++){
                System.out.print(yanghui[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
