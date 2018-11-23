package me.sigh.algorithm.bitmap;

import java.util.Arrays;
import java.util.Random;

/**
 * https://www.cnblogs.com/z-sm/p/6238977.html
 */

public class BigDataSort {

    //    private static final int CAPACITY = 1000000000;//数据容量
    private static final int CAPACITY = 8;//数据容量

    // 定义一个byte数组缓存所有的数据
//    private byte[] dataBytes = new byte[1 << 29];
    private byte[] dataBytes = new byte[1 << 3];

    public static void main(String[] args) {
        BigDataSort ms = new BigDataSort();

        byte[] bytes = null;

        int[] nums = new int[] {4, 21, 19, 1, 30, 27, 45, 6, 30 };

        Random random = new Random();
        for (int i = 0; i < CAPACITY; i++) {
//            int num = random.nextInt();
            int num = nums[i];
//            System.out.println("读取了第 " + (i + 1) + "\t个数: " + num);
            bytes = ms.splitBigData(num);
        }
        System.out.println("arrays.toString:" + Arrays.toString(bytes));
        System.out.println("bytes.length: " + bytes.length);
        ms.output(bytes);
        System.out.println("contains 1: " + ms.contains(bytes, 1));
        System.out.println("contains 4: " + ms.contains(bytes, 4));
        System.out.println("contains 30: " + ms.contains(bytes, 30));
    }


    /**
     * 读取数据，并将对应数数据的 到对应的bit中，并返回byte数组
     *
     * @param num 读取的数据
     *
     * @return byte数组  dataBytes
     */
    private byte[] splitBigData(int num) {

//        long bitIndex = num + (1l << 31);         //获取num数据对应bit数组（虚拟）的索引
        long bitIndex = num + (1l << 3);         //获取num数据对应bit数组（虚拟）的索引
        int index = (int) (bitIndex / 8);         //bit数组（虚拟）在byte数组中的索引
        int innerIndex = (int) (bitIndex % 8);    //bitIndex 在byte[]数组索引index 中的具体位置

        System.out.println(
                "num: " + num + ", bitIndex: " + bitIndex + ", byte[" + index + "] 中的索引：" + innerIndex + ", 1l << 3: "
                + (1l << 3));

        dataBytes[index] = (byte) (dataBytes[index] | (1 << innerIndex));
        return dataBytes;
    }

    /**
     * 输出数组中的数据
     *
     * @param bytes byte数组
     */
    private void output(byte[] bytes) {
        int count = 0;
        for (int i = 0; i < bytes.length; i++) {
            for (int j = 0; j < 8; j++) {
                if (!(((bytes[i]) & (1 << j)) == 0)) {
                    count++;
//                    int number = (int) ((((long) i * 8 + j) - (1l << 31)));
                    int number = (int) ((((long) i * 8 + j) - (1l << 3)));
                    System.out.println("取出的第  " + count + "\t个数: " + number);
                }
            }
        }
    }

    private boolean contains(byte[] bytes, int num){
        int r = num / 8;
        int c = num % 8;
        if (((byte) ((bytes[r] >>> c)) & 1) == 1) {
            return true;
        }
        return false;
    }
}
