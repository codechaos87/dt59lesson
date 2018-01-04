/**
 * Project Name:dt59lesson
 * File Name:Homework2.java
 * Package Name:hm20180104
 * Date:2018年1月4日下午2:55:15
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180104;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:55:15 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Homework1 {
    private static final Logger LOG = Logger.getLogger(Homework1.class);

    /**
     * String的属性不清楚？？？
     */

    /**
     * 因为String是不可变的，所以不需要使用构造方法。
     */
    String str = "abc";

    @Test
    public void method1() {
        /**
         * 方法1<br/>
         * str.length()<br/>
         * 返回该字符串的长度，返回值类型为int。
         */
        int num = str.length();
        LOG.info(num);
    }

    @Test
    public void method2() {
        /**
         * 方法2<br/>
         * str.charAt(index)<br/>
         * 传回脚标(索引)处的 char值，返回值类型为char<br/>
         * 脚标从0开始<br/>
         */
        char ch = str.charAt(1);
        LOG.info(ch);
    }

    @Test
    public void method3() {
        /**
         * 方法3<br/>
         * str.equals(anObject)<br/>
         * 将此字符串与指定的对象比较，返回值类型为boolean。
         */
        String str1 = "abc";
        boolean result = str.equals(str1);
        LOG.info(result);
    }

    @Test
    public void method4() {
        /**
         * 方法4<br/>
         * str.replace(oldChar, newChar)<br/>
         * 用newChar(新的字符)来替换此字符串中出现的所有oldChar(旧的字符)，返回一个新的字符串。
         */
        String str1 = str.replace("a", "x");
        LOG.info(str1);
    }

    @Test
    public void method5() {
        /**
         * 方法5<br/>
         * str.toCharArray()<br/>
         * 将此字符串转换为一个新的字符数组，返回一个char数组。
         */
        char[] ary = str.toCharArray();
        for (int i = 0; i < ary.length; i++) {
            LOG.info(ary[i]);
        }
    }

}
