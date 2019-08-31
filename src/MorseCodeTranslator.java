import java.util.HashMap;

public class MorseCodeTranslator {
	
	private HashMap<Character, String> charToMorse;
	private HashMap<String, Character> morseToChar;
	
	MorseCodeTranslator(){
		this.charToMorse = new HashMap<>();
		this.morseToChar = new HashMap<>();
		
  	charToMorse.put('A', ".-");
  	charToMorse.put('B', "-...");
  	charToMorse.put('C', "-.-.");
  	charToMorse.put('D', "-..");
  	charToMorse.put('E' ,".");
  	charToMorse.put('F' ,"..-.");
  	charToMorse.put('G' ,"--.");
  	charToMorse.put('H' ,"....");
  	charToMorse.put('I' ,"..");
  	charToMorse.put('J' ,".---");
  	charToMorse.put('K' ,"-.-");
  	charToMorse.put('L' ,".-..");
  	charToMorse.put('M' ,"--");
  	charToMorse.put('N' ,"-.");
  	charToMorse.put('O' ,"---");
  	charToMorse.put('P' ,".--.");
  	charToMorse.put('Q' ,"--.-");
  	charToMorse.put('R' ,".-.");
  	charToMorse.put('S' ,"...");
  	charToMorse.put('T' ,"-");
  	charToMorse.put('U' ,"..-");
  	charToMorse.put('V' ,"...-");
  	charToMorse.put('W' ,".--");
  	charToMorse.put('X' ,"-..-");
  	charToMorse.put('Y' ,"-.--");
  	charToMorse.put('Z' ,"--..");
  	charToMorse.put('0' ,"-----");
  	charToMorse.put('1' ,".----");
  	charToMorse.put('2' ,"..---");
  	charToMorse.put('3' ,"...--");
  	charToMorse.put('4' ,"....-");
  	charToMorse.put('5' ,".....");
  	charToMorse.put('6' ,"-....");
  	charToMorse.put('7', "--...");
  	charToMorse.put('8' ,"---..");
  	charToMorse.put('9' ,"----.");
  	
  	
  	for(char i = 'A'; i <= 'Z'; i ++) {
  		this.morseToChar.put( this.charToMorse.get( i ), i );
  	}
  	for(char i = '0'; i <= '9'; i++) {
  		this.morseToChar.put( charToMorse.get(i) , i);
  	}
  	
	}

	public String translateTextToMorse(String s) {
		s = s.toUpperCase();
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			if( c == ' ' ) {
				sb.append(" ");
			} 
			else {
				sb.append( (this.charToMorse.get(c) != null ? this.charToMorse.get(c) : c) + " " );
			}
		}
		
		return sb.toString();
	}
	
	public String translateMorseToText(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		for(String morseCharWord : s.split("  ")) {
			for(String morseChar : morseCharWord.split(" ")) {
				sb.append( this.morseToChar.get(morseChar) != null ? this.morseToChar.get(morseChar) : morseChar );
			}
			sb.append(" ");
		}
		
		return sb.toString();
	}
	
}
