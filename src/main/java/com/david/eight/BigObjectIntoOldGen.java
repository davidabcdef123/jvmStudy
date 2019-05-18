package com.david.eight;

//-verbose:gc -XX:+PrintGCDetails -Xms20M -Xmx20M -Xmn10M -XX:PretenureSizeThreshold=6M
public class BigObjectIntoOldGen {

    public static void main(String[] args) {
        byte[] d1 = new byte[6 * 1024 * 1024];

    }
}
