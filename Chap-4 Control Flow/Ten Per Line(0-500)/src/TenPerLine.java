
public class TenPerLine {

	public static void main(String[] args) {
		int Start = 0;
		int End = 500;
		
	    int counter = Start;
	    while (counter<=End) {
	    	System.out.println(counter + "");
	    	if ((counter+1) % 10 ==0) {// if (counter+1) than 0-9 else if only counter ,0<space> 1-10.
	    		System.out.println("");
	    	}
	    	counter++;
	    }
		// TODO Auto-generated method stub

	}

}
