import javax.swing.JFrame;

public class Visual extends JFrame{

	private Main main;

	public Visual(Main main){
		this.main = main;
		setTitle("cirkels");
		setSize(400,400);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}
