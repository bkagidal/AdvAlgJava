package com.lab.dfs.maze;

import java.io.File;

public class FileReader {

	private int[][] data;
	private int startRowOrdinate;
	private int startColOrdinate;
	private int noOfRows;
	private int noofCols;
	private String fileName;
	
	public FileReader(String fileName,int noOfRows,int noOfCols) {
		this.fileName = fileName;
		this.noOfRows = noOfRows;
		this.noofCols = noOfCols;
		data = new int[noOfRows][noOfCols];
	}
	
	public void parseFile(){
		
		File file = new File(fileName);
		
	}
}
