/**
 * Project Name:dt59lesson
 * File Name:TShirt.java
 * Package Name:hm20180102.homework2
 * Date:2018年1月2日下午5:01:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180102.homework2;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:01:49 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Student extends SchoolPerson {

    public Student(String name, String skill) {
        super(name, skill);
    }

    @Override
    public void skill() {
        System.out.println("我的名字叫" + super.getName() + "，我是一名学生，我的技能是" + super.getSkill() + "。");
    }
}
