
public abstract class Algorithm {

	private Input Main;
	private long time;

	public Algorithm(Input main){
		setMain(main);
	}
	
	public void setMain(Input main){
		this.Main = main;
	}
	
	public Input getMain(){
		return this.Main;
	}
	
	public void addSnijnpunt(Cirkel cirkel1, Cirkel cirkel2) {
		Punt[] snijpunten = cirkel1.snijpuntAndereCirkel(cirkel2);
		if (snijpunten.length == 1){
			getMain().addSnijpunten(snijpunten[0]);
		}if(snijpunten.length == 2){
			getMain().addSnijpunten(snijpunten[0]);
			getMain().addSnijpunten(snijpunten[1]);
		}
	}
	
	public void setTime(long time){
		this.time = time;
	}
	
	public long getTime(){
		return this.time;
	}
	
	public void information(){
		System.out.println("type algoritme: " + getMain().getAlg());
		System.out.println("uitvoeringstijd: " + getTime());
		System.out.println("aantal snijpunten" + getMain().getSnijpunten().size());
	}
}
