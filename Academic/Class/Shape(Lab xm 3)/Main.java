import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		int red =0;
	    int blue =0;
	    int green=0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many rectangles do you want to insert?");
		//Array creation
		Rectangle r[]= new Rectangle[input.nextInt()];
	    //Object creation
	    for(int i=0;i<r.length;i++){
            r[i] = new Rectangle();
            //Taking input
            System.out.println("Rectangle "+(i+1));
            System.out.println("Length: ");
            r[i].setLength(input.nextFloat());
            System.out.println("Width: ");
            r[i].setWidth(input.nextFloat());
            System.out.println("Color: ");
            input.nextLine();
            r[i].setColor(input.nextLine());
            System.out.println("Area:");
            r[i].calculateArea();


	    }	
	    System.out.println("How many triangles do you want to insert?");
		Triangle t[]= new Triangle[input.nextInt()];
		//Object creation
		for(int i=0;i<t.length;i++){
          t[i]=new Triangle();
          //Input
          System.out.println("Triangle "+(i+1));
          System.out.println("base:");
          t[i].setBase(input.nextFloat());
          System.out.println("height:");
          t[i].setHeight(input.nextFloat());
          System.out.println("Color: ");
          input.nextLine();
          t[i].setColor(input.nextLine());
          System.out.println("Area:");
          t[i].calculateArea();
    }
    //Shape count
    for(int i =0;i<r.length;i++){
    	if(r[i].getColor().equals("Red")){
    		red+=1;
    	}
    	if(r[i].getColor().equals("Blue")){
    		blue+=1;
    	}
    	if(r[i].getColor().equals("Green")){
    		green+=1;
    	}
    }
    for(int i =0;i<r.length;i++){
    	if(t[i].getColor().equals("Red")){
    		red+=1;
    	}
    	if(t[i].getColor().equals("Blue")){
    		blue+=1;
    	}
    	if(t[i].getColor().equals("Green")){
    		green+=1;
    	}
    }
    System.out.println("Total Red shape: "+ red);
    System.out.println("Total Blue shape: "+ blue);
    System.out.println("Total Green shape: "+ green);
}
}
