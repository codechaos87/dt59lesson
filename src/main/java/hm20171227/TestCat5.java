/**
 * Project Name:dt59lesson
 * File Name:TestCat5.java
 * Package Name:hm20171227
 * Date:2017年12月27日下午3:11:32
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hm20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:11:32 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class TestCat5 {

    public static void main(String[] args) {

        Cat5 cat = new Cat5();
        cat.setName("chaos");
        cat.setStrain("蓝猫");
        cat.setAge(5);
        System.out.println("猫的名字为：" + cat.getName());
        System.out.println("猫的品种为：" + cat.getStrain());
        System.out.println("猫的年龄为：" + cat.getAge() + "岁");

    }

}
