package com.triangle;

public class TriangleEntity {

	// 三角形中对应的角a，角b，角c
	private EdgeAndAngle p_a, p_b, p_c;

	/**
	 * 初始化完成之后， 如果是两边夹一角,即知道角a的边，角b的边，和角c，则设置为1
	 * 
	 */
	private int type;

	public TriangleEntity(EdgeAndAngle p_a, EdgeAndAngle p_b, EdgeAndAngle p_c) {
		this.p_a = p_a;
		this.p_b = p_b;
		this.p_c = p_c;
		decideType();

	}

	public void processTriangle() {
		switch (this.type) {
		case 1:
			calculateByTypeOne();
			break;
		default:
			System.out.println("信息不充足");
		}
	}

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
		triangle.calculateByTypeOne();
		System.out.println(triangle);
	}

	/**
	 * 
	 * @Description 实现余弦定理，知道两边以及其夹角 得到三角形所有的信息
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
