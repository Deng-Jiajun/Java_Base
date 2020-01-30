package com.startdima.test.chapter1.graph;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @ClassName: Circle
 * @Description: 圆形
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月4日 下午3:47:09
 *
 */
public class Circle extends AbstractGraph {
	int radius;

	/**
	 * 
	 * @param point
	 *            圆心
	 * @param r
	 *            半径
	 */
	public Circle(Point point, int r) {
		super(1, new ArrayList<>(Arrays.asList(point)));
		this.radius = r;
		System.out.println("圆心(" + CalibrationPoints.get(0) + ",半径" + r);
	}

}
