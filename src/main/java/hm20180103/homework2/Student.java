/**
 * Project Name:dt59lesson
 * File Name:Student.java
 * Package Name:hm20180103.homework2
 * Date:2018年1月3日下午2:44:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180103.homework2;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:44:36 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Student implements GaoKao {
    private int score;

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public void exam() {
        if (getScore() > GaoKao.SCORE) {
            System.out.println("你的分数为" + getScore() + "，恭喜你的分数已经达标");
        } else {
            System.out.println("还需继续努力骚年");
        }
    }

}
