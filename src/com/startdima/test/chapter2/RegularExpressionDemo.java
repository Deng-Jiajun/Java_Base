/**   
 * @Title: RegularExpressionDemo.java 
 * @Package com.startdima.test.chapter2 
 * @Description: 正则表达式使用
 * @author dengjiajun deng-jiajun@outlook.com 
 * @date 2019年7月23日 上午10:23:58 
 * @version V1.0   
 */ 
package com.startdima.test.chapter2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * @ClassName: RegularExpressionDemo 
 * @Description: 正则表达式使用
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月23日 上午10:23:58 
 *  
 */
public class RegularExpressionDemo {

    /** 
     * @Title: main 
     * @Description: 正则表达式使用启动函数
     * @param args
     * @return void
     * @throws 
     */
    public static void main(String[] args) {
        /*
        * 常用正则表达式
        * https://www.jb51.net/article/77687.htm
        * 
        * 使用方式
        * https://www.cnblogs.com/Mustr/p/6060242.html
        */

        /*
         * 匹配
         */
        String strNum = "9356847";
        String strNotNum = "935dsg6847";
        String regexNum = "^[0-9]*$";
        Boolean isNum = strNum.matches(regexNum);
        System.out.println(strNum + " is number = " + isNum);
        System.out.println(strNotNum + " is number = " + strNotNum.matches(regexNum));

        String strPhoneNum = "13860445562";
        String strNotPhoneNum = "11111445562";
        String regexPhoneNum = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";
        Boolean isPhoneNum = strPhoneNum.matches(regexPhoneNum);
        System.out.println(strPhoneNum + " is phone number = " + isPhoneNum);
        System.out.println(strNotPhoneNum + " is phone number = " + strNotPhoneNum.matches(regexPhoneNum));

        /*
         * 切割
         */
        String str = "avg   bb   geig   glsd   abc";
        String regexSomeSpace = " +";
        String[] strArrSplitBySomeSpace = str.split(regexSomeSpace);
        System.out.println(strArrSplitBySomeSpace.length);
        for (String s : strArrSplitBySomeSpace) {
            System.out.println(s);
        }

        /*
         * 替换
         */
        String str1 = "wer1389980000ty1234564uiod234345675f";
        /* 字符串中数字替换为# */
        str1 = str1.replaceAll("\\d{5,}", "#");
        System.out.println(str1);

        /*
         * 提取
         */
        String str2 = "yin yu shi wo zui cai de yu yan";
        System.out.println(str2);
        String reg = "\\b[a-z]{3}\\b";// 匹配只有三个字母的单词

        // 将规则封装成对象。
        Pattern pattern = Pattern.compile(reg);

        // 让正则对象和要作用的字符串相关联。获取匹配器对象。
        Matcher matcher = pattern.matcher(str2);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println("start:" + matcher.start() + ",end:" + matcher.end());
        }
        

        
    }

}
