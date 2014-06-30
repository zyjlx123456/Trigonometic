package com.triangle;

/**
 * 
 * @author zhuyunjie
 * @date 2014年6月13日
 *
 */
public class EdgeAndAngle {
	private double edge; //三角形中的边
	private double angle; //三角形中上面的边对应的角
	
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
