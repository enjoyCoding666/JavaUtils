package com.hutool;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;

import java.util.Arrays;
import java.util.List;

public class CollUtilsDemo {

    public static void main(String[] args) {
        new CollUtilsDemo().pageDemo();
    }

    /**
     * pageNo   页码，从0开始计数，0表示第一页
     * pageSize 每页的条目数
     *
     */
    public void pageDemo() {
        List<String> list = Arrays.asList("1","2","3","4");
        List<String> pageList = CollUtil.page(0, 2, list);
        pageList.forEach(System.out::println);
    }

    public void findOneDemo() {
        List<String> list = Arrays.asList("2","3");
        String str = CollUtil.findOne(list, num -> StrUtil.equals("2", num));
        System.out.println(str);
    }

    public void getDemo() {
        List<String> list = Arrays.asList("1","2","3","4");
        String str = CollUtil.get(list, 0);
        System.out.println(str);
    }

    public void addAllDemo() {
        List<String> list = Arrays.asList("1","2","3","4");
        List<String> list2 = null;
        //自带null的判断，不需要再重复判断
        CollUtil.addAll(list, list2);
        list.forEach(System.out::println);
    }

}
