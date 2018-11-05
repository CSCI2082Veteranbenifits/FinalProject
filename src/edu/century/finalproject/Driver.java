package edu.century.finalproject;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Driver {


public static void main(String[] args) {
		
		ArrayList<String[]> arr2D = new ArrayList<>();
		BTNode veteran;
		try {
			
			Scanner read = new Scanner(new File("veteran.csv"));
			final int size = 4;
			while(read.hasNextLine()) {
			String[] line = new String[size];
			String lineCSV = read.nextLine();
			String [] csvL =lineCSV.split(",");
			for (int i=0; i < csvL.length; i++) {
				line[i] = csvL[i];
			}
		
			arr2D.add(line);	
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		veteran = new BTNode(arr2D.get(0)[0], arr2D.get(0)[1]);
		//System.out.println(arr2D.get(0)[0]);
		for(String[] rows : arr2D) {
			if(rows[2]!=null && rows[3] != null) {
			String leftData = "";
			String rightData = "";
			for(String[] rowf : arr2D) {
				if(rows[2].equals(rowf[0])){
					leftData = rowf[1];
				}
				if(rows[3].equals(rowf[0])){
					rightData = rowf[1];
				}
			}
			
			veteran.insert(rows[0], rows[2], leftData, rows[3], rightData);
			}
		}
		//veteran.printAll();
		//veteran.printYN();
		QuiestionGUI frame = new QuiestionGUI(veteran);
	}



	
}
