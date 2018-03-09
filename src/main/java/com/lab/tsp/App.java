package com.lab.tsp;

public class App {

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			City city = new City();
			Repository.addCity(city);
		}
		
		SimulatedAnnealing annealing = new SimulatedAnnealing();
		annealing.simulate();
		
		System.out.println("Final Approximated Solution distance :"+ annealing.getBest().getDistance());
		
		System.out.println(annealing.getBest());
		

	}

}
