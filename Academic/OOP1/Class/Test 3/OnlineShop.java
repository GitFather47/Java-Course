import java.util.Scanner
public abstract class OnlineShop {
	private Product[] availableProducts = new Product[3];
	private Customer[] customer;
	ShoppingCart[] shp = new ShoppingCart[50];

	public abstract void showAvailableProducts{
		System.out.println("Available Products:");
		System.out.println("1.Fruits");
		System.out.println("2.Vegetable");
		System.out.println("3.Spices");
		String prompt = input.nextLine().charAt(0);
if(prompt.equals("1")){
	    Product availableProducts[0]= new Product("Apple",15.15,14);
	    Product availableProducts[1]= new Product("Banana",40.16,15);
	    Product availableProducts[2]= new Product("Mango",20.09,18)
	    for(int i=0;i<4;i++){
	    	System.out.println("Name"+p[i].getName());
	    	System.out.println("Price:"+p[i].getPrice());
	    	System.out.println("Quantity:"+p[i].getQuantity());

	    }
	    System.out.println("Which one?");
	    String choice = input.nextLine().charAt(0);
	    for(int i = 0 ; i<shp.length;i++){
	    	if(shp[i]==null){
	    		shp[i]= new ShoppingCart();
	    		shp[i].addProduct(availableProducts[choice].getName(),availableProducts[choice].getPrice(),availableProducts[choice].getQuantity());
	    		System.out.println("Product added");
	    	}
	    }
	  	    if(choice.equals("1")){
	    	System.out.println("How many?:");
	    	availableProducts[0].setQuantity(input.nextDouble());
	    	 for(int i=0;i<50;i++){
	    		if(shp[i]==null){
	    			shp[i]= new ShoppingCart();
	    			shp[i].addProduct(availableProducts[i]);
	    		}
	    	}
	    }
	    if(choice.equals("2")){
	    	System.out.println("How many?:");
	    	availableProducts[1].setQuantity(input.nextDouble());
	    	 for(int i=0;i<50;i++){
	    		if(shp[i]==null){
	    			shp[i]= new ShoppingCart();
	    			shp[i].addProduct(availableProducts[i]);
	    		}
	    	}
	    }
	    if(choice.equals("3")){
	    	System.out.println("How many?:");
	    	availableProducts[2].setQuantity(input.nextDouble());
	    	 for(int i=0;i<50;i++){
	    		if(shp[i]==null){
	    			shp[i]= new ShoppingCart();
	    			shp[i].addProduct(availableProducts[i]);
	    		}
	    	}
	    }

}
if(prompt.equals("2"))
		Product availableProducts[0]= new Product("Broccoli",15,16);
	    Product availableProducts[1]= new Product("Cabbage",40,17);
	    Product availableProducts[2]= new Product("Tomato",20,19);
		for(int i=0;i<4;i++){
	    	System.out.println("Name"+p[i].getName());
	    	System.out.println("Price:"+p[i].getPrice());
	    	System.out.println("Quantity:"+p[i].getQuantity());
	    	
	    }
	    System.out.println("Which one?");
	    String choice = input.nextInt();
	    if(choice.equals("1")){
	    	System.out.println("How many?:");
	    	availableProducts[0].setQuantity(input.nextDouble());
	    	 for(int i=0;i<50;i++){
	    		if(shp[i]==null){
	    			shp[i]= new ShoppingCart();
	    			shp[i].addProduct(availableProducts[i]);
	    		}
	    	}
	    }
	    if(choice.equals("2")){
	    	System.out.println("How many?:");
	    	availableProducts[1].setQuantity(input.nextDouble());
	    	 for(int i=0;i<50;i++){
	    		if(shp[i]==null){
	    			shp[i]= new ShoppingCart();
	    			shp[i].addProduct(availableProducts[i]);
	    		}
	    	}
	    }
	    if(choice.equals("3")){
	    	System.out.println("How many?:");
	    	availableProducts[2].setQuantity(input.nextDouble());
	    	 for(int i=0;i<50;i++){
	    		if(shp[i]==null){
	    			shp[i]= new ShoppingCart();
	    			shp[i].addProduct(availableProducts[i]);
	    		}
	    	}
	    }
       
	}
if(prompt.equals("3")){
	    Product availableProducts[0]= new Product("Cinnamon",15,4);
	    Product availableProducts[1]= new Product("Cloves",40,5);
	    Product availableProducts[2]= new Product("Corriender",20,7);
	     for(int i=0;i<4;i++){
	    	System.out.println("Name"+p[i].getName());
	    	System.out.println("Price:"+p[i].getPrice());
	    	System.out.println("Quantity:"+p[i].getQuantity());
	    }
	    System.out.println("Which one?");
	    int choice = input.nextInt();
	    if(choice.equals("1")){
	    	System.out.println("How many?:");
	    	availableProducts[0].setQuantity(input.nextDouble());
	    	 for(int i=0;i<50;i++){
	    		if(shp[i]==null){
	    			shp[i]= new ShoppingCart();
	    			shp[i].addProduct(availableProducts[0]);
	    		}
	    	}
	    }
	    if(choice.equals("2")){
	    	System.out.println("How many?:");
	    	availableProducts[1].setQuantity(input.nextDouble());
	    	 for(int i=0;i<50;i++){
	    		if(shp[i]==null){
	    			shp[i]= new ShoppingCart();
	    			shp[i].addProduct(availableProducts[1]);
	    		}
	    	}
	    }
	    if(choice.equals("3")){
	    	System.out.println("How many?:");
	    	availableProducts[2].setQuantity(input.nextDouble());
	    	for(int i=0;i<50;i++){
	    		if(shp[i]==null){
	    			shp[i]= new ShoppingCart();
	    			shp[i].addProduct(availableProducts[2]);
	    			break;
	    		}
	    	}


	    }


}
}