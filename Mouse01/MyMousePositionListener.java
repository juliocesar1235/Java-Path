import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class MyMousePositionListener implements MouseMotionListener{
  private StatusPanel statusPane;

  //Constructor
  public MyMousePositionListener(StatusPanel s){
    statusPane = s;
  }
  public void mouseMoved(MouseEvent evt){
    statusPane.setCoordinates(evt.getX(), evt.getY());
  }
  public void mouseDragged(MouseEvent evt){

  }

}//Fin de la clase
