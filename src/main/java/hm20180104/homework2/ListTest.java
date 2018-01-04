/**
 * Project Name:dt59lesson
 * File Name:List.java
 * Package Name:hm20180104.homework2
 * Date:2018年1月4日下午3:12:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180104.homework2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:12:04 <br/>
 * 使用List实现一定的功能
 * 
 * @author chaos
 * @version
 * @see
 */
public class ListTest {
    private static final Logger LOG = Logger.getLogger(ListTest.class);

    /**
     * 因为List是一个接口，无法实例化，用实现了List接口的ArrayList来完成操作。<br/>
     * ArrayList的无参构造默认构造一个初始容量为10的空列表
     */
    List list = new ArrayList();

    /**
     * Description: <br/>
     * 添加：添加指定元素到此列表的尾部<br/>
     * 返回值类型为boolean类型。
     * 
     * @author chaos
     */
    @Test
    public void add() {
        list.add("abc");
        list.add(2);
        list.add('我');
        for (int i = 0; i < list.size(); i++) {
            LOG.info(list.get(i));
        }
    }

    /**
     * Description: <br/>
     * 修改：用指定元素替换列表中指定位置的元素<br/>
     *
     * @author chaos
     */
    @Test
    public void set() {
        list.add("abc");
        list.add(2);
        list.add('我');
        LOG.info(list.get(1));
        list.set(1, 250);
        LOG.info(list.get(1));
    }

    /**
     * Description: <br/>
     * 删除：移除列表中指定位置的元素
     * 
     * @author chaos
     */
    @Test
    public void remove() {
        list.add("abc");
        list.add(5);
        list.add('我');
        LOG.info(list.get(0));
        LOG.info(list.size());
        list.remove(0);
        LOG.info(list.get(0));
        LOG.info(list.size());

    }

    /**
     * Description: <br/>
     * 查询：返回列表中指定位置的元素
     *
     * @author chaos
     */
    @Test
    public void get() {
        list.add("abc");
        list.add(5);
        list.add('我');
        LOG.info(list.get(0));
        LOG.info(list.get(1));
        LOG.info(list.get(2));
    }

    /**
     * Description: <br/>
     * 插入：在列表的指定位置插入指定元素。
     *
     * @author chaos
     */
    @Test
    public void addimport() {
        list.add("abc");
        list.add(5);
        list.add('我');
        LOG.info(list.get(2));
        LOG.info(list.size());
        list.add(2, 99);
        LOG.info(list.get(2));
        LOG.info(list.get(3));
        LOG.info(list.size());
    }

    /**
     * Description: <br/>
     * 遍历： 用迭代器遍历。<br/>
     * 
     * @author chaos
     */
    @Test
    public void iterator() {
        list.add("abc");
        list.add(5);
        list.add('我');
        Iterator ite = list.iterator();
        while (ite.hasNext()) {
            LOG.info(ite.next());
        }
    }

}
