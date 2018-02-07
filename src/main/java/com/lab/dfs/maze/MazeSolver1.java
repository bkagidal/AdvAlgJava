package com.lab.dfs.maze;

public class MazeSolver1 {
	
	private int[][] map;
	private boolean[][] visited;
	private int startRow;
	private int startCol;
	
	public MazeSolver1( int[][] map,int startRow,int startCol) {
		
		this.map = map;
		this.startRow = startRow;
		this.startCol = startCol;
		visited = new boolean[map.length][map.length];
	}
	
	
	public void findWay(){
		
		try {
			dfs(startRow,startCol+1);
			System.out.println("There is no route found...");
		} catch (Exception e) {
			System.out.println("Route found ......");
			//e.printStackTrace();
		}
	}


	private void dfs(int startRow2, int startCol2) {
		
		if(map[startRow2][startCol2] == 0)
		System.out.println("Visiting Row :("+startRow2+" ,"+startCol2+")");
		
		//visited[startRow2][startCol2] = true;
		
		if(map[startRow2][startCol2] == 3)
			throw new RuntimeException();
		
		int endOfMap = this.map.length-1;
		
		
		if(visited[startRow2][startCol2])
			return;
		else if(map[startRow2][startCol2] == 1)
			return;
		else if(startRow2 <0 || startRow2 >= endOfMap)
			return;
		else if(startCol2 < 0 || startCol2 >= endOfMap)
			return;
		else{
			visited[startRow2][startCol2] = true;
			
			dfs(startRow2+1,startCol2);
			dfs(startRow2,startCol2+1);
			dfs(startRow2-1, startCol2);
			dfs(startRow2, startCol2-1);
		}
		
		
	}

}
