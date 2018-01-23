import java.awt.BorderLayout;
public class MouseEventFrame extends MiVentana{
  MouseEventPanel mePanel = new MouseEventPanel();
  StatusPanel stPanel = new StatusPanel();

  //Constructor
  public MouseEventFrame(){
    this.setTitle("Mouse Application");
    this.getContentPane().add(mePanel, BorderLayout.CENTER);
    this.getContentPane().add(stPanel, BorderLayout.SOUTH);
    pack();
    MyMousePositionListener mPosAdpt = new MyMousePositionListener(stPanel);
    mePanel.addMouseMotionListener(mPosAdpt);

    MyMouseListener MAdpt = new MyMouseListener(stPanel);
    mePanel.addMouseListener(MAdpt);
  }
}//Fin de la clase
