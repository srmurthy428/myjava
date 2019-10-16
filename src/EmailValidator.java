import java.util.regex.Pattern;

public class EmailValidator { 
    public static void main(String args[]) 
    { 

    	StringBuffer inputStringBuffer = new StringBuffer();
		  if(args.length > 0)
		  {
			  for( int i =0; i < args.length ;i++) {
				  inputStringBuffer.append(args[i]);
			  }
			  
		  }	
		String emailStr = inputStringBuffer.toString();
		  
    	int indexOfAt = emailStr.indexOf('@');
    	String part1 = "";
    	String part2 = "";
    	String part3 = "";
    	String part4 = "";
    	int indexOfDot = -1;
    	int indexOfAnotherDot = -1;
    	boolean emailFormat = true;
    	
    	if( indexOfAt > 0)
    	{
    		part1 = emailStr.substring(0,indexOfAt);
    		if(emailStr.length() > indexOfAt)
    		part2 = emailStr.substring(++indexOfAt);
    		indexOfDot = part2.indexOf('.');
    		if( indexOfDot > 0) {
    			part3 = part2.substring(++indexOfDot);
    			indexOfAnotherDot = part3.indexOf('.');
    			if(indexOfAnotherDot > 0) {
    				part4 = part3.substring(++indexOfAnotherDot);
    				part3 = part3.substring(0,--indexOfAnotherDot);
    			}
    			part2  = part2.substring(0,--indexOfDot);
    		}else {
    			emailFormat = false;
    		}
    	}else {
    		emailFormat = false;
    	}
    	
    	System.out.println(part1);
    	System.out.println(part2);
    	System.out.println(part3);
    	System.out.println(part4);
    	
    	if(emailFormat) {
    		Pattern charPattern = Pattern.compile("[^a-zA-Z]");
	       	Pattern part1Pat = Pattern.compile("[^a-zA-Z0-9]");
	       	Pattern part2Pat = Pattern.compile("[^a-zA-Z0-9]");
	    	Pattern part3Pat = Pattern.compile("[^a-zA-Z]");
	    	boolean boolFirstChar = true;
	    	boolean hasSpecialChar = part1Pat.matcher(part1).find();
	    	if(part1 != null && part1.length() > 0) {
	    	String firstChar = String.valueOf(part1.charAt(0));
	    	System.out.println(firstChar);
	    	boolFirstChar  = charPattern.matcher(firstChar).find();
	    	}
	    	if(!hasSpecialChar && !boolFirstChar) {
	    		hasSpecialChar = part2Pat.matcher(part2).find();
	    		if(!hasSpecialChar) {
	    			if( part4 != null && part4.equals("")) {
		    			hasSpecialChar = part3Pat.matcher(part3).find();
		    			if(!hasSpecialChar && (part3.length() >= 2 && part3.length() <= 3)) {
		    				System.out.println("Valid");
		    			}else {
		    				System.out.println("Invalid");
		    			}
	    			}else if(part4 != null && !part4.equals("")) {
	    				boolean validflag = false;
	    				hasSpecialChar = part2Pat.matcher(part3).find();
		    			if(!hasSpecialChar) {
		    				validflag  = true;
		    			}else {
		    				validflag = false;
		    			}
	    				hasSpecialChar = part3Pat.matcher(part4).find();
	    				if(!hasSpecialChar && (part4.length() >= 2 && part4.length() <= 3)) {
	    					validflag  = true;
	    				}else {
	    					validflag = false;
	    				}
	    				if(validflag) {
	    					System.out.println("Valid");
	    				}else {
	    					System.out.println("Invalid");
	    				}
	    				
	    			}
	    		}
	    		else  {
	    			System.out.println("Invalid");
		    	}
	    	}else {
	    		System.out.println("Invalid");
	    	}

    	}else {
    		System.out.println("Invalid");
    	}
    	

    	
   // 	System.out.println(hasSpecialChar);
    		

    } 
} 
