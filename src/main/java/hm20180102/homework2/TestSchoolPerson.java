/**
 * Project Name:dt59lesson
 * File Name:TestSchoolPerson.java
 * Package Name:hm20180102.homework2
 * Date:2018年1月2日下午6:04:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180102.homework2;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午6:04:18 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class TestSchoolPerson {

    public static void main(String[] args) {
        // 第二题
        Test t = new Test();
        SchoolPerson sp = new Student("徐超", "学习");
        SchoolPerson sp1 = new Teacher("包老师", "教书");
        t.skill(sp);
        t.skill(sp1);

        // 第三题
        Scanner input = new Scanner(System.in);
        System.out.print("请选择类型：");
        int num = input.nextInt();
        SchoolPerson sp2 = t.skill1(num);
        if (sp2 != null) {
            t.skill(sp2);
        } else {
            System.out.println("输入错误，请输入1或者2选择类型");
        }
        input.close();
    }

}
