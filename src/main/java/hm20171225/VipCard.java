/**
 * Project Name:dt59lesson
 * File Name:Vip.java
 * Package Name:hm20171225
 * Date:2017年12月25日下午5:32:13
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hm20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:32:13 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class VipCard {

    public static void main(String[] args) {
        System.out.println("请您根据数字选择对应的卡种：");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        VipCard vip = new VipCard();
        vip.proper = num1;
        // 根据属性对应的数值 利用switch循环表示卡种
        switch (vip.proper) {
        case 1:
            System.out.println("您的卡种是至尊级");
            break;
        case 2:
            System.out.println("您的卡种是钻石级");
            break;
        case 3:
            System.out.println("您的卡种是铂金级");
            break;
        case 4:
            System.out.println("您的卡种是黄金级");
            break;
        case 5:
            System.out.println("您的卡种是白银级");
            break;

        }
        System.out.println("您消费的金额为：");
        int price1 = input.nextInt();
        double price2 = vip.price(num1, price1);
        System.out.println("您需要支付的实际金额为：" + price2);
        input.close();
    }

    int proper;

    double price(int num1, int price1) {
        // 1到5对应的7.5到9.5折扣 可以用一个公式对应起来
        return (7 + num1 * 0.5) / 10 * price1;
    }

}
