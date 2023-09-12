class Customer {
	private String customerName;
	private ShoppingCart[] shoppingCart;
	private Product[] product;
	public Customer(){

	}
	public Customer(String customerName,ShoppingCart[] shoppingCart){
		this.customerName=customerName;
		this.shoppingCart=shoppingCart;
	}
	public void setShoppingCart(ShoppingCart[] shoppingCart){
		this.setShoppingCart=shoppingCart;
	}
	public ShoppingCart[] getShoppingCart(){
		return shoppingCart;
	}
	public String setCustomerName(String customerName){
		this.customerName=customerName;
	}

}
