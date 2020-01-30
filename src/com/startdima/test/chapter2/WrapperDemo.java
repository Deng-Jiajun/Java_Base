/**
 * @Title: WrapperDemo.java
 * @Package com.startdima.test.chapter2
 * @Description: 包装类使用
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月12日 下午5:52:57
 * @version V1.0
 */
package com.startdima.test.chapter2;

/**
 * @ClassName: WrapperDemo
 * @Description: 包装类使用
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月12日 下午5:52:57
 * 
 */
public class WrapperDemo {

    /**
     * @Title: main @Description: 包装类使用入口函数
     * @param args 
     * @return void 
     * @throws
     */
    public static void main(String[] args) {
        /*
         * Java 包装器： https://www.w3cschool.cn/java/java-wrapper-classes.html
         */

        /* 
         * 包装类创建
         * 构造函数创建
         */
        System.out.println("--------------Create by Constructor--------------");
        // Creates an Integer object from an int
        Integer intObj1 = new Integer(100);
        
        // Creates an Integer object from a String
        Integer intObj2 = new Integer("1969");

        // Creates a Double object from a double
        Double doubleObj1 = new Double(10.45);

        // Creates a Double object from a String
        Double doubleObj2 = new Double("234.60");

        // Creates a Character object from a char
        Character charObj1 = new Character('A');

        // Creates a Boolean object from a boolean
        Boolean booleanObj1 = new Boolean(true);

        // Creates Boolean objects from Strings
        Boolean booleanTrue = new Boolean("true");
        Boolean booleanFalse = new Boolean("false");

        /*
         * 包装类创建
         * valueOf()
         */
        System.out.println("--------------Create by valueOf()--------------");
        Integer intObjByValueOf1 = Integer.valueOf(100);
        Integer intObjByValueOf2 = Integer.valueOf("2014");
        Double doubleObjByValueOf1 = Double.valueOf(10.45);
        Double doubleObjByValueOf2 = Double.valueOf("234.56");
        Character charObjByValueOf1 = Character.valueOf('A');
        // Boolean boolObjByValueOf1=Boolean.valueOf(true);

        /*
         * 数字数据类型
         */
        System.out.println("--------------Number type--------------");
        Integer intObj = Integer.valueOf(100);

        // Gets byte from Integer
        byte b = intObj.byteValue();

        // Gets double from Integer
        double dd = intObj.doubleValue();
        System.out.println("intObj = " + intObj);
        System.out.println("byte from  intObj = " + b);
        System.out.println("double from  intObj = " + dd);

        // Creates a Double object
        Double doubleObj = Double.valueOf("123.45");

        // Gets different types of primitive values from Double
        double d = doubleObj.doubleValue();
        float f = doubleObj.floatValue();
        int i = doubleObj.intValue();
        long l = doubleObj.longValue();

        System.out.println("doubleObj = " + doubleObj);
        System.out.println("double from  doubleObj   = " + d);
        System.out.println("float from  doubleObj   = " + f);
        System.out.println("int from  doubleObj   = " + i);
        System.out.println("long from  doubleObj   = " + l);

        /* 
         * 字符数据类型
         */
        System.out.println("--------------Character type--------------");
        // Using the constructor
        Character c1 = new Character('A');

        // Using the factory method - preferred
        Character c2 = Character.valueOf('2');
        Character c3 = Character.valueOf('-');

        // Getting the wrapped char values
        char cc1 = c1.charValue();
        char cc2 = c2.charValue();
        char cc3 = c3.charValue();

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        // Using some Character class methods on c1
        System.out.println("isLowerCase c1 = " + Character.isLowerCase(cc1));
        System.out.println("isDigit c1 = " + Character.isDigit(cc1));
        System.out.println("isLetter c1 = " + Character.isLetter(cc1));
        System.out.println("Lowercase of c1 = " + Character.toLowerCase(cc1));

        // Using some Character class methods on c2
        System.out.println("isLowerCase c2 = " + Character.isLowerCase(cc2));
        System.out.println("isDigit c2 = " + Character.isDigit(cc2));
        System.out.println("isLetter c2 = " + Character.isLetter(cc2));
        System.out.println("Lowercase of c2 = " + Character.toLowerCase(cc2));

        System.out.println("Uppercase of c3 = " + Character.toUpperCase(cc3));

        
        /*
         * Boolean类型
         */
        // Using constructors
        Boolean b1True = new Boolean(true);
        Boolean b2True = new Boolean("true");
        Boolean b3True = new Boolean("tRuE");
        Boolean b4False = new Boolean("false");
        Boolean b5False = new Boolean("what it is"); // false

        // Using the factory methods
        Boolean b6True = Boolean.valueOf(true);
        Boolean b7True = Boolean.valueOf("true");
        Boolean b8True = Boolean.valueOf("tRuE");
        Boolean b9False = Boolean.valueOf("false");
        Boolean b10False = Boolean.valueOf("what it is"); // false

        // Getting a boolean value from a Boolean object
        boolean bbTrue = b8True.booleanValue();

        boolean bTrue = Boolean.parseBoolean("true");
        boolean bFalse = Boolean.parseBoolean("This string evaluates to false");

        Boolean bcTrue = Boolean.TRUE;
        Boolean bcFalse = Boolean.FALSE;

        System.out.println("bcTrue = " + bcTrue);
        System.out.println("bcFalse = " + bcFalse);
    }
}
