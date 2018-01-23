import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class StatusPanel extends JPanel{
  private JLabel posText  = new JLabel("Position");
  private JLabel XCoord   = new JLabel("0", JLabel.RIGHT);
  private JLabel YCoord   = new JLabel("0", JLabel.RIGHT);
  private JLabel countText  = new JLabel("no. of clicks:");
  private JLabel counts   = new JLabel("0",JLabel.RIGHT);
  private JLabel dummy1   = new JLabel();
  private JLabel inOutText  = new JLabel("mouse is in com.:");
  private JLabel inOut    = new JLabel("no", JLabel.RIGHT);
  private JLabel dummy2   = new JLabel();
  private int clickCount  = 0;

  //Constructor
  public StatusPanel(){
    this.setLayout(new GridLayout(3,3));
    this.add(posText);
    this.add(XCoord);
    this.add(YCoord);
    this.add(countText);
    this.add(counts);
    this.add(dummy1);
    this.add(inOutText);
    this.add(inOut);
    this.add(dummy2);
  }
  public void setCoordinates(int x, int y){
    XCoord.setText(Integer.toString(x));
    YCoord.setText(Integer.toString(y));
  }
  public void setInOut(String str){
    inOut.setText(str);
  }
  public void incrementClickCount(){
    clickCount++;
    counts.setText(Integer.toString(clickCount));
  }

}//Fin de la clase
