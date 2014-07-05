package com.triangle;

public class TriangleEntity {

	/**
	 * three edges and three angles of a triangle
	 */
	private EdgeAndAngle p_a, p_b, p_c;

	/**
	 * type of a triangle 
	 * when two edge and their included angle known, the type is set 1;
	 * 
	 */
	private int type;

	public TriangleEntity(EdgeAndAngle p_a, EdgeAndAngle p_b, EdgeAndAngle p_c) {
		this.p_a = p_a;
		this.p_b = p_b;
		this.p_c = p_c;
		decideType();

	}

	/**
	 * 
	 * @description calculate the information of a triangle
	 *
	 */
	public void processTriangle() {
		switch (this.type) {
		case 1:
			calculateByTypeOne();
			break;
		default:
			System.out.println("ÐÅÏ¢²»³ä×ã");
		}
	}

	
	/**
	 * 
	 * @description calculate the information of a triangle when the type is 1;
	 *
	 */
	private void calculateByTypeOne() {
		double p_c_edge = TriangleUtil.calcluateEdgeByCos(p_a, p_b, p_c);
		this.p_c.setEdge(p_c_edge);
		double p_a_angle = TriangleUtil.calculateAngleByCos(p_b, p_c, p_a);
		this.p_a.setAngle(p_a_angle);
		double p_b_angle = TriangleUtil.calculateAngleByCos(p_a, p_c, p_b);
		this.p_b.setAngle(p_b_angle);
	}

	public static void main(String[] args) {
		EdgeAndAngle a = new EdgeAndAngle(10, 0);
		EdgeAndAngle b = new EdgeAndAngle(10, 0);
		EdgeAndAngle c = new EdgeAndAngle(0, 90);

		TriangleEntity triangle = new TriangleEntity(a, b, c);
		triangle.processTriangle();
		System.out.println(triangle);
	}


	/**
	 * 
	 * @description decide the type of a triangle
	 *
	 */
	private void decideType() {
		// TODO Auto-generated method stub
		if (p_a.getEdge() != 0 && p_b.getEdge() != 0 && p_c.getAngle() != 0) {
			this.type = 1;
		}

	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("a : " + p_a + " \n");
		buffer.append("b : " + p_b + " \n");
		buffer.append("c : " + p_c + " \n");
		return buffer.toString();
	}
}
