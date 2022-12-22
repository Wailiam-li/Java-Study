package com.li.wei.Map.Test01;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Student {
    private String name;
    private int age;

   //需要重写equals和hashcode，

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }



    @Override
    public String toString() {   // ！！之前没写这个因此没打印出字符！！
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
