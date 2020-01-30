/**   
 * @Title ExerciseOne.java 
 * @Package com.startdima.test.chapter3.container 
 * @Description TODO 
 * @author dengjiajun deng-jiajun@outlook.com 
 * @date 2019年7月25日 上午10:56:38 
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
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

/** 
 * @ClassName ExerciseOne 
 * @Description TODO
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月25日 上午10:56:38 
 *  
 */
public class ExerciseOne {

    /** 
     * @Title main 
     * @Description TODO
     * @param args
     * @return void
     * @throws 
     */
    public static void main(String[] args) {
        /*
         * 随机生成100个0-10的整数数字字符串，存入List中，
         * 利用迭代器进行数据去重后输出到Properties文件中。
         * Key值为行号，value值为去重后的随机数。
         */
        Random random = new Random();
        IntStream intStream = random.ints(100, 0, 11);// 100个随机整数,范围：[0,11)
        // intStream.forEach(System.out::println);
        
        List list = new ArrayList<Integer>();
        intStream.forEach(list::add);
        System.out.print("list:       ");
        list.forEach((i)->{System.out.print(i+" ");});
        ListIterator litor= list.listIterator();
        List listUnique = new ArrayList<Integer>();
        
        while (litor.hasNext()) {
            Integer i = (Integer)litor.next();
            if(!listUnique.contains(i))
            {
                listUnique.add(i);
            }
        }
        
        System.out.print("\nlistUnique: ");   
        listUnique.forEach((iu)->{System.out.print(iu+" ");});
        
        try {
            // 引入顺序Properties：OrderedProperties 保证配置读写顺序
            OrderedProperties pps = new OrderedProperties();    
            OutputStream out = new FileOutputStream("listUnique.properties");
            
            // 将listUnique写入listUnique.properties
            for(int i=0;i!=listUnique.size();++i)
            {
                String pKey=String.valueOf(i);
                String pValue=String.valueOf(listUnique.get(i));
                pps.setProperty(pKey, pValue);
            }
            // 将此 Properties 表中的属性列表（键和元素对）写入输出流  
            pps.store(out, "store in listUnique");// 参数二为添加该key的修改注释信息，并记录修改时间
            
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
  
    }
    
    
  
}
