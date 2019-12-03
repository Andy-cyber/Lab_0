package lab0;

import java.util.Arrays;

import java.util.Collections;
public class Variant3 {


    public static double[] operations_number(double n, double k) {

        int c = 0;
        if ((n > 0) & (k > 0)) {
            while (n >= k) {

                c = c + 1;
                n = n - k;

            }
        }
        return new double[]{c,n};
    }

    public static Integer[] operations(int A, int B) {

        Integer[] D=new Integer[B-A-1];

        if (A < B) {
            for (int i = (A+1), z = 0; i < B; i++,z++) {
               D[z] = i;
            }
        }
        Arrays.sort(D,Collections.reverseOrder());
        return D;
    }

    public static int bytes_integer (int a) {
        int k;
        k= a / 1024;
        return k;
    }

    public static int number_sign(int a) {
        int k = 0;
        if (a > 0) {
            k = a + 1;
        } else if (a < 0) {
            k = a - 2;
        } else if (a == 0) {
            k = 10;
        }
        return k;
    }

    public static String seas(int month) {
        String res;
        switch (month) {
            case 1:
            case 2:
            case 12:
                res = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                res = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                res = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                res = "Autumn";
                break;
            default:
                res = "No such month!";
        }
        return res;
    }

    public static boolean isOdd(int value)
    {
        return (value % 2) == 0;
    }

    public static int[][] Array(int N, int M, int [] array) {
        int[][] a = new int[M][N];
        int a2[] = new int[M];
        for (int i = 0, z=0; i < a2.length; i++,z++) {
            a2[z] = array[z];
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = a2[j];
            }
        }
    return a;
    }

    public static boolean IsEqualsTwoArrays(int[][] firstArray, int[][] secondArray){
        for(int i = 0; i < firstArray.length; i++){
            for(int j = 0; j < firstArray[i].length; j++){
                if(firstArray[i][j] != secondArray[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static Integer[] Operations2(int A, int B) {

        Integer[] D=new Integer[B-A-1];

        if (A < B) {
            for (int i = (A+1), z = 0; i < B; i++,z++) {
                D[z] = i;
            }
        }
        Arrays.sort(D,Collections.reverseOrder());
        return D;
    }
}
