import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Brackets {
	
	public static void main(String[] args) {
		
		  StringBuffer inputStringBuffer = new StringBuffer();
		  
		  if(args.length > 0)
		  {
			  for( int i =0; i < args.length ;i++) {
				  inputStringBuffer.append(args[i]);
			  }
			  
		  }
		
		  String inputString = inputStringBuffer.toString();
		  if(inputString != null && !inputString.equals("")) {
			  inputString = inputString.trim();
			  char[] stringToCharArray = inputString.toCharArray();
			  Stack<String> openBracketsInStack = new Stack<>();
			  ArrayList<String> brackets = new ArrayList<>();
			  StringBuffer strBuff  = new StringBuffer();
	
			  String outPutAsString = "";
			  for (char output : stringToCharArray) {
				  if(output == '(' || output == '{' || output =='[' || 
						  output == ']' || output== '}' || output==')') {
					  outPutAsString = Character.toString(output);
					  brackets.add(outPutAsString);
					  strBuff.append(outPutAsString);
					}
				}
			  Iterator<String> characx = brackets.iterator();
			  boolean trueFlag = true;
			  String currentBracket ="";
			  String poppedOpenBracket = "";
			    while(characx.hasNext()) {
			         Object element = characx.next();
			         if(element != null && !element.toString().equals("")) {
			        	 currentBracket = element.toString();
		
			        	 if( 
			        		currentBracket.equals ("{") ||
			        		currentBracket.equals ("(") ||
			        		currentBracket.equals ("[")
			        		) {
			        		 openBracketsInStack.push(currentBracket);
			        		 continue;
			        	 }
			        	 if( 
			        		currentBracket.equals (")") ||
			        		currentBracket.equals ("}") ||
			        		currentBracket.equals ("]")
			        		) {
			        		 if(openBracketsInStack.size() > 0) {
			        		 poppedOpenBracket = openBracketsInStack.pop();
			        		 if( poppedOpenBracket.equals("(") && !currentBracket.equals (")")) {
			        			 trueFlag = false;
			        			 break;
			        		 }else if( poppedOpenBracket.equals("[") && !currentBracket.equals ("]")) {
			        			 trueFlag = false;
			        			 break;
			        		 }else if( poppedOpenBracket.equals("{") && !currentBracket.equals ("}")) {
			        			 trueFlag = false;
			        			 break;
			        		 }
			        		 }else {
			        			 trueFlag = false;
			        			 break;
			        		 }
			        
			        		 
			        	 }
		        		 
			         }
			       }
			    
			    String trueFalse = trueFlag ? "Y" : "N";
			    if (openBracketsInStack.size() > 0) {
			    	trueFalse = "N";
			    }
			    System.out.println(trueFalse+" "+strBuff.toString());
			    }

}
}
