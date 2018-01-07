/**
 * Project Name:dt59lesson
 * File Name:Homework2.java
 * Package Name:hm20180105
 * Date:2018年1月7日下午12:36:15
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180106;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午12:36:15 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class Homework2 {
    private static final Logger LOG = Logger.getLogger(Homework2.class);

    public static void main(String[] args) {

        BufferedReader bufr = null;
        BufferedWriter bufw = null;
        try {
            bufr = new BufferedReader(
                    new FileReader("D:\\git\\dt59lesson\\src\\main\\java\\hm20180106\\Homework1.java"));
            bufw = new BufferedWriter(new FileWriter(
                    "D:\\git\\dt59lesson\\src\\main\\java\\hm20180106\\Homework1_copy.txt"));
            String line = null;
            while ((line = bufr.readLine()) != null) {
                bufw.write(line);
                bufw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("读写失败");
        } finally {
            if (bufr != null) {
                try {
                    bufr.close();
                } catch (IOException e) {
                    throw new RuntimeException("读取关闭失败");
                }
            }
            if (bufw != null) {
                try {
                    bufw.close();
                } catch (IOException e) {
                    throw new RuntimeException("写入关闭失败");
                }
            }
            LOG.info("文件拷贝成功");
        }
    }
}
