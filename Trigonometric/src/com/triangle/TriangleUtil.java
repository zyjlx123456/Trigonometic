package com.triangle;

import java.text.DecimalFormat;

public class TriangleUtil {

	/**
	 * 
	 * @Description ��double�ľ���ȡΪ2�����������롣
	 * @param double����
	 * @return double����
	 * 
	 * @example .495Ϊ0.50,0.494Ϊ0.49��
	 */
	public static double getTwoDecimal(double a) {
		DecimalFormat df = new DecimalFormat("#.00");
		return Double.valueOf(df.format(a));
	}

	/**
	 * 
	 * @Description ����cos����������ǣ���������Ϊa,b,c�ı߶�֪���������c��Ӧ�Ľ�
	 * @param a
	 * @param b
	 * @param c
	 * @return ���ؽ�c�ĽǶ�
	 */
	public static double calculateAngleByCos(EdgeAndAngle a, EdgeAndAngle b,
			EdgeAndAngle c) {
		double cosc = (Math.pow(a.getEdge(), 2) + Math.pow(b.getEdge(), 2) - Math
				.pow(c.getEdge(), 2)) / 2 / a.getEdge() / b.getEdge();
		// ��ȡa��ƽ������b��ƽ������c��ƽ������2ab
		double c_angle = TriangleUtil.getTwoDecimal(Math.toDegrees(Math
				.acos(cosc)));
		return c_angle;
	}

	/**
	 * 
	 * @Description ����cos��������������ߣ���������Ϊa��b��������֪����c�еĽǱ���֪��
	 * @param a
	 * @param b
	 * @param c
	 * @return c�еı�
	 */
	public static double calcluateEdgeByCos(EdgeAndAngle a, EdgeAndAngle b,
			EdgeAndAngle c) {
		double abcos_c = 2
				* a.getEdge()
				* b.getEdge()
				* TriangleUtil.getTwoDecimal(Math.cos(Math.toRadians(c
						.getAngle())));
		// ���Ҷ����е�2*a*b*cos(c)
		double a_2_b_2 = Math.pow(a.getEdge(), 2) + Math.pow(b.getEdge(), 2);
		// ���Ҷ����е�a��ƽ������b��ƽ��
		double c_edge = Math.sqrt(a_2_b_2 - abcos_c);
		return c_edge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = .495;
		System.out.println(TriangleUtil.getTwoDecimal(a));
	}
}
