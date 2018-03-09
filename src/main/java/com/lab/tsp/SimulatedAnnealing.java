package com.lab.tsp;

public class SimulatedAnnealing {

	private SingleTour best;

	public void simulate() {

		double temperature = 10000;
		double coolingRate = 0.003;

		SingleTour currentSolution = new SingleTour();
		currentSolution.generateIndividual();

		best = new SingleTour(currentSolution.getTour());

		System.out.println("Current Solution :" + currentSolution.getDistance());

		while (temperature > 1) {

			SingleTour newSolution = new SingleTour(currentSolution.getTour());

			int cityIndex1 = (int) (newSolution.getTourSize() * Math.random());
			City city1 = newSolution.getCity(cityIndex1);

			int cityIndex2 = (int) (newSolution.getTourSize() * Math.random());
			City city2 = newSolution.getCity(cityIndex2);

			newSolution.setCity(cityIndex1, city2);
			newSolution.setCity(cityIndex2, city1);

			double currentEnergy = currentSolution.getDistance();
			double neibourEnergy = newSolution.getDistance();

			if (acceptanceProbability(currentEnergy, neibourEnergy, temperature) > Math.random()) {
				currentSolution = new SingleTour(newSolution.getTour());
			}

			if (currentSolution.getDistance() < best.getDistance()) {
				best = new SingleTour(currentSolution.getTour());
			}

			temperature *= (1 - coolingRate);

		}

	}

	private double acceptanceProbability(double currentEnergy, double neibourEnergy, double temperature) {

		if (neibourEnergy < currentEnergy)
			return 1;

		return Math.exp((currentEnergy - neibourEnergy) / temperature);
	}

	public SingleTour getBest() {
		return best;
	}

	
}
