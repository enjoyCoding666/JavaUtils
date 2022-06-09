package com;

import java.util.HashMap;
import java.util.Map;

public class MapGetTest {
    public static void main(String[] args) {

//        getMap();

        getOrDefaultMap();
    }

    private static void getOrDefaultMap() {
        Map<String, Integer> map = new HashMap<>();
        int age = map.getOrDefault("abc", 0);
        System.out.println(age);

    }

    private static void getMap() {
        Map<String, Integer> map = new HashMap<>();
        int age = map.get("abc");
        System.out.println(age);
    }
}
