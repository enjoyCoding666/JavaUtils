package com.hutool;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;

import java.util.Arrays;
import java.util.List;

public class ListUtilsDemo {

    public void page() {
        List<String> list = Arrays.asList("1","2","3","4");
        List<String> pageList = ListUtil.page(0, 2, list);
        pageList.forEach(System.out::println);
    }
}
