package com.lab.tsp;

public class City {

	private int x;
	private int y;
	private String cityName;
	
	public City() {
		
		this.x = (int) (Math.random()*100);
		this.y = (int) (Math.random() * 100);
	}

	public City(String cityName, int x, int y) {
		this.cityName = cityName;
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getDistanceTo(City city) {

		int xDistance = this.x - city.x;
		int yDistance = this.y - city.y;

		double distance = Math.sqrt((xDistance * xDistance) + (yDistance * yDistance));

		return distance;
	}

	@Override
	public String toString() {
		return this.x +"-"+ this.y;
	}

}
