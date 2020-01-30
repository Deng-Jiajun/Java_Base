/**
 * @Title SetsDemo.java
 * @Package com.startdima.test.chapter3.container
 * @Description 各类容器使用
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月24日 下午2:16:22
 * @version V1.0
 */
package com.startdima.test.chapter3.container;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @ClassName ContainerDemo
 * @Description 各类容器使用
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月24日 下午2:16:22
 * 
 */
public class ContainerDemo {

    /**
     * @Title main 
     * @Description 各类容器使用入口函数 
     * @param args 
     * @return void 
     * @throws
     */
    public static void main(String[] args) {
        /**
         * 1、Collection 2、泛型 3、List 4、Set 5、Map 6、树 7、Iterator 8、Collections 9、Properties
         */
        /*
         * Collection & Map
         * https://www.cnblogs.com/joyco773/p/6759981.html
         */
        /*
        ---| Iterable: 接口   
                  Iterator iterator()  
                ---|Collection: 单列集合 继承Iterable,都可以获取迭代器
                            ---|List: 接口 有存储顺序, 可重复  
                                ---|ArrayList:  数组实现, 查找快, 增删慢。由于是数组实现, 在增和删的时候会牵扯到数组增容, 以及拷贝元素. 所以慢。数组是可以直接按索引查找, 所以查找时较快  
                                ---|LinkedList: 链表实现, 增删快, 查找慢。由于链表实现, 增加时只要让前一个元素记住自己就可以, 删除时让前一个元素记住后一个元素, 后一个元素记住前一个元素. 这样的增删效率较高但查询时需要一个一个的遍历, 所以效率较低  
                                ---|Vector: 和ArrayList原理相同, 但线程安全, 效率略低和ArrayList实现方式相同, 但考虑了线程安全问题, 所以效率略低  
                            ---|Set: 接口 无存储顺序, 不可重复  
                                ---|HashSet  
                                ---|TreeSet  
                                ---|LinkedHashSet  
                ---|Map: 键值对  
                        ---|HashMap  
                        ---|TreeMap  
                        ---|HashTable  
                        ---|LinkedHashMap
        */

        /*
         * 集合部分操作 https://blog.csdn.net/itlwc/article/details/10148321
         */
        // list 常用操作
        listMethod();
        
        // iterator遍历 继承Iterable的类型都可以获取迭代器
        traversalByIterator();
        
        /*
         * Collections
         * https://www.cnblogs.com/fysola/p/6021134.html
         * 工具类，可对list进行一系列通用操作
         * **提供一套线程安全集合的封装方法**
         * 
         * Collections.unmodifiableXXX(XXX) 可返回对应只读集合
         */
        collectionsMethod();
        
 
        
        /*
         * TreeMap（红黑树实现）
         * https://www.cnblogs.com/skywang12345/p/3310928.html
         * 
         * TreeMap和HashMap 简单使用
         * https://blog.csdn.net/yo_bc/article/details/79316724
         */
        mapOperationTest();
        
        
        /*
         * 
         */
        // 配置文件 .properties
//        propertiesTest();

        
        
    }

    public static void listMethod() {

        List list = new ArrayList();
        // 向列表的尾部追加指定的元素
        list.add("lwc");
        // 在列表的指定位置插入指定元素
        list.add(1, "nxj");
        list.add(1, "nxj2");
        list.add(1, "nxj3");
        // 移除列表中指定位置的元素
        list.remove(0);
        // 返回列表中指定位置的元素
        list.get(0);
        // 用指定元素替换列表中指定位置的元素
        list.set(0, "lp");
        // 追加指定 collection 中的所有元素到此列表的结尾
        list.addAll(new ArrayList());
        // 返回列表中指定的fromIndex(包括)和toIndex(不包括)之间的部分视图
        list.subList(1, 2);
        // 从列表中移除所有元素
        list.clear();
        // 如果列表包含指定的元素,则返回true
        list.contains("nxj");
        // 如果列表包含指定 collection 的所有元素,则返回 true
        list.containsAll(new ArrayList());
        // 比较指定的对象与列表是否相等
        list.equals(new ArrayList());
        // 返回列表的哈希码值
        list.hashCode();
        // 返回列表中首次出现指定元素的索引,如果列表不包含此元素,则返回 -1
        list.indexOf("lwc");
        // 返回列表中最后出现指定元素的索引,如果列表不包含此元素,则返回 -1
        list.lastIndexOf("lwc");
        // 如果列表不包含元素,则返回 true
        list.isEmpty();

        // 移除列表中出现的首个指定元素
        list.remove("lwc");
        // 从列表中移除指定 collection 中包含的所有元素
        list.removeAll(new ArrayList());

        // 返回列表中的元素数
        list.size();

        // 返回以正确顺序包含列表中的所有元素的数组
        list.toArray();
        // 返回以正确顺序包含列表中所有元素的数组
        list.toArray(new String[] {"a", "b"});
    }

    public static void traversalByIterator() {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("str1");
        strList.add("str2");
        strList.add("str3");
        Iterator<String> ite1 = strList.iterator();
        while (ite1.hasNext()) {
            String str = ite1.next();
            System.out.println(str);
        }
    }

public static void propertiesTest() {
        /*
         * Properties
         * 继承自Hashtable<Object,Object>
         */

        // 系统配置文件
        Properties properties = System.getProperties();
        properties.list(System.out);

        /* 
         * 创建自定义配置文件
         * Test.properties
         * 写入内容：
         * name=name
         * Weight=4444
         * Height=3333
         */
        Properties pps = new Properties();
        try {
            pps.load(new FileInputStream("Test.properties"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        Enumeration enum1 = pps.propertyNames();// 得到配置文件的名字
        // 读取所有配置内容
        while (enum1.hasMoreElements()) {
            String strKey = (String)enum1.nextElement();
            String strValue = pps.getProperty(strKey);
            System.out.println(strKey + "=" + strValue);
        }
       
       
        
        // 写入配置
        try {
            InputStream in = new FileInputStream("Test.properties");
            pps.load(in);//从输入流(Test.properties)中读取属性列表（键和元素对）
            
            String pKey="key1";
            String pValue="value1";
            OutputStream out = new FileOutputStream("Test.properties");
            pps.setProperty(pKey, pValue);
            // 以适合使用 load 方法加载到 Properties 表中的格式，  
            // 将此 Properties 表中的属性列表（键和元素对）写入输出流  
            pps.setProperty("key2", "value2");// 再添加一条
            // 装载一次完成所有记录载入，不要装载两次，会变成两部分
            pps.store(out, "Update " + pKey + " value = "+ pValue);// 参数二为添加该key的修改注释信息，并记录修改时间
            
         // tips:可以直接new 一个properties记录配置，store到system.out
            
            out.close();
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        // 读取某项配置
        try {
            InputStream in = new FileInputStream("Test.properties");
            pps.load(in);//从输入流(Test.properties)中读取属性列表（键和元素对）
            System.out.println("getProperty(\"Weight\") = "+pps.getProperty("Weight"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }


public static void collectionsMethod() {
    /*
     * collections
     * https://www.cnblogs.com/fysola/p/6021134.html
     * 工具类，可对list进行一系列通用操作
     */
    
    /*
     * 排序
     */
    ArrayList nums =  new ArrayList();
    nums.add(8);
    nums.add(-3);
    nums.add(2);
    nums.add(9);
    nums.add(-2);
    System.out.println(nums);
    Collections.reverse(nums);
    System.out.println(nums);
    Collections.sort(nums);
    System.out.println(nums);
    Collections.shuffle(nums);
    System.out.println(nums);
    
    /*
     * 查找 替换
     */
    ArrayList num =  new ArrayList();
    num.add(3);
    num.add(-1);
    num.add(-5);
    num.add(10);
    System.out.println(num);
    System.out.println("Collections.max(num) = "+Collections.max(num));
    System.out.println("Collections.min(num) = "+Collections.min(num));
    System.out.println(num);
    Collections.replaceAll(num, -1, -7);
    System.out.println("after replaceAll(num, -1, -7):"+num);
    System.out.println("Collections.frequency(num, -7) = "+Collections.frequency(num, -7));
    Collections.sort(num);
    System.out.println("after srot:"+num);
    System.out.println("Collections.binarySearch(num, -5) = "+Collections.binarySearch(num, -5));
    
    /*
     *  ******线程安全******
     *  SynchronizedList
     *  Collections中几乎对每个集合都定义了同步控制方法，
     *  例如 SynchronizedList(), SynchronizedSet()等方法，
     *  来将集合包装成线程安全的集合。
     */
    Collection c = Collections.synchronizedCollection(new ArrayList());
    List list = Collections.synchronizedList(new ArrayList());
    Set s = Collections.synchronizedSet(new HashSet());
    Map m = Collections.synchronizedMap(new HashMap());
    
    
    /*
     * 只读集合
     * emptyXXX(),返回一个空的只读集合
     * singleXXX()，返回一个只包含指定对象，只有一个元素，只读的集合
     * unmodifiablleXXX()，返回指定集合对象的只读视图。
     */
    
    List lt = Collections.emptyList();
    Set st = Collections.singleton("avs");
    
    Map mp = new HashMap();
    mp.put("a",100);
    mp.put("b", 200);
    mp.put("c",150);
    Map readOnlyMap = Collections.unmodifiableMap(mp);
    
//    // 只读报错
//    lt.add(100);
//    st.add("sdf");
//    mp.put("d", 300);
    
}

public static void mapOperationTest() {
    
    /*
     * 构造
     */
    Map<String, String> map = new HashMap<String, String>();  
    map.put("a", "1");  
    map.put("b", "2");  
    map.put("c", "3");  
    map.put("d", "4");  
      
    System.out.print("HashMap:");  
    for(String key : map.keySet()) {  
        System.out.print(map.get(key) + " ");  
    }  
      
    Map<String, String> linkedMap = new LinkedHashMap<String, String>();  
    linkedMap.put("a", "1");  
    linkedMap.put("b", "2");  
    linkedMap.put("c", "3");  
    linkedMap.put("d", "4");  
      
    System.out.print("LinkedHashMap:");  
    for(String key : linkedMap.keySet()) {  
        System.out.print(linkedMap.get(key) + " ");  
    }  
      
    Map<String, String> treeMap = new TreeMap<String, String>();  
    treeMap.put("a", "1");  
    treeMap.put("b", "2");  
    treeMap.put("c", "3");  
    treeMap.put("d", "4");  
      
    System.out.print("TreeMap:");  
    for(String key : treeMap.keySet()) {  
        System.out.print(treeMap.get(key) + " ");  
    }  
    
    /*
     * 
     */
    
}
}