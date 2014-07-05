package com.triangle;

/**
 * 
 * @author zhuyunjie
 * @date 2014Äê6ÔÂ13ÈÕ
 * a edge and a angle of a triangle
 *
 */
public class EdgeAndAngle {

	
	/**
	 * a edge of a triangle
	 */
	private double edge; 
	
	/**
	 * a angle corresponding to the edge
	 */
	private double angle; 
	
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
