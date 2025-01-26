package com.regex;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
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
        String originalString = FileUtils.readFileToString(new File(fileName), "UTF-8");

        // 要替换的新内容
        String replacement = "";
        // 定义正则表达式模式
        Pattern pattern = Pattern.compile("\\{([^)]+)}");
        // 创建 Matcher 对象
        Matcher matcher = pattern.matcher(originalString);
        // 存储结果的 StringBuffer
        StringBuffer result = new StringBuffer();
        // 查找并替换匹配项
        while (matcher.find()) {
            // 将匹配项替换为新内容
            matcher.appendReplacement(result, "{" + replacement + "}");
        }
        // 追加最后未匹配部分
        matcher.appendTail(result);
        // 输出结果
        System.out.println(result.toString());
    }

}
