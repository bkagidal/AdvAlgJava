package com.lab.tsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleTour {

	List<City> tour;
	double distance;

	public SingleTour() {

		tour = new ArrayList<>();

		for (int i = 0; i < Repository.getNoOfCities(); ++i)
			tour.add(null);
	}

	public SingleTour(List<City> tour) {
		this.tour = tour;
	}

	public List<City> getTour() {
		return this.tour;
	}

	public void setTour(List<City> tour) {
		this.tour = tour;
	}

	public City getCity(int index) {

		return this.tour.get(index);
	}

	public void generateIndividual() {

		for (int i = 0; i < Repository.getNoOfCities(); ++i)
			setCity(i, Repository.getCity(i));

		Collections.shuffle(tour);
	}

	public void setCity(int index, City city) {
		this.tour.set(index, city);
		this.distance = 0;
	}

	public double getDistance() {

		if (this.distance == 0) {

			double tourDistance = 0;

			for (int cityIndex = 0; cityIndex < tour.size(); cityIndex++) {
				City fromCity = getCity(cityIndex);
				City destinationCity;

				if (cityIndex + 1 < tour.size())
					destinationCity = getCity(cityIndex + 1);
				else
					destinationCity = getCity(0);

				tourDistance += fromCity.getDistanceTo(destinationCity);
			}

			this.distance = tourDistance;

		}

		return this.distance;
	}

	@Override
	public String toString() {
		String s = "";

		int size = this.tour.size();
		for (int i = 0; i < size; i++) {
			s += getCity(i) + " - ";
		}
		return s;
	}

}
