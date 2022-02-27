package com.collection.list;

import java.util.Arrays;
import java.util.List;

public class ListUtils {

    public static String listToString(List<String> list) {
        return String.join(",",list);
    }


    public static String listToString2(List<String> list){
        if(list==null){
            return null;
        }
        StringBuilder result = new StringBuilder();
        boolean first = true;
        //第一个前面不拼接","
        for(String string :list) {
            if(first) {
                first=false;
            }else{
                result.append(",");
            }
            result.append(string);
        }
        return result.toString();
    }

    public static List<String> stringToList(String strs){
        String[] str = strs.split(",");
        return Arrays.asList(str);
    }
}