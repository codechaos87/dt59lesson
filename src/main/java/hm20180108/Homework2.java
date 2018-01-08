/**
 * Project Name:dt59lesson
 * File Name:Homework2.java
 * Package Name:hm20180108
 * Date:2018年1月8日下午5:04:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午5:04:56 <br/>
 * 设置上题线程的优先及，一个设置为低优先级，一个设置为高优先级，观察运行结果。
 * 
 * @author chaos
 * @version
 * @see
 */
public class Homework2 {

    private static final Logger LOG = Logger.getLogger(Homework1.class);

    public static void main(String[] args) {
        ThreadDemo1 t1 = new ThreadDemo1();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        ThreadDemo2 t2 = new ThreadDemo2();
        t1.setPriority(Thread.MIN_PRIORITY);
        new Thread(t2).start();
        for (int i = 0; i < 50; i++) {
            LOG.info(Thread.currentThread().toString() + "-----" + i);
        }

    }

}
