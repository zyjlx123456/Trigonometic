package com.triangle;

/**
 * 
 * @author zhuyunjie
 * @date 2014��6��13��
 * ������ʵ�����εıߺͶԽ�
 *
 */
public class EdgeAndAngle {
	private double edge; //�������еı�
	private double angle; //������������ı߶�Ӧ�Ľ�
	
	public EdgeAndAngle(double edge,double angle) {
		this.edge = edge;
		this.angle = angle;
	}
	
	public double getEdge() {
		return edge;
	}
	
	public void setEdge(double edge) {
		this.edge = edge;
	}
	
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	public String toString(){
		return "edge = "+ edge+" angle = "+angle;
	}
}
