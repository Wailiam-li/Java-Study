package com.li.wei.Stream.Test02;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //题目1：将所有“男”性输出出来
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"李威-男-22","李辉-男-23","李慧-女-22","李嘉-女-21","李慧-女-22");

        //list.stream().filter(e->e.split("-")[1]);  //！！！！！！！！写不出来:怎么样用字符型数组装呢？
        list.stream().filter(e->"女".equals(e.split("-")[1]))
                                    .forEach(s-> System.out.println(s));
        //收集为List集合
        List<String> collect = list.stream()
                                   .filter(e -> "女".equals(e.split("-")[1]))
                                   .collect(Collectors.toList());
        System.out.println(collect);

        //收集为Set集合
        Set<String> collect2 = list.stream()
                .filter(e -> "女".equals(e.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(collect2);

        //收集为Map集合
        Map<String,Integer> map=list.stream()
                                    .distinct()
                                    .filter(e -> "女".equals(e.split("-")[1]))
                                     //这里注意toMap（e1,e2）的使用！  e就表示集合中的某一个单独的元素数据,
                                    .collect(Collectors.toMap(e->e.split("-")[0],e->Integer.parseInt(e.split("-")[2])));
        System.out.println(map);
        //！！！注：将集合收集到 Map集合中，键 是不能重复的！否则将报错

    }
}
