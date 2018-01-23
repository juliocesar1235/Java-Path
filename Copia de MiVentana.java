
import javax.swing.JFrame;

public class MiVentana extends JFrame {
	public MiVentana(){
		this.setSize(200,200);
		this.setLocation(200,200);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}//FIN de constructor
	public void showIt(){
		this.setVisible(true);
		
	}//Fin de metodo  showIt
	public void showIt(String title){
		this.setTitle(title);
		this.setVisible(true);
		
	}//Fin de metodo showIt(2)
	public void showIt(String title, int x, int y){
		this.setTitle(title);
		this.setLocation(x,y);
		this.setVisible(true);
		
	}//Fin de metodo showIt(3)
	public void hideIt(){
		this.setVisible(false);
	}//Fin de metodo hideIt
	
	
	
}// fin de clase mi ventana
