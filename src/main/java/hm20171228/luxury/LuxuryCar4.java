/**
 * Project Name:dt59lesson
 * File Name:LuxuryCar.java
 * Package Name:hm20171228.luxury
 * Date:2017年12月29日下午4:04:32
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hm20171228.luxury;

import hm20171228.Car1;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午4:04:32 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class LuxuryCar4 extends Car1 {
    void summary() {
        System.out.println("我是豪车，价格贵质量好。");
    }

    private int price;

    private String quality;

    void print(int price, String quality) {
        this.price = price;
        this.quality = quality;
        System.out.println("我是豪车，价格为" + price + "元，质量" + quality + "。");
    }
}
