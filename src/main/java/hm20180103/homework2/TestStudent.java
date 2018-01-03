/**
 * Project Name:dt59lesson
 * File Name:TestStudent.java
 * Package Name:hm20180103.homework2
 * Date:2018年1月3日下午2:49:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180103.homework2;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:49:21 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class TestStudent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入学员的成绩：");
        int score = 0;
        try {
            score = input.nextInt();
        } catch (Exception e) {
            System.out.println("请输入正确的数值");
        }
        Student st = new Student(score);
        st.exam();
        input.close();
    }

}
