/**
 * Project Name:dt59lesson
 * File Name:Dog.java
 * Package Name:hm20171227
 * Date:2017年12月27日下午2:28:16
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hm20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:28:16 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Dog2 {
    String name = "chaos";

    int age = 1;

    String strain = "柯基";

    public Dog2() {
        System.out.println("狗的名字是：" + name + "\n年级为" + age + "岁\n品种为" + strain);
        name = "旺财";
        age = 2;
        strain = "金毛";
    }

    public static void main(String[] args) {
        new Dog2();
    }
}
