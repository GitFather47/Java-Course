public class Input{
public static void main(String[] args) {
	System.out.println("--Calculator--");
	switch(args[0]){
	case "+":
		float sum=0;
		for(int j=0;j<args.length-1;j++){
		sum+=Float.parseFloat(args[j+1]);
	}
		System.out.println("Summation= "+sum);
		break;
	case "-":
        float sub=0; 
		System.out.println("Enter numbers:");
		for(int j=0;j<args.length-1;j++){
		sub-=Float.parseFloat(args[j+1]);
	}
		System.out.println("Substraction= "+sub);
		break;
	case "*":
		float mul=0;
		for(int j=0;j<args.length-1;j++){
		mul*=Float.parseFloat(args[j+1]);
	}
		System.out.println("Multiplication= "+mul);
		break;
	case "/":
		float div=0;
		for(int j=0;j<args.length-1;j++){
		div+=Float.parseFloat(args[j+1]);
	}
	System.out.println("Dividation= "+div);
	break;
	}
	
}
}