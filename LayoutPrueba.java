import java.awt.FlowLayout;
import java.awt.GridLayout;

public class LayoutPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayout flowLY1 = new FlowLayout();
		MiVentanaLayout miVFLY1 = new MiVentanaLayout(flowLY1);
		miVFLY1.showIt("FlowLayout");
		FlowLayout flowLY2 = new FlowLayout(FlowLayout.LEFT, 40,30);
		MiVentanaLayout miVFLY2 = new MiVentanaLayout(flowLY2);
		miVFLY2.showIt("Flow Layout 2",300,60);
		
		GridLayout gridLY1 = new GridLayout(2,4);
		MiVentanaLayout miVGLY1 = new MiVentanaLayout(gridLY1);
		miVGLY1.showIt("Grid Layout", 540, 60);
		

	}

}
