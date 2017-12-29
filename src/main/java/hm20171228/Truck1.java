/**
 * Project Name:dt59lesson
 * File Name:Truck.java
 * Package Name:hm20171229
 * Date:2017年12月29日下午3:17:36
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hm20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:17:36 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Truck1 extends Car1 {
    private String function;

    private String size;

    void function(String function, String size) {
        this.function = function;
        this.size = size;
        System.out.println("我是一辆" + this.size + "汽车，颜色是" + super.getColor() + "的，主要用途是来" + this.function + "的");
    }
}
