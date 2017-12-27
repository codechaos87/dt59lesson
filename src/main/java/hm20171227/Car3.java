/**
 * Project Name:dt59lesson
 * File Name:Car.java
 * Package Name:hm20171227
 * Date:2017年12月27日下午2:40:59
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hm20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:40:59 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Car3 {
    String strain;

    String color;

    int wheel;

    public Car3(String strain, String color, int wheel) {
        this.strain = strain;
        this.color = color;
        this.wheel = wheel;
    }

    public void print() {
        System.out.println("车的品种为：" + strain);
        System.out.println("车的颜色为：" + color);
        System.out.println("车的轮胎数为：" + wheel);
    }
}
