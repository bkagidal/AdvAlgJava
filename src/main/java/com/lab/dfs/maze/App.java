package com.lab.dfs.maze;

public class App {
	
	public static void main(String[] args) {
		
		FileReader reader = new FileReader("map.txt", 5, 5);
		
		reader.parseFile();
		
	//	MazeSolver maze = new MazeSolver(reader.getData(),reader.getStartRowOrdinate(), reader.getStartColOrdinate());
	//	maze.findWayOut();
	
		MazeSolver1 maze = new MazeSolver1(reader.getData(),reader.getStartRowOrdinate(), reader.getStartColOrdinate());
		maze.findWay();
	}

}
