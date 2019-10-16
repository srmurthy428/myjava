import java.util.ArrayList;
import java.util.List;

public class FindNumInArray {

    // Complete the findNumber function below.
    static String findNumber(List<Integer> arr, int k) {

    	  Boolean bool = arr.contains(new Integer(k));
    	  return bool?"YES":"NO";
    }
    
    static List<Integer> oddNumbers(int l, int r) {
    	ArrayList<Integer> oddNum = new ArrayList<Integer>();
    	if (l > 0 && l % 2 > 0) {
    		for(int i = l; i <= r; i=i+2) {
    			oddNum.add(new Integer(i));
    		}
    	}else if(l > 0 && l % 2 == 0) {
    		for(int i = l+1; i <= r; i=i+2) {
    			oddNum.add(new Integer(i));
    		}
    	}
    	return oddNum;
    }
    
	public static void main(String[] args) {
		
		ArrayList<Integer> arl = new ArrayList<Integer>();
		arl.add(new Integer(1));
		arl.add(new Integer(2));
		arl.add(new Integer(3));
		arl.add(new Integer(4));
		arl.add(new Integer(5));
		String retString = FindNumInArray.findNumber(arl,2);
		System.out.println(retString);
		ArrayList<Integer> oddNumArray = (ArrayList<Integer>) FindNumInArray.oddNumbers(2, 10);
		System.out.println(oddNumArray);
	}
}
