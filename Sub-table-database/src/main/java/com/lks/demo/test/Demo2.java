package com.lks.demo.test;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 如何提取字符串中的数据
 *
 * @author lks
 * @Since 1.0
 * @Date 2021/5/25 19:51
 */
public class Demo2 {

    private final static String REGX = "[^0-9]";

    public static List<String> test(List<String> list) {
        List<String> source = new ArrayList<>();
        for (String s : list) {
            if (isNum(s)) {
                source.add(s);
                continue;
            }
            //匹配
            Pattern p = Pattern.compile(REGX);
            Matcher target = p.matcher(s);
            if (!StringUtils.isEmpty(target.replaceAll(""))) {
                source.add(target.replaceAll(""));
            }

        }
        return source;
    }

    private static Boolean isNum(String target) {
        try {
            Long.parseLong(target);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("123abccdfds12");
        List<String> test = test(list);
        System.out.println(test);
    }
}
