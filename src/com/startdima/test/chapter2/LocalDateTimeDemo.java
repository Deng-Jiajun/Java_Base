/**   
 * @Title: LocalDateTimeDemo.java 
 * @Package com.startdima.test.chapter2 
 * @Description: LocalDateTime类库使用
 * @author dengjiajun deng-jiajun@outlook.com 
 * @date 2019年7月11日 下午5:32:57 
 * @version V1.0   
 */ 
package com.startdima.test.chapter2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** 
 * @ClassName: LocalDateTimeDemo 
 * @Description: LocalDateTime类使用
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月11日 下午5:32:57 
 *  
 */
public class LocalDateTimeDemo {

    /** 
     * @Title: main 
     * @Description: LocalDateTime类使用入口函数
     * @param @param args
     * @return void
     * @throws 
     */
    public static void main(String[] args) {

        /* 自定义格式 */

        /*
         * 关于日期格式的大小写区别
         * https://www.zhihu.com/question/23730083/answer/25475256
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        /* LocalDateTime => String */
        LocalDateTime now = LocalDateTime.now();
        String nowText = now.format(formatter);
        System.out.println("LocalDateTime => String : " + nowText);

        /* String => LocalDateTime */
        String datetimeText = "1999-07-11 00:00:01";
        LocalDateTime dateTime = LocalDateTime.parse(datetimeText, formatter);
        System.out.println("String => LocalDateTime : " + dateTime);

    }

}
