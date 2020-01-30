/** 设计一个能细分为矩形、三角形、圆形和椭圆形的“图形”类。
 * 使用继承将这些图形分类，找出能作为基类部分的共同特征(如校准点)和方法(如画法、初始化),
 * 并看看这些图形是否能进一步划分为子类。本题只考虑实现思想，不考虑具体实现的细节，实现方式可自由发挥。
 *
 * 特征：
 * 校准点Calibration point：矩形可为左上角的点，圆形为圆心。 但三角形、椭圆形一个校准点不够，故校准点应有多个
 * 空心/实心（填充）solid；填充颜色color；
 * 描边stroke/不描边；描边粗细 blod；描边颜色color；
 * 
 * 方法：
 * 初始化方法；
 * 画法(正方形确定左上角的校准点和长宽；三角形确定3个点的坐标；圆形确定圆心即半径；椭圆确定两个定点即定长)；
 */
package com.startdima.test.chapter1.graph;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

/**
 * 
 * @ClassName: AbstractGraph
 * @Description: 图形基类
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月4日 下午2:33:12
 *
 */

public abstract class AbstractGraph {
	private int NumberOfCalibrationPoint;
	ArrayList<Point> CalibrationPoints;

	public AbstractGraph(int numberOfCalibrationPoint, ArrayList<Point> calibrationPoints) {
		NumberOfCalibrationPoint = numberOfCalibrationPoint;
		CalibrationPoints = new ArrayList<>(calibrationPoints);
		System.out.println("Construct "+this.getClass().getSimpleName() +":\n");
	}
	
	/**
	 * 
	 * @Title: Draw 
	 * @Description: 画图形
	 * @param isFilled 是否填充
	 * @param fileColor 填充颜色
	 * @param isStroke 是否描边
	 * @param strockBlod 描边粗细
	 * @param strokeColor 描边颜色
	 * @return voids
	 * @throws
	 */
	public void Draw(boolean isFilled,Color fillColor,boolean isStroke,int strockBlod, Color strokeColor)
	{
		System.out.println("Draw "+this.getClass().getSimpleName() +":\n填充:"+isFilled+",颜色:"
				+fillColor+",描边:"+isStroke+",粗细:"+strockBlod+",描边颜色:"+strokeColor+"\n");
	}

}
