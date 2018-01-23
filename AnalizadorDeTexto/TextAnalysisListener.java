import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAnalysisListener implements ActionListener{
  private TextAnalysisPanel taPanel;

  //Constructor
  public TextAnalysisListener(TextAnalysisPanel t){
    taPanel = t;

  }
  public void actionPerformed(ActionEvent evt){
    taPanel.startAnalysisAndDisplayResult();
  }
}//Fin de clase
