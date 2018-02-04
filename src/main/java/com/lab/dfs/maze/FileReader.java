package com.lab.dfs.maze;

import java.io.File;
import java.util.Scanner;

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
		int ele;
		try{
			
			Scanner scan = new Scanner(file); 
			for(int i=0;i<noOfRows;i++){
				for(int j=0;j<noofCols;j++){
					ele = scan.nextInt();
					if(ele == 2){
						startRowOrdinate= i;
						startColOrdinate = j;
					}
					data[i][j] = ele;
				}
			}
			
			scan.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public int[][] getData() {
		return data;
	}

	public void setData(int[][] data) {
		this.data = data;
	}

	public int getStartRowOrdinate() {
		return startRowOrdinate;
	}

	public void setStartRowOrdinate(int startRowOrdinate) {
		this.startRowOrdinate = startRowOrdinate;
	}

	public int getStartColOrdinate() {
		return startColOrdinate;
	}

	public void setStartColOrdinate(int startColOrdinate) {
		this.startColOrdinate = startColOrdinate;
	}

	public int getNoOfRows() {
		return noOfRows;
	}

	public void setNoOfRows(int noOfRows) {
		this.noOfRows = noOfRows;
	}

	public int getNoofCols() {
		return noofCols;
	}

	public void setNoofCols(int noofCols) {
		this.noofCols = noofCols;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
