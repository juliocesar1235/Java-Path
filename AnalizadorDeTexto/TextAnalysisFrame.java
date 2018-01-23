import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
public class TextAnalysisFrame extends MiVentana{
  //Constructor
  public TextAnalysisFrame(){
    this.setSize(300,150);
    TextAnalysisPanel taPanel = new TextAnalysisPanel();
    this.getContentPane().add(taPanel, BorderLayout.CENTER);
    JButton analyseButton = new JButton("Analyse");
    analyseButton.setBackground(Color.blue);
    analyseButton.setForeground(Color.yellow);
    this.getContentPane().add(analyseButton, BorderLayout.SOUTH);
    TextAnalysisListener taList = new TextAnalysisListener(taPanel);
    analyseButton.addActionListener(taList);
  }
}//Fin de la clase
