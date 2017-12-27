/**
 * Project Name:dt59lesson
 * File Name:Horse.java
 * Package Name:hm20171227
 * Date:2017年12月27日下午3:17:46
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hm20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:17:46 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Horse6 {
    static String STRAIN = "汗血宝马";

    String color = "棕色";

    public void method1() {
        System.out.println("马的品种为：" + STRAIN);
        // 加了static的属性变成了斜体
        System.out.println("马的颜色为：" + color);
    }

    public static void method2() {
        System.out.println("马的品种为：" + STRAIN);
        // 不能使用color这个属性，会报错
    }

}
