/**
 * Project Name:dt59lesson
 * File Name:SchoolPerson.java
 * Package Name:hm20180102.homework2
 * Date:2018年1月2日下午5:01:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180102.homework2;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:01:01 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public abstract class SchoolPerson {

    private String name;

    private String skill;

    public SchoolPerson(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public abstract void skill();

}
