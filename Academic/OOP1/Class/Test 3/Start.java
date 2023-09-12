class Start{
	public static void main(String[] args) {
		OnlineShop o = new OnlineShop();
		System.out.println("Welcome to walmart");
		System.out.println("How many customers?:");
		Customer cus[] = new Customer[input.nextInt()];
		for (int i=0;i<cus.length;i++){
			cus[i]=new Customer();
			o.showAvailableProducts();
			p[i] = new Product();
			cus[i].setShoppingCart(p[i]);

		}
		for (int i=0;i<cus.length;i++){
			if (cus[i].getShoppingCart()!=null){
				cus[i].getShoppingCart().show();
			}
	}
}