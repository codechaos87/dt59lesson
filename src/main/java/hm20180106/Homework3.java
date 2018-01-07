/**
 * Project Name:dt59lesson
 * File Name:Homework3.java
 * Package Name:hm20180106
 * Date:2018年1月7日下午1:34:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180106;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午1:34:23 <br/>
 * 日期对象输出格式的模板的所有关键字，都需要熟悉，写出几个模板的输出效果
 * 
 * @author chaos
 * @version
 * @see
 */
public class Homework3 {
    private static final Logger LOG = Logger.getLogger(Homework3.class);

    SimpleDateFormat sdf = null;

    @SuppressWarnings("deprecation")
    Date date = new Date(2018 - 1900, 1 - 1, 7, 14, 06, 30);

    @Test
    public void format1() {
        // y:年 M:年中的月份 d:月中的天数 G:Era的标志符 H:一天中的小时数 m:小时中的分钟数 s:分钟中的秒数 z:时区
        sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        String strDate = sdf.format(date);
        LOG.info(strDate);
    }

    @Test
    public void format2() {
        // E:星期中的天数 M:年中的月份 d:月中的天数 y:年
        sdf = new SimpleDateFormat("EEE, MMM d, ''yy");
        String strDate = sdf.format(date);
        LOG.info(strDate);
    }

    @Test
    public void format3() {
        // h:am/pm中的小时数(1~12) m:小时中的分钟数 a:am/pm标记
        sdf = new SimpleDateFormat("h:mm a");
        String strDate = sdf.format(date);
        LOG.info(strDate);
    }

    @Test
    public void format4() {
        // h:am/pm中的小时数(1~12) a:am/pm 标记 z:时区
        sdf = new SimpleDateFormat("hh 'o''clock' a, zzzz");
        String strDate = sdf.format(date);
        LOG.info(strDate);
    }

    @Test
    public void format5() {
        // K:am/pm中的小时数(0-11) m:小时中的分钟数 a:am/pm标记 z:时区
        sdf = new SimpleDateFormat("K:mm a, z");
        String strDate = sdf.format(date);
        LOG.info(strDate);
    }

    @Test
    public void format6() {
        // y:年 M:年中的月份 d:月中的天数 G:Era的标志符 h:am/pm中的小时数(1~12) m:小时中的分钟数 a:am/pm标记
        sdf = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        String strDate = sdf.format(date);
        LOG.info(strDate);
    }

    @Test
    public void format7() {
        // E:星期中的天数 d:月中的天数 M:年中的月份 y:年 H:一天中的小时数 m:小时中的分钟数 s:分钟中的秒数
        // Z:时区
        sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        String strDate = sdf.format(date);
        LOG.info(strDate);
    }

    @Test
    public void format8() {
        // y:年 M:年中的月份 d:月中的天数 H:一天中的小时数 m:小时中的分钟数 s:分钟中的秒数 Z:时区
        sdf = new SimpleDateFormat("yyMMddHHmmssZ");
        String strDate = sdf.format(date);
        LOG.info(strDate);
    }

    @Test
    public void format9() {
        // y:年 M:年中的月份 d:月中的天数 H:一天中的小时数 m:小时中的分钟数 s:分钟中的秒数 S:毫秒数 Z:时区
        sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");// 'T'不知道什么意思
        String strDate = sdf.format(date);
        LOG.info(strDate);
    }
}
