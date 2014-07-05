package com.test;

import com.triangle.EdgeAndAngle;
import com.triangle.TriangleEntity;

public class test {

	public static void main(String[] args) {
		EdgeAndAngle a = new EdgeAndAngle(10, 0);
		EdgeAndAngle b = new EdgeAndAngle(10, 0);
		EdgeAndAngle c = new EdgeAndAngle(0, 90);

		TriangleEntity triangle = new TriangleEntity(a, b, c);
		triangle.processTriangle();
		System.out.println(triangle);
		
	}
}
