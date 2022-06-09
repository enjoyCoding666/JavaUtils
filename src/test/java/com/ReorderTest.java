package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReorderTest {
    public static void main(String[] args) {


        sortedReverseDemo();

    }

    public static void sortedReverseDemo() {
        List<Integer> list= Arrays.asList(1,3,5,7,2,4,6);
        List<Integer> numberList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        numberList.forEach(System.out::println);
    }
}
