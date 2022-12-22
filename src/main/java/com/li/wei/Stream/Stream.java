package com.li.wei.Stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {

//    public static void main(String[] args) {
//    }     不太懂为什么加了Test之后就不用主函数了？？

    /*
     * filter功能：添加一定的条件，过滤掉部分元素
     */
    @Test
    public void filter() {
        List<String> list = Arrays.asList("abc", "ab", "a", "efg", "abcd");
        List<String> filter = list.stream().filter(str -> str.contains("a")).collect(Collectors.toList());
        System.out.println(filter);
    }

    /*
     * distinct功能：去重集合中的元素
     */
    @Test
    public void distinct() {
        List<String> list = Arrays.asList("abc", "abc", "abc", "efg", "abcd");
        List<String> distinct = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);
    }

    /*
     * limit功能：返回前n个元素
     */
    @Test
    public void limit() {
        List<String> list = Arrays.asList("abc", "ab", "a", "efg", "abcd");
        List<String> limit = list.stream().limit(1).collect(Collectors.toList());
        System.out.println(limit);  //这里为啥没有运行结果？  要在主函数里？
        //——>添加了Test注解后，可以运行了
    }

    /*
     * map功能：对流中所有元素做统一处理
     */
    //这里以所有元素加前缀为例：
    @Test
    public void mapConcat() {
        List<String> list = Arrays.asList("abc", "ab", "a", "efg", "abcd");
        List<String> map = list.stream().map(str -> str.concat("_liwei")).collect(Collectors.toList());
        System.out.println(map);              //这里的.concat为用于拼接的意思
    }

    @Test
    public void mapTostring() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 9, 7);
        //或用：str -> String.valueOf(str)
        List<String> map = list.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(map);         //这里就已经将集合中的每个整型转换成了字符串类型了，再以集合的方式返回
    }


    /*
     * sorted功能：对流中所有元素做排序处理，默认是对字母字符串是字典排序、对数字是升序排序；
     */
    @Test
    public void sorted() {
        List<Integer> list = Arrays.asList(2, 1, 4, 3, 5, 6, 9, 7);
        //或用：str -> String.valueOf(str)
        List<Integer> map = list.stream().sorted().collect(Collectors.toList());
        System.out.println(map);
    }


    //以下是终止操作符
    /*
     * forEach功能：循环遍历
     */
    @Test
    public void forEach() {
        List<String> list = Arrays.asList("abc", "ad", "adc", "ace", "ae", "ae", "io");
        list.stream().forEach(i -> System.out.println(i));   //真的很方便！！连变量都不用写了。

    }

    /*
     * collect功能：将流转换成其他的形式：list,set,map
     * set集合特性：无序、去重。
     */
    @Test
    public void map() {
        List<String> list = Arrays.asList("abc", "ad", "adc", "ace", "ae", "ae", "io");
        Map<String, String> collect = list.stream().collect(Collectors.toMap((v -> "prod_" + v), v -> v, (oldvaule, newvalue) -> newvalue));
        System.out.println(collect);                                                                    //这里表示如果键和值有重复将会采用新的值

    }


}