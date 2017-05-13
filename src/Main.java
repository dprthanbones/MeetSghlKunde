import java.util.ArrayList;

public class Main {

	private final Visual Visual;
	private int algoritme;
	private Algorithm algo;
	private ArrayList<Cirkel> cirkels = new ArrayList<Cirkel>();
	private ArrayList<Punt> snijpunten;
	
	public static void main(String[] args){
		new Main();
	}
	
	public Main(){
		Visual = new Visual(this);
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
	
}
