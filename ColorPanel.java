import java.awt.*;
import javax.swing.JPanel;

public class ColorPanel extends JPanel {

	public ColorPanel(Color col){
		this.setBackground(col);
	}//Fin de constructor 1
	
	public ColorPanel(Color col, int width, int heigth){
		this.setPreferredSize(new Dimension(width,heigth));
		this.setBackground(col);
	}//fin de constructor 2
	
}//Fin de clase ColorPanel
