/**
 * Project Name:dt59lesson
 * File Name:MapTest.java
 * Package Name:hm20180104.homework2
 * Date:2018年1月4日下午4:05:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180104.homework2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午4:05:39 <br/>
 * 使用Map实现一定的功能
 * 
 * @author chaos
 * @version
 * @see
 */
public class MapTest {
    private static final Logger LOG = Logger.getLogger(MapTest.class);

    /**
     * 因为Map是一个接口，无法实例化，用实现了Map接口的HashMap来完成操作。<br/>
     * 构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空 HashMap。
     */
    Map map = new HashMap();

    /**
     * Description: <br/>
     * Map里的添加：将指定的值与此映射中的指定键关联。
     *
     * @author chaos
     */
    @Test
    public void put() {
        LOG.info(map.size());
        LOG.info(map);
        map.put(1, "你");
        map.put(2, "我");
        LOG.info(map.size());
        LOG.info(map);
    }

    /**
     * Description: <br/>
     * 删除：从此映射中移除指定键的映射关系。
     *
     * @author chaos
     */
    @Test
    public void remove() {
        map.put(1, "你");
        map.put(2, "我");
        LOG.info(map);
        map.remove(1);
        LOG.info(map);
    }

    /**
     * Description: <br/>
     * 查询：返回指定键所映射的值；如果对于该键来说，此映射不包含任何映射关系，则返回 null。
     *
     * @author chaos
     */
    @Test
    public void get() {
        map.put(1, "你");
        map.put(2, "我");
        LOG.info(map.get(1));
        LOG.info(map.get(2));
    }

    /**
     * Description: <br/>
     * 遍历：map.keyset返回一个K值 set？，set的方法里有迭代器，用迭代器进行遍历K值。 <br/>
     * 可以根据K值用求V值
     * 
     * @author chaos
     */
    @Test
    public void ketset() {
        map.put(1, "你");
        map.put(2, "我");
        Iterator ite = map.keySet().iterator();
        while (ite.hasNext()) {
            LOG.info("K值为：" + ite.next());
        }

    }

}
