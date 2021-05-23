package com.example.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dorra
 * @date 2021/05/23 17:09
 * @description 提取句子中的英文单词
 * 方法:
 * 方法1:传统的方法:使用遍历,代码量大,效率不高
 * 方法2:正则表达式
 * 下面用正则表达式实现
 */
public class RegexpTest {
    public static void main(String[] args) {
        String content = "我喜欢 Java 语言, 我也学习 Python.";
        // 创建一个 Pattern 对象, 模式对象(正则表达式对象)
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        // 创建一个匹配器对象,
        // Creates a matcher that will match the given input against this pattern.
        // (翻译过来: matcher 匹配器按照 pattern 模式到 content 文本中去匹配)
        // 找到就返回 true, 否则返回 false
        Matcher matcher = pattern.matcher(content);
        // 开始循环匹配
        while (matcher.find()) {
            // 获取匹配到的内容
            System.out.println(matcher.group(0));
        }
    }
}
