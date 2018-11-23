package me.sigh.algorithm.bitmap;

public class SimpleBitmapUtil {

    private static final byte MAX = 127;

    public static void main(String[] args) throws InterruptedException {
        int m = 2;

        SimpleBitmapUtil hm = new SimpleBitmapUtil();

        /**
         *  output:
         *      2 existed: false
         *      3 existed: false
         *      2 existed: true
         */
        System.out.printf("%d existed: %s\n", m, hm.add(m));
        System.out.printf("%d existed: %s\n", m + 1, hm.add(m + 1));
        System.out.printf("%d existed: %s\n", m, hm.add(m));
        hm.add(m);
        hm.add(m + 1);
        hm.add(m + 2);

        /**
         * output:
         *  false
         *  true
         *  true
         */
        System.out.println(hm.contains(m - 1));
        System.out.println(hm.contains(m));
        System.out.println(hm.contains(m + 2));
    }

    public SimpleBitmapUtil() {
        bytes = new byte[12500000];
    }

    public SimpleBitmapUtil(int size) {
        bytes = new byte[size];
    }

    private byte[] bytes = null;

    public boolean add(int i) {
        int r = i / 8;
        int c = i % 8;
        boolean existed = contains(i);
        bytes[r] = (byte) (bytes[r] | (1 << c));
        return existed;
    }

    public boolean contains(int i) {
        int r = i / 8;
        int c = i % 8;
        if (((byte) ((bytes[r] >>> c)) & 1) == 1) {
            return true;
        }
        return false;
    }

    public void remove(int i) {
        int r = i / 8;
        int c = i % 8;
        bytes[r] = (byte) (bytes[r] & (((1 << (c + 1)) - 1) ^ MAX));
    }

}
