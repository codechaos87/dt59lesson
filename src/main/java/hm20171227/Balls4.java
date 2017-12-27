/**
 * Project Name:dt59lesson
 * File Name:Balls.java
 * Package Name:hm20171227
 * Date:2017年12月27日下午2:47:52
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hm20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:47:52 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Balls4 {

    String strain;

    String size;

    String color;

    String function;

    public Balls4(String strain) {
        this.strain = strain;
    }

    public Balls4(String strain, String size) {
        this(strain);
        this.size = size;
    }

    public Balls4(String strain, String size, String color, String function) {
        this(strain, size);
        this.color = color;
        this.function = function;
    }
}
