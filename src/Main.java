import test.Test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static public String[] copyOf(String[] arr, int arrNewLength) {
        String[] newArr = new String[arrNewLength];
        System.arraycopy(arr, 0, newArr, 0, arrNewLength);
        return newArr;
    }

    public static void main(String[] args) {
        Test.test();
        //one dimension
        //multi dimension 2D - matrix 3D ND
        //byte short int
        String[] strArr = {"Naringul", "Fidan", "Ayxan", "Islam"};
        Arrays.sort(strArr);
        Integer i = 5;
        System.out.println(i.toString());
        System.out.println(strArr.toString());
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(Main.copyOf(strArr, 3)));


        //        int n = 10;
//        int[] arr1 = new int[n];
//        int[] arr2 = arr1;
//        int[] arr10 = arr1.clone();
//        arr1[5]=852;
//        System.out.println("Arr1: " + Arrays.toString(arr1));
//        System.out.println("Arr2: " + Arrays.toString(arr2));
//        System.out.println("Arr2: " + Arrays.toString(arr10));
//        System.out.println("arr1==arr2: " + (arr1==arr2));
//        System.out.println("arr1==arr10: " + (arr1==arr10));
//        int[] arr3 = new int[]{9};
//        int[] arr4 = {1, 2, 3};
//        System.out.println();
//        System.out.println("arr1");
//        for (int i = 0; i <= arr1.length - 1; i++) {
//            System.out.println(arr1[i]);
//        }
//        System.out.println();
//        System.out.println("arr4");
//        for (int i = 0; i <= arr4.length - 1; i++) {
//            System.out.println(arr4[i]);
//        }
//        System.out.println();
//
//        int[][] arr5 = new int[5][10];
//        int[][] arr6 = new int[5][];
//        int[][] arr7 = arr5;
//        int[][] arr8 = new int[][]{{1, 2}, {4, 5}, {7, 8, 10}}; //jagged
//        int[][] arr11 = arr8.clone();
//        arr8[1][1]=17;
//        System.out.println("arr11.length: " + arr11.length);
//        System.out.println("arr11[0].length: " + arr11[0].length);
//        System.out.println("arr11[1].length: " + arr11[1].length);
//        System.out.println("arr11[2].length: " + arr11[2].length);
//        System.out.println("arr8==arr11: " + (arr8==arr11));
//        System.out.println("arr8[1]==arr11[1]: " + (arr8[1]==arr11[1]));
//        System.out.println("arr8[1][1]==arr11[1][1]: " + (arr8[1][1]==arr11[1][1]));
//
//        System.out.println();
//        System.out.println("arr8");
//        for (int i = 0; i <= arr8.length - 1; i++) {
//            for (int j = 0; j <= arr8[i].length - 1; j++) {
//                System.out.print(arr8[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println("arr11");
//        for (int i = 0; i <= arr11.length - 1; i++) {
//            for (int j = 0; j <= arr11[i].length - 1; j++) {
//                System.out.print(arr11[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int[][] arr9 = new int[9][9];
//        System.out.println();
//        System.out.println("arr5");
//        for (int i = 0; i <= arr5.length - 1; i++) {
//            for (int j = 0; j <= arr5[i].length - 1; j++) {
//                System.out.print(arr5[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println("arr8");
//        for (int i = 0; i <= arr8.length-1; i++) {
//            for (int j = 0; j <= arr8[i].length - 1; j++) {
//                System.out.print(arr8[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        int a = 5;
//        int c = a;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr4));
//        System.out.println(Arrays.toString(arr5));
//        System.out.println(Arrays.toString(arr6));
//        System.out.println(Arrays.toString(arr7));
//        System.out.println(Arrays.toString(arr8));
//        System.out.println(arr8[1][0]);
//        System.out.println();
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = i * 3 - 5;
//            System.out.println(arr1[i]);
//        }
//        System.out.println();
//        System.out.println("arr5");
//        for (int i = 0; i < arr5.length; i++) {
//            for (int j = 0; j < arr5[i].length; j++) {
//                arr5[i][j] = i * j;
//            }
//        }
//        for (int i = 0; i < arr5.length; i++) {
//            for (int j = 0; j < arr5[i].length; j++) {
//                System.out.print(arr5[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println("arr9===");
//        for (int i = 0; i < arr9.length; i++) {
//            for (int j = 0; j < arr9[i].length; j++) {
//                arr9[i][j] = (i+1) * (j+1);
//                System.out.print(arr9[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        arr9[2][5]=11111;
////        System.out.println("arr9[2][5]: " + arr9[2][5]);
////        for (int i = 0; i < arr9.length; i++) {
////            for (int j = 0; j < arr9[i].length; j++) {
////                System.out.print(arr9[i][j] + "\t");
////            }
////            System.out.println();
////        }
//        System.out.println(arr9);
//
//        System.out.println(arr9.toString());

    }
}
