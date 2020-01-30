/**   
 * @Title: LocalDateDemo.java 
 * @Package com.startdima.test.chapter2 
 * @Description: LocalDate类库使用
 * @author dengjiajun deng-jiajun@outlook.com 
 * @date 2019年7月11日 下午2:27:31 
 * @version V1.0   
 */
package com.startdima.test.chapter2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName: LocalDateDemo
 * @Description: LocalDate类使用
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月11日 下午2:27:31
 * 
 */
public class LocalDateDemo {

	/**
	 * @Title: main 
	 * @Description: LocalDate类使用入口主函数 
	 * @param args 
	 * @return void 
	 * @throws
	 */
	public static void main(String[] args) {

		/* 获取当前日期 */
		LocalDate date = LocalDate.now();
		System.out.println("LocalDate.now(): " + date);

		/* 构造指定日期 */
		LocalDate date2 = LocalDate.of(2019, 1, 1);
		System.out.println("LocalDate.of(2019, 1, 1)： " + date);

		/* 日期信息提取 */
		LocalDate date3 = LocalDate.now();
		System.out.println("英文月份：date3.getMonth():" + date3.getMonth());
		System.out.printf("年=%d 月=%d 日=%d\n", date3.getYear(), date3.getMonthValue(), date.getDayOfMonth());

		/* 日期比较 */
		System.out.println(date + "和" + date2 + "相等：" + date.equals(date2));
		System.out.println(date + " is after " + date2 + ": " + date.isAfter(date2));
		System.out.println(LocalDate.of(1999, 9, 1) + " is before " + LocalDate.of(1999, 9, 2) + ": "
				+ LocalDate.of(1999, 9, 1).isBefore(LocalDate.of(1999, 9, 2)));

		/* 日期计算 */
		LocalDate date4 = date.plusDays(1);
		System.out.println("date.plusDays(1): " + date4);

		/*
		 * 日期解析 
		 * BASIC_ISO_DATE : YYYYMMDD 
		 *       ISO_DATE : YYYY-MM-DD
		 */
		String dateText = "20190910";
		LocalDate date5 = LocalDate.parse(dateText, DateTimeFormatter.BASIC_ISO_DATE);
		
		System.out.println("解析后：" + date5);

		/* 日期格式化 */
		dateText = date5.format(DateTimeFormatter.ISO_DATE);
		System.out.println("格式化后：" + dateText);
		

	}

}
