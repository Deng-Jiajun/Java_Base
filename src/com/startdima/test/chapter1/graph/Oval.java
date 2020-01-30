package com.startdima.test.chapter1.graph;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

/**
 * 
 * @ClassName: Oval
 * @Description: 椭圆形
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月4日 下午3:48:54
 *
 */
public class Oval extends AbstractGraph {

	int fixedLength;

	/**
	 * 
	 * @param calibrationPoints
	 *            椭圆两个定点
	 * @param length
	 *            定长
	 */
	public Oval(ArrayList<Point> calibrationPoints, int length) {
		super(2, calibrationPoints);
		fixedLength = length;
		System.out.println("第一定点:(" + CalibrationPoints.get(0) + ":第二定点:(" + CalibrationPoints.get(1) + ",定长" + length);
	}

}
