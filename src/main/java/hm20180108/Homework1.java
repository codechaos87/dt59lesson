/**
 * Project Name:dt59lesson
 * File Name:Homework1.java
 * Package Name:hm20180108
 * Date:2018年1月8日下午4:37:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午4:37:01 <br/>
 * 两种方式，创建线程并运行启动多个线程
 * 
 * @author chaos
 * @version
 * @see
 */
public class Homework1 {

    private static final Logger LOG = Logger.getLogger(Homework1.class);

    public static void main(String[] args) {
        ThreadDemo1 t1 = new ThreadDemo1();
        // 使该线程开始执行，Java 虚拟机调用该线程的 run 方法。
        // 不能直接使用run方法，那样还是单线程，并没有开启线程。
        t1.start();
        ThreadDemo2 t2 = new ThreadDemo2();
        // 因为ThreadDemo2实现的是接口Runnable，与Thread类没有关联
        // 所以要新建一个Thread对象，利用其构造方法来调用start方法
        new Thread(t2).start();
        for (int i = 0; i < 50; i++) {
            LOG.info(Thread.currentThread().toString() + "-----" + i);
        }

    }

}

// 第一种：创建一个类继承Thread类，但因为java是单继承，存在父类的时候就要使用第二种，也就是实现接口。
// 重写run方法
class ThreadDemo1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().toString() + "-----" + i);
        }
    }
}

// 第二种：创建一个类实现Runnable接口，重写run方法。
class ThreadDemo2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().toString() + "+++++" + i);
        }
    }
}
