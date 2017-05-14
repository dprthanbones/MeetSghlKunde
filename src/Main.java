import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private final Visual visual;
	private int algoritme;
	private Algorithm algo;
	private ArrayList<Cirkel> cirkels = new ArrayList<Cirkel>();
	private ArrayList<Punt> snijpunten;
	
	public static void main(String[] args){
		new Main();
	}
	
	public Main(){
		this.visual = new Visual(this);
		visual.setVisible(true);
	}
	
	public void setAlg(int algorithm1){
		this.algoritme = algorithm1;
	}
	
	public int getAlg(){
		return this.algoritme;
	}
	
	private void setCirkels(ArrayList<Cirkel> cirkels) {
		this.cirkels = cirkels;
	}

	public ArrayList<Cirkel> getCirkels() {
		return cirkels;
	}
	
	public void addCirkel(Cirkel cirkel){
		this.cirkels.add(cirkel);
	}

	public void run(){
		switch (getAlg()){
		case 1:
			setAlgorithm(new Algorithm1(getCirkels(), this));
		case 2:
			setAlgorithm(new Algorithm2(getCirkels(), this));
		case 3:
			setAlgorithm(new Algorithm3(getCirkels(), this));
		}
	}
	
	public void setAlgorithm(Algorithm algorithm1){
		this.algo = algorithm1;
	}
	
	public int getAlgoritme(){
		return this.algoritme;
	}
	
	public void addSnijpunten(Punt snijpunten){
		getSnijpunten().add(snijpunten);
	}
	
	public ArrayList<Punt> getSnijpunten(){
		return this.snijpunten;
	}
	
	/*
	 * reads Input.txt file and casts it to circles
	 */
	public ArrayList<Cirkel> readInput(File file){
		ArrayList<Cirkel> cirkels = new ArrayList<Cirkel>();
		
		Scanner scan;
		try {
			scan = new Scanner(file);
			setAlg(Integer.parseInt(scan.nextLine()));
			int amountOfCirkels = Integer.parseInt(scan.nextLine());
			for(int i = 0; i < amountOfCirkels; i++){
				Cirkel cirkel = castToCirkel(scan.nextLine());
				cirkels.add(cirkel);
				return(cirkels);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return cirkels;
	}
	
	public Cirkel castToCirkel(String cirkel){
		String[] parts = cirkel.split(" ");
		Punt middelpunt = new Punt(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]));
		Cirkel castedCirkel = new Cirkel(middelpunt, Double.parseDouble(parts[2]));
		return castedCirkel;
	}
	
}
