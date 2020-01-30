/**   
 * @Title: StringDemo.java 
 * @Package com.startdima.test.chapter2 
 * @Description: LocalDate类使用
 * @author dengjiajun deng-jiajun@outlook.com 
 * @date 2019年7月12日 下午2:09:46 
 * @version V1.0   
 */ 
package com.startdima.test.chapter2;

/** 
 * @ClassName: StringDemo 
 * @Description: String
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月12日 下午2:09:46 
 *  
 */
public class StringDemo {

    /** 
     * @Title: main 
     * @Description: LocalDate类使用入口主函数 
     * @param args
     * @return void
     * @throws 
     */
    public static void main(String[] args) {

        /* 字符串操作： https://blog.csdn.net/qq_36084640/article/details/79342836 */

        String string = "This is a String";
        System.out.println("string: " + string);
        /* 
         * 字符串查找
         * 1. indexOf(String s)
         * 2. lastIndexOf(String str)
         */
        String strFind = "s";
        System.out.println("first find index: " + string.indexOf(strFind));
        System.out.println("last  find index: " + string.lastIndexOf(strFind));

        /* 
         * 获取指定索引位置的字符 
         * charAt(int index)
         */
        System.out.println("string.charAt(3): " + string.charAt(3));

        /*
         * 获取子字符串
         * 1. substring(int beginIndex)
         * 2. substring(int beginIndex, int endIndex)
         */
        String strNumber = "0123456789";
        System.out.println("\nstr_number: " + strNumber);
        System.out.println("str_number.substring(3)  : " + strNumber.substring(3));
        System.out.println("str_number.substring(3,7): " + strNumber.substring(3, 7));
        
        /* 去空格(前导、后导） */
        String strHavaSpace = "   a   b   c ";
        System.out.println("\nstrHavaSpace     : " + strHavaSpace);
        System.out.println("trim strHavaSpace: " + strHavaSpace.trim());

        /* 
         * 字符串替换 
         * http://c.biancheng.net/view/836.html
         * 
         * 字符串匹配替换
         * replace(String oldChar, String newChar)
         * 
         * 正则表达式匹配替换
         * replaceFirst(String regex, String replacement)
         * replaceAll(String regex, String replacement)
         */
        String strToReplace = "sjf14jh425h124";
        System.out.println("strToReplace: " + strToReplace);
        System.out.println("repalce \"4\" to \"④\"      : " + strToReplace.replace("4", "④"));
        System.out.println("repalce all number to \"N\": " + strToReplace.replaceAll("\\d", "N"));

        /* 
         * 判断字符串的开始与结尾
         * 1. startsWith(String prefix)
         * 2. endsWith(String suffix)
         */
        System.out.println("\nstring.startsWith(\"This\"): " + string.startsWith("This"));
        System.out.println("string.endsWith(\"This\")  : " + string.endsWith("String"));

        /*
         * 判断字符串是否相等
         * 1. equals(String otherstr)
         * 2. equalsIgnoreCase(String otherstr)
         */
        String str1 = "ABCD";
        String str2 = "ABCD";
        String str3 = "ABcD";
        System.out.println("\nstr1:" + str1 + "\nstr2:" + str2 + "\nstr3:" + str3);
        System.out.println("str1.equals(str2)           : " + str1.equals(str2));
        System.out.println("str1.equals(str3)           : " + str1.equals(str3));
        System.out.println("str1.equalsIgnoreCase(str3) : " + str1.equalsIgnoreCase(str3));

        /* 字符串大小比较(ASCII)
         * compareTo(String otherstr)
         * 
         */
        
        System.out.println("str1.compareTo(str2): "+str1.compareTo(str2));
        System.out.println("str1.compareTo(str3):"+str1.compareTo(str3));
        System.out.println("str1.compareToIgnoreCase(str3):"+str1.compareToIgnoreCase(str3));
        
        /*
         * 字母大小写转换
         * toLowerCase()
         * toUpperCase()
         */
        System.out.println("str1.toLowerCase()  : "+str1.toLowerCase());
        System.out.println("str3.toUpperCase()  : "+str3.toUpperCase());
        
        /* 字符串分割
         * split(String sign)
         * split(String sign, in limit)
         */
        String strToSplit = "1,2,3,4,5,6";

        String[] arrSplit = strToSplit.split(",");
        System.out.println("arrSplit:");
        for (String string2 : arrSplit) {
            System.out.println(string2);
        }

        String[] arrSplit2 = strToSplit.split(",", 3);
        System.out.println("arrSplit:");
        for (String string3 : arrSplit2) {
            System.out.println(string3);
        }

        /* 字符串长度 */
        System.out.println("string.length():"+string.length());
        
        /*
         * 把字符串转化为相应的数值
         * int型Integer.parseInt(String)
         * long型Long.parseLong(String)
         * double型Double.parseDouble(String)
         */
        System.out.println("Integer.parseInt(\"123\"):   " + Integer.parseInt("123"));
        System.out.println("Long.parseLong(\"123\"):     " + Long.parseLong("123"));
        System.out.println("Double.parseDouble(\"123\"): " + Double.parseDouble("123"));

        
        /*
         * 字符串和字符数组相互转换
         * String => char[]  : toCharArray()
         * char[] => String  :  String()   构造
         */
        
        /* String => char[] */
        char charArray[] = string.toCharArray();
        System.out.println("charArray:");
        for (char c : charArray) {
            System.out.println(c);
        }

        /* char[] => String */
        String createByCharArray = new String(charArray);
        System.out.println("createByCharArray: " + createByCharArray);
        System.out.println("new String(charArray, 0, 13): " + (new String(charArray, 0, 13)));

        /*
         * 字符串与byte数组的转换 
         * String => byte[]     : getBytes()
         * byte[] => String     : 
         */

        /* 
         * 关于byte: https://my.oschina.net/dontworry/blog/23937
         * byte 8 bits -128 - + 127
         * 1个字母1byte，1个汉字2byte
         */
        
        /* 
         * 当前文件的编码是 utf-8,目前我的输出结果显示，中文为3个byte
         * 确定当前环境对应的中文字节数，才能判断合适的截断长度
         */
        byte byteArray[] = "中文".getBytes();
        System.out.println("\nbyteArray:");
        for (byte b : byteArray) {
            System.out.println(b);
        }

        System.out.println("new String(byteArray):" + new String(byteArray));
        System.out.println("new String(byteArray,0,6):" + new String(byteArray,0,6));
    }
}


