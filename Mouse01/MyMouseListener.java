import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener{
  private StatusPanel statusPane;

  //Constructor
  public MyMouseListener(StatusPanel s){
    statusPane = s;
  }
  public void mouseEntered(MouseEvent e){
    statusPane.setInOut("yes");
  }
  public void mouseExited(MouseEvent e){
    statusPane.setInOut("no");
  }
  public void mouseClicked(MouseEvent e){
    statusPane.incrementClickCount();
  }
  public void mousePressed(MouseEvent e){

  }
  public void mouseReleased(MouseEvent e){

  }
}//Fin de la clase listener
