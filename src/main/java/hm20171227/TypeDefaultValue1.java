/**
 * Project Name:dt59lesson
 * File Name:TypeDefaultValue.java
 * Package Name:hm20171227
 * Date:2017年12月27日下午2:08:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hm20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:08:31 <br/>
 * 
 * @author chaos
 * @version
 * @see
 */
public class TypeDefaultValue1 {
    boolean bl;// boolean的默认值为：false

    char c;// char的默认值为：

    byte b;// byte的默认值为：0

    short s;// short的默认值为：0

    int i;// int的默认值为：0

    long l;// long的默认值为：0

    float f;// float的默认值为：0.0

    double d;// double的默认值为：0.0

    String str;// String的默认值为：null

    int[] ary;// int[]的默认值为：null

    public void print() {
        System.out.println("boolean的默认值为：" + bl);
        System.out.println("byte的默认值为：" + b);
        System.out.println("short的默认值为：" + s);
        System.out.println("char的默认值为：" + c);
        System.out.println("int的默认值为：" + i);
        System.out.println("long的默认值为：" + l);
        System.out.println("float的默认值为：" + f);
        System.out.println("double的默认值为：" + d);
        System.out.println("String的默认值为：" + str);
        System.out.println("int[]的默认值为：" + ary);
    }
}
