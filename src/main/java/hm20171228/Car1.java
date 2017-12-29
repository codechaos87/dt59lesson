/**
 * Project Name:dt59lesson
 * File Name:Car.java
 * Package Name:hm20171229
 * Date:2017年12月29日下午3:03:21
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hm20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:03:21 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public abstract class Car1 {

    void summary() {
        System.out.println("生活中不可或缺的交通工具");
    }

    private String color;

    private String strain;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

}
