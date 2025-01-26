package com.regex;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  功能：  将 {123} ，替换为 {}
 *
 * 引入 jar 包：
 *
 *     <dependency>
 *       <groupId>commons-io</groupId>
 *       <artifactId>commons-io</artifactId>
 *       <version>2.4</version>
 *     </dependency>
 *
 */
public class RegexReplaceUtil {

    public static void main(String[] args) throws IOException {
        String fileName = "E:\\每日复盘模板.txt";
        // 原始字符串
        StringBuilder sb = new StringBuilder();
        List<String> stringList = FileUtils.readLines(new File(fileName), "UTF-8");
        for (String str : stringList) {
            String replace = str.replaceAll("\\{([^}]+)}", "{}");
            sb.append(replace).append("\n");
        }
        // 输出结果
        System.out.println(sb.toString());
    }

}
