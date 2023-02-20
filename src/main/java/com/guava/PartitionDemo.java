package com.guava;

import com.google.common.collect.Lists;
import com.sun.org.apache.xml.internal.security.utils.JavaUtils;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class PartitionDemo {

    public static void main(String[] args) {
        testPartition();

    }


    public static void testNewArray() {
        ArrayList<String> arrayList = Lists.newArrayList("1", "2", "3");
        List<String> list = Lists.newArrayList("lin","chen","wu","zhang","qiu");
    }


    public static void testPartition() {
        //初始化list
        List<String> list = Lists.newArrayList("lin","chen","wu","zhang","qiu");
        //分页，每页2个元素
        List<List<String>> partitionList = Lists.partition(list, 2);
        if (CollectionUtils.size(partitionList) > 0) {
            //下标是从0开始的,先判断集合的size，避免数组越界。
            List<String> partList = partitionList.get(0);
            //结果为 [lin, chen]
            System.out.println(partList);
        }
    }



}
