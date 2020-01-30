/**   
 * @Title ExerciseTwo.java 
 * @Package com.startdima.test.chapter3.container 
 * @Description TODO 
 * @author dengjiajun deng-jiajun@outlook.com 
 * @date 2019年7月25日 下午2:25:33 
 * @version V1.0   
 */ 
package com.startdima.test.chapter3.container;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** 
 * @ClassName ExerciseTwo 
 * @Description TODO
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月25日 下午2:25:33 
 *  
 */
public class ExerciseTwo {

    /** 
     * @Title main 
     * @Description TODO
     * @param args
     * @return void
     * @throws 
     */
    public static void main(String[] args) {
        /*
        * 使用一个map，用key存老师名称、用value存授课课程。
        * 1.利用两种迭代方式输出所有老师及授课内容。
        * 2.输出所有教“数学”的老师名称。
        */

        HashMap map = new HashMap<>();
        map.put("语文老师1", "语文");
        map.put("数学老师1", "数学");
        map.put("英语老师1", "英语");

        map.put("语文老师2", "语文");
        map.put("数学老师2", "数学");
        map.put("英语老师2", "英语");

        map.put("语文老师3", "语文");
        map.put("数学老师3", "数学");
        map.put("英语老师3", "英语");

        /*
         * 遍历输出
         */
        // 方式1 通过keySet遍历key，通过key二次取值
        System.out.println("case 1:");
        for (Object key : map.keySet()) {
            System.out.println("key= " + key + " and value= " + map.get(key));
        }
        // 方式2 通过entrySet遍历
        System.out.println("case 2:");
        for (Map.Entry<String, String> entry : (Set<Map.Entry<String, String>>)map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        // 遍历查询某值
        String targetValue = "数学";

        System.out.println("all key of value = " + targetValue + " :");
        for (Map.Entry<String, String> entry : (Set<Map.Entry<String, String>>)map.entrySet()) {
            if (entry.getValue().equals(targetValue))
                System.out.println(entry.getKey());
        }
    }
}
