package com.david.eight;

//-verbose:gc -XX:+PrintGCDetails
public class EdenAllocator {

    public static void main(String[] args) {
        byte[] data = new byte[20 * 1024 * 1024];
    }
}
