package com.triangle;

import java.text.DecimalFormat;

public class TriangleUtil {

	/**
	 * 
	 * @Description 将double的精度取为2，即四舍五入。
	 * @param double类型
	 * @return double类型
	 * 
	 * @example .495为0.50,0.494为0.49，
	 */
	public static double getTwoDecimal(double a) {
		DecimalFormat df = new DecimalFormat("#.00");
		return Double.valueOf(df.format(a));
	}

	/**
	 * 
	 * @Description 采用cos函数来计算角，限制条件为a,b,c的边都知道，计算边c对应的角
	 * @param a
	 * @param b
	 * @param c
	 * @return 返回角c的角度
	 */
	public static double calculateAngleByCos(EdgeAndAngle a, EdgeAndAngle b,
			EdgeAndAngle c) {
		double cosc = (Math.pow(a.getEdge(), 2) + Math.pow(b.getEdge(), 2) - Math
				.pow(c.getEdge(), 2)) / 2 / a.getEdge() / b.getEdge();
		// 获取a的平方加上b的平方加上c的平方除以2ab
		double c_angle = TriangleUtil.getTwoDecimal(Math.toDegrees(Math
				.acos(cosc)));
		return c_angle;
	}

	/**
	 * 
	 * @Description 采用cos函数来计算第三边，限制条件为a和b的条必须知道，c中的角必须知道
	 * @param a
	 * @param b
	 * @param c
	 * @return c中的边
	 */
	public static double calcluateEdgeByCos(EdgeAndAngle a, EdgeAndAngle b,
			EdgeAndAngle c) {
		double abcos_c = 2
				* a.getEdge()
				* b.getEdge()
				* TriangleUtil.getTwoDecimal(Math.cos(Math.toRadians(c
						.getAngle())));
		// 余弦定理中的2*a*b*cos(c)
		double a_2_b_2 = Math.pow(a.getEdge(), 2) + Math.pow(b.getEdge(), 2);
		// 余弦定理中的a的平方加上b的平方
		double c_edge = Math.sqrt(a_2_b_2 - abcos_c);
		return c_edge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = .495;
		System.out.println(TriangleUtil.getTwoDecimal(a));
	}
}
