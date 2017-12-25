/**
 * Project Name:dt59lesson
 * File Name:Max.java
 * Package Name:hm20171225
 * Date:2017年12月25日下午5:13:50
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hm20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:13:50 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Max {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Max max = new Max();
        System.out.print("请输入第一个数值：");
        int num1 = input.nextInt();
        System.out.print("请输入第二个数值：");
        int num2 = input.nextInt();
        int num3 = max.max(num1, num2);
        System.out.println("较大的数值是：" + num3);
        input.close();
    }

    int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }

    }

}
