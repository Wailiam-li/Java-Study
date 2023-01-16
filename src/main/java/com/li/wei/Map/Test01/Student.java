package com.li.wei.Map.Test01;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode      //需要重写equals和hashcode，
/*
 *   学生实体类
 */
public class Student {
    private String name;
    private int age;


    @Override
    public String toString() {   // ！！之前没写这个因此没打印出字符！！
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
