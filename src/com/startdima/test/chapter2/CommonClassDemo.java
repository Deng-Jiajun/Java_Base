/**   
 * @Title: CommonClassDemo.java 
 * @Package com.startdima.test.chapter2 
 * @Description: 部分常用类库使用
 * @author dengjiajun deng-jiajun@outlook.com 
 * @date 2019年7月23日 上午11:17:08 
 * @version V1.0   
 */ 
package com.startdima.test.chapter2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.stream.DoubleStream;

/** 
 * @ClassName: CommonClassDemo 
 * @Description: 部分常用类库使用
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月23日 上午11:17:08 
 *  
 */
public class CommonClassDemo {

    /** 
     * @Title: main 
     * @Description: 部分常用类库使用入口函数
     * @param args
     * @return void
     * @throws 
     */
    public static void main(String[] args) {
        /*
         * System、Runtime、Date、Calendar、Math、Random
         * http://www.voidcn.com/article/p-gxjosqfq-bkz.html
         * 
         * Arrays
         * https://blog.csdn.net/Goodbye_Youth/article/details/81003817
         */
        
        /*
         * System
         * 类中的方法和属性都是*静态*的。
         * out:标准输出，默认是控制台。
         * in：标准输入，默认是键盘。
         * 
         * Properties：系统内的属性信息
         * 系统版本、路径、JVM、JRE
         */
        // 获取系统信息
        Properties properties = System.getProperties();
        System.out.println(properties);
        Set setItem = properties.keySet();
        Iterator itemIterator = setItem.iterator();
        while (itemIterator.hasNext()) {
            String strIteam = (String)itemIterator.next();
            System.out.println("[" + strIteam + " : " + properties.getProperty(strIteam) + "]");
        }

        // 在系统中自定义一些特有信息
        System.setProperty("mykey", "myvalue");
        // 获取指定该信息
        System.out.println("find value by \"mykey\" = " + System.getProperty("mykey"));

        /*
         * Math
         */
        /* ceil返回大于指定数据的最小整数 */
        System.out.println("Math.ceil(16.34) = " + Math.ceil(16.34));
        /* floor返回小于指定数据的最大整数 */
        System.out.println("Math.floor(12.34) = " + Math.floor(12.34));
        /* round四舍五入 */
        System.out.println("Math.round(12.54) = " + Math.round(12.54));
        /* x^y */
        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));

        /* 截断 2位小数 */
        double d1 = 143.3524235;
        BigDecimal b = new BigDecimal(d1);
        double d2 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1 - d2);// 0.0024234999999919182 有点危险

        /* 格式化输出 */
        String strByFormat = String.format("%.2f", d1);
        System.out.println(strByFormat);

        /* 文本规则 */
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.00");
        System.out.println(df.format(d1));

        /*
         * Random
         */
        Random random = new Random();

        for (int i = 0; i != 3; ++i) {
            System.out.println("random.nextInt(6) = " + random.nextInt(6));// [0,5]
            System.out.println("random.nextDouble() = " + random.nextDouble());
            System.out.println("random.nextBoolean() = " + random.nextBoolean());
        }
        // (long streamSize, double randomNumberOrigin, double randomNumberBound)
        DoubleStream doubleStream = random.doubles(7, 1, 10);
        doubleStream.forEach(System.out::println);
        
        
        /*
         * Array
         */
        
        /* asList 
         * 注意：该方法返回的是Arrays内部静态类ArrayList，而不是我们平常使用的ArrayList,
         * 该静态类ArrayList没有覆盖父类的add, remove等方法，所以如果直接调用，会报UnsupportedOperationException异常
         */
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        list1.forEach(i -> System.out.print(i + " "));// 1 3 5

        Integer[] data2 = {2, 4, 6};
        List<Integer> list2 = Arrays.asList(data2);
        list2.forEach(i -> System.out.print(i + " "));// 2 4 6
        System.out.println();

        Arrays.fill(data2, 9);
        System.out.println(Arrays.toString(data2));// [9, 9, 9]
        System.out.println(list1.toString());// [1, 3, 5]
        System.out.println(list2.toString());// [9, 9, 9]
        System.out.println("date2:");
        list2.set(1,9999);
        
        
        for (int i = 0; i < data2.length; i++) {
            System.out.print(data2[i]+" ");
        }// 9 9999 9 
        System.out.println("\nlist2:");
        System.out.println(list2.toString());// [9, 9999, 9]

        // asList只引用，没有拷贝数据，源数据改变其随之改变
    }
}
