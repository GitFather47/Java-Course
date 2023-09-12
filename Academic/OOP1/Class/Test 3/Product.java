public class Product extends OnlineShop  {
	private String name;
	private double price =0.0;
	private int quantity =0;
	public Product(){
		
	}
    public Product(String name,double price,int quantity){
    	this.name=name;
    	this.price=price;
    	this.quantity=quantity;

    }
    public void setName(String name){
    	this.name=name;
    }
    public String getName(){
    	return name;
    }
    public void setPrice(double price){
    	this.price=price;

    }
    public double getPrice(){
    	return price;
    }
    public void setQuantity(double q){
    	this.quantity=quantity;
    }
    public int getQuantity(){
    	return quantity;
    }
}