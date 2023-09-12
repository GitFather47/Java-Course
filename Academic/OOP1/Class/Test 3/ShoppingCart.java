class ShoppingCart {
	private Product[] totalProducts = new Product[10];
	private double totalPrice;
	public ShoppingCart(){

	}
	public ShoppingCart(String name,double price,int quantity){
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public void addProducts(Product[] product){
		for(int i=0; i<totalProducts.length;i++)
		{
			if(totalProducts[i] == null)
			{
				totalProducts[i] = product;
				break;
			}
		}


	}
	public void removeProducts(Product[] product){
		for(int i=0; i<totalProducts.length;i++)
		{
			if(totalProducts[i] == product)
			{
				totalProducts[i] = null;
				totalProduct.setQuantity(0.0);
				break;
			}
		}

	}
	public double totalPrice(){
         //probelem!! need one more variable;
		for(int i=0; i<totalProducts.length;i++)
		{
			if(totalProducts[i] != null )
			{
				totalPrice+=totalProducts[i].getPrice();
				break;
			}
		}

	}
	public void show(){
		for(int i=0; i<totalProducts.length;i++)
		{
		if(totalquantity[i]==null){
			System.out.println("Product has been removed");
		}
		if(totalquantity[i]!=null){
			System.out.println("Ordered products:");
		    System.out.println("Name"+totalProducts[i].getName());
		    System.out.println("Price:"+totalProducts[i].getPrice());
		    System.out.println("Quantity:"+totalProducts[i].getQuantity());

		}
		
	}
System.out.println("Total price:"+totalPrice);
}
	