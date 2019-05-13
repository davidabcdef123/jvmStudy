package com.david;

/**
 * @author: sun chao
 * Create at: 2019-05-13
 */
public class SelfAdd {

    public static void main(String[] args) {
        f1();
    }

    public static void f1() {
        for(int i=0;i<10;i++) {
            System.out.println(i);
        }
    }

    public static void f2() {
        for(int i=0;i<10;++i) {
            System.out.println(i);
        }
    }

    public static void f3() {
        int i=0;
        int j = i++;
        System.out.println(j);
    }

    public static void f4() {
        int i=0;
        int j = ++i;
        System.out.println(j);
    }
}
