
public class mainClass {

	static int x = 10;
	
  public static void main(String[] args) {
  	
  	MorseCodeTranslator mct = new MorseCodeTranslator();
  	
  	String s = mct.translateMorseToText(".... . .-.. .-.. ---  .-- --- .-. -.. !");
  	
  	System.out.print( s );
  	
  }
  
 }
