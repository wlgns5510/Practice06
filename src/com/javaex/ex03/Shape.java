package com.javaex.ex03;

public class Shape {
	
	protected String fillColor; //private --> protected로 바꿈
	protected String lineColor;
	
	public Shape() {} //기본생성자를 만듬
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	
}

