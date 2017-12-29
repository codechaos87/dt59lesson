/**
 * Project Name:dt59lesson
 * File Name:LittleCar.java
 * Package Name:hm20171229
 * Date:2017年12月29日下午3:16:09
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hm20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:16:09 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class SedanCar1and2 extends Car1 {
    int wheels;

    private String function;

    void wheel(int wheels, String function) {
        this.wheels = wheels;
        this.function = function;
        System.out.println("我是一辆小汽车，我有" + wheels + "个轮胎，我的颜色是" + super.getColor() + "的，我是用来" + this.function + "的");
    }
}
