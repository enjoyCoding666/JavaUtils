package com.guava.argument;

import com.google.common.base.Preconditions;

public class CheckArgumentDemo {


    public static void main(String[] args) {
        checkNotNull();
    }

    /**
     * 判断空指针
     */
    public static void checkNotNull() {
        String str = null;
        Preconditions.checkNotNull(str);
    }

    /**
     *  检查参数，不满足条件，就给出错误提示
     *
     */
    public static void checkArgument() {
        int age = 17;
        Preconditions.checkArgument(age>=18, "年龄未满18~");
    }


    /**
     *  检查参数，不满足条件，就按格式说明符替换后，给出错误提示
     *
     */
    public static void checkArgumentWithFormat() {
        String name = "lin";
        int age = 17;
        Preconditions.checkArgument(age>=18, "%s年龄为%s，年龄未满18",name, age);
    }



}
