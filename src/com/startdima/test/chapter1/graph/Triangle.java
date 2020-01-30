package com.startdima.test.chapter1.graph;

import java.awt.Point;
import java.util.ArrayList;

/**
 * 
 * @ClassName: Triangle
 * @Description: 三角形
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月4日 下午3:46:18
 *
 */
public class Triangle extends AbstractGraph {

	/**
	 * 
	 * @param calibrationPoints
	 *            三角形3个顶点
	 */
	public Triangle(ArrayList<Point> calibrationPoints) {
		super(3, calibrationPoints);
		System.out.println("第1个点:(" + CalibrationPoints.get(0) + ":第2个点:(" + CalibrationPoints.get(1) + ":第3个点:("
				+ CalibrationPoints.get(2));
	}

}
