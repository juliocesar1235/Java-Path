public class TextAnalysisModel{
  private int totalNumberOfEs;
  private int currentNumberOfEs;
  private int totalNumberOfTexts;
  private String currentText;


  //Constructor
  public TextAnalysisModel(){
    totalNumberOfEs = 0;
    totalNumberOfTexts = 0;
    currentText = "";

  }

  //Metodos
  public void analyse(String str){
    currentText = str.toUpperCase();
    currentNumberOfEs = 0;
    for (int i = 0;i<currentText.length();i++ ) {
      if (currentText.charAt(i)== 'E') {
        currentNumberOfEs++;
      }//Fin de if
    }//fin de for
    totalNumberOfEs += currentNumberOfEs;
    totalNumberOfTexts++;

  }//Fin de metodo analyse

  public int getCurrentNumberOfEs(){
    return(currentNumberOfEs);
  }//Fin de metodo get currentNumberOfEs

  public String getCurrentText(){
    return(currentText);
  }//Fin de metodo getCurrentText

  public int getTotalNumberOfEs(){
    return(totalNumberOfEs);
  }//Fin de metodo getTotalNumberOfEs

  public int getTotalNumberOfText(){
    return(totalNumberOfTexts);
  }//Fin de metodo getTotalNumberOfText

}//Fin de la clase
