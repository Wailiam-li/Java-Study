package com.li.wei.Reflection;

public class Demo1 {

    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是:" + person);
        // 方式一:通过对象查询
        Class c1 = person.getClass();
        System.out.println("c1.hashCode():"+c1.hashCode());
        // 方式二:forName获得
        //Class c2 = Class.forName("github.Annotation.Demo01.Student");
//        System.out.println("c2.hashCode():"+c2.hashCode());
        // 方式三:通过类名.class获得
        Class c3 = Student.class;
        System.out.println("c3.hashCode():"+c3.hashCode());
        // 方式四:基本类型的包装类都有一个Type
        Class c4 = Integer.TYPE;
        System.out.println("c4基本类型的包装类:"+c4);
        // 获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println("c5父类类型:"+c5);
    }

}
