package com.startdima.test.chapter1.graph;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @ClassName: Rectangle
 * @Description: 矩形
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月4日 下午3:44:56
 *
 */
public class Rectangle extends AbstractGraph {

	int height;
	int width;

	/**
	 * @param point
	 *            左上角校准点
	 * @param height
	 *            高度
	 * @param width
	 *            宽度
	 */
	public Rectangle(Point point, int height, int width) {
		super(1, new ArrayList<>(Arrays.asList(point)));
		this.height = height;
		this.width = width;
		System.out.println("左上角点(" + CalibrationPoints.get(0) + ",高度" + height + ",宽度" + width);
	}
}
