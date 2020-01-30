package com.startdima.test.chapter1.graph;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @ClassName: Client
 * @Description: 测试用客户端
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月4日 下午4:14:56
 *
 */
public class Client {
	public static void main(String[] args) {

		Circle circle = new Circle(new Point(2, 1), 1);
		circle.Draw(true, Color.black, true, 1, Color.black);

		Oval oval = new Oval(new ArrayList<>(Arrays.asList(new Point(1, 1), new Point(1, 2))), 3);
		oval.Draw(true, Color.blue, true, 1, Color.blue);

		Rectangle rectangle = new Rectangle(new Point(1, 1), 1, 1);
		rectangle.Draw(true, Color.red, true, 1, Color.red);

		Triangle triangle = new Triangle(
				new ArrayList<>(Arrays.asList(new Point(1, 1), new Point(1, 2), new Point(2, 2))));
		rectangle.Draw(true, Color.yellow, true, 1, Color.yellow);
	}
}
