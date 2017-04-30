package com.myseries.spring;

import java.util.List;

public class Triangle {
	
	private List<Point> points;
	
	

	public List<Point> getPoints() {
		return points;
	}



	public void setPoints(List<Point> points) {
		this.points = points;
	}



	public void draw()
	{
		int i = 1;
		for(Point point:points)
		{
			System.out.println("Point-"+i+":"+point.getX()+","+point.getY());
			i++;
		}
	}

}
