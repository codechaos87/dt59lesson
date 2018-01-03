/**
 * Project Name:dt59lesson
 * File Name:Homework4.java
 * Package Name:hm20180103
 * Date:2018年1月3日下午3:20:22
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180103;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:20:22 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Homework4 {

    private final static Logger LOG = Logger.getLogger(Homework4.class);

    public static void main(String[] args) {
        try {
            String str = null;
            LOG.info(str);
            str.length();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
