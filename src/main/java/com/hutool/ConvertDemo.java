package com.hutool;

import cn.hutool.core.convert.Convert;
import com.alibaba.fastjson.JSON;

import java.util.List;

public class ConvertDemo {

    public static void main(String[] args) {
        new ConvertDemo().convertToListDemo();
    }

    /**
     *  转换为指定类型数组
     */
    public void convertArrayDemo() {
        String[] b = { "1", "2", "3", "4" };
        Integer[] intArray = Convert.toIntArray(b);
        System.out.println(JSON.toJSONString(intArray));
    }


    /**
     * 转换为list
     */
    public void convertToListDemo() {
        String[] strArr = {"a", "b", "c", "d"};
        List<String> strList = Convert.toList(String.class, strArr);
        System.out.println(strList);
    }

}
