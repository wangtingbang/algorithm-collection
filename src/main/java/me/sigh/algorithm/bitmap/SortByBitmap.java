package me.sigh.algorithm.bitmap;

import java.util.Arrays;

public class SortByBitmap {

    public static int[] sort(int input[]){
        int[] bitmap = new int[8];
        Arrays.fill(bitmap, 0);



        return null;
    }

    public static void retrieve(int[] data){
        if(data ==null || data.length==0){
            return;
        }
        System.out.printf("start");
        for(int i : data){
            System.out.printf( "->%d",i);
        }
        System.out.println("->end");
    }

    public static void main(String[] args) {
        int[] input = new int[]{4,7,2,5,3};

        retrieve(input);
        int[] result = sort(input);
        retrieve(result);

    }
}
