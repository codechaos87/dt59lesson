/**
 * Project Name:dt59lesson
 * File Name:Test.java
 * Package Name:hm20180102.homework2
 * Date:2018年1月2日下午5:30:29
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180102.homework2;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:30:29 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Test {
    // 第二题 将父类作为形参。
    public void skill(SchoolPerson sp) {
        sp.skill();
    }

    // 第三题 将父类作为返回值类型。
    public SchoolPerson skill1(int num) {
        SchoolPerson sp = null;
        if (num == 1) {
            sp = new Student("徐超", "学习");
        } else if (num == 2) {
            sp = new Teacher("包老师", "教书");
        }
        return sp;
    }
}
