/**   
 * @Title: LocalTimeDemo.java 
 * @Package com.startdima.test.chapter2 
 * @Description: LocalTime类库使用
 * @author dengjiajun deng-jiajun@outlook.com 
 * @date 2019年7月11日 下午3:27:31 
 * @version V1.0   
 */ 
package com.startdima.test.chapter2;

import java.time.LocalTime;

/** 
 * @ClassName: LocalTimeDemo 
 * @Description: LocalTime类使用
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月11日 下午3:27:31 
 *  
 */
public class LocalTimeDemo {

	/** 
	 * @Title: main 
	 * @Description: LocalTime类使用入口函数
	 * @param args
	 * @return void
	 * @throws 
	 */
	public static void main(String[] args) {
		
		/* 获取当前时间 */
		LocalTime time =LocalTime.now();
		System.out.println("LocalTime.now()： "+time);
		
		/* 时间计算 */
		LocalTime newTime = time.plusHours(2);
		System.out.println("time.plusHours(2): "+newTime);
	}

}
