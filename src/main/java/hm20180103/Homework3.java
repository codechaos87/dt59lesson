/**
 * Project Name:dt59lesson
 * File Name:Homework3.java
 * Package Name:hm20180103
 * Date:2018年1月3日下午3:05:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:05:30 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Homework3 {

    public static void main(String[] args) {
        try {
            String str = null;
            str.length();
        } catch (Exception e) {
            System.out.println("请输入正确的数据");
            e.printStackTrace();
        }
    }

}
