/**
 * Project Name:dt59lesson
 * File Name:Test2.java
 * Package Name:test
 * Date:2018年1月7日上午11:17:07
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180106;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 上午11:17:07 <br/>
 * 编程输出指定目录中的所有文件（包括子目录中的文件）。
 * 
 * @author chaos
 * @version
 * @see
 */
public class Homework1 {
    private static final Logger LOG = Logger.getLogger(Homework1.class);

    public static void main(String[] args) {
        // 指定一个路劲来查询文件与盘符
        String str = "E:\\workspace\\dt59_lesson1\\src";

        // 新建一个该路径的文件对象
        File file1 = new File(str);

        // 将这个文件变成该对象类型的数组
        File[] files1 = file1.listFiles();

        // 利用加强for循环遍历数组
        for (File file2 : files1) {

            // 判断是文件还是目录
            if (file2.isFile()) {
                LOG.info("文件名：\\" + file2.getName());
            } else if (file2.isDirectory()) {
                LOG.info("------------------------------------");
                LOG.info("目录名：\\" + file2.getName());
                LOG.info("------------------------------------");

                // 使用缓冲添加路径
                StringBuffer sb = new StringBuffer(str);
                sb.append(File.separator);
                sb.append(file2.getName());

                // 将添加好的路径转换成字符串，重新新建一个文件对象
                File file3 = new File(sb.toString());
                File[] files2 = file3.listFiles();
                for (File file4 : files2) {
                    if (file4.isFile()) {
                        LOG.info("文件名：\\" + file4.getName());
                    } else if (file4.isDirectory()) {
                        // System.out.println("------------------------------------");
                        LOG.info("目录名：\\" + file4.getName());
                    }

                }
            }
        }
    }
}
