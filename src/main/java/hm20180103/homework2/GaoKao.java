/**
 * Project Name:dt59lesson
 * File Name:GaoKao.java
 * Package Name:hm20180103.homework2
 * Date:2018年1月3日下午2:39:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hm20180103.homework2;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:39:31 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public interface GaoKao {
    /**
     * 分数线为300 超过这个分数就能上大学
     */
    public static final int SCORE = 300;

    /**
     * 高考的功能 Description: <br/>
     * 
     * @author chaos
     * 
     *         通过达到分数要求的就能上大学
     */
    public void exam();
}
