import java.util.StringTokenizer;

public class JSONInput {
	
	public static void main(String args[]) {
		
		  StringBuffer inputStringBuffer = new StringBuffer();
		  
		  if(args.length > 0)
		  {
			  for( int i =0; i < args.length ;i++) {
				  inputStringBuffer.append(args[i]);
			  }
			  
		  }
		  
		  System.out.println(inputStringBuffer);
		  String inputString = inputStringBuffer.toString();
		  StringTokenizer strzTknz = new StringTokenizer(inputString, "Julia");
		  
		  while( strzTknz.hasMoreTokens()) {
			  System.out.println(strzTknz.nextElement());
		  }
	}

}
