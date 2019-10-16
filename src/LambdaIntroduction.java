import java.util.Arrays;

public class LambdaIntroduction {
 
  public static void main (String[] args){
	  
	  String inputString = args[0];
	  if(inputString != null && inputString.equals("")) {
		  inputString = inputString.trim();
		  char[] stringToCharArray = inputString.toCharArray();
			 
		  for (char output : stringToCharArray) {
				System.out.println(output);
			}
		  
	  }
	  
  }

}
