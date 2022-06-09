package com;

import java.util.Objects;

public class ObjectsTest {
    public static void main(String[] args) {
        System.out.println(toString("abc"));
    }

    public static String toString(String str) {
        str = Objects.toString(str, "测试");
        return str;
    }
}
