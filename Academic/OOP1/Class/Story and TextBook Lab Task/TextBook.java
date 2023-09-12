import java.util.Scanner;
class TextBook{
private String isbn,bookTitle,authorName,standard;
private double price;
private int availableQuantity;
private double totalPrice;
static double discountRate;
TextBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,String standard){
	this.isbn=isbn;
	this.bookTitle=bookTitle;
	this.authorName=authorName;
	this.availableQuantity=availableQuantity;
	this.price=price;
	totalPrice=price*availableQuantity;
	this.standard=standard;
}
//Setter Methods
void setIsbn(String isbn){
	this.isbn=isbn;
}
void setBookTitle(String bookTitle){
	this.bookTitle=bookTitle;
}
void setAuthorName(String authorName){
	this.authorName=authorName;
} 
void setPrice(double price){
    this.price=price;
}
void setAvaiableQuantity(int availableQuantity){
	this.availableQuantity=availableQuantity;

}
void setstandard(String standard){
	this.standard=standard;
}
static void setDiscountRate(double rate){
	discountRate=rate;
	
}
//Getter Methods
String getIsbn( ){
	return isbn;
}
String getBookTitle( ){
	return bookTitle;
}
String getAuthorName( ) {
	return authorName;
}
double getPrice( ){
	return price;
}
int getAvailableQuantity( ){
	return availableQuantity;
}
String getstandard(){
	return standard;
}
static double getDiscountRate(){
	return discountRate;

}
void addQuantity(int amount){
availableQuantity+=amount;//Probelem!!Need one more variable total
totalPrice=totalPrice+ price*amount;
}
void sellQuantity(int amount){
availableQuantity-=amount;
totalPrice=totalPrice - price*amount;
}
void showDetails(){
	System.out.println("-------Wendys Book Store--------");
	System.out.println("\nDetails of purchasing books");
	System.out.println("International Standard Book Number: "+ isbn +",\nBook title:"+ bookTitle+",\nAuthor name: "+authorName +",\nAvailable:"+availableQuantity + ",\nStandard:"+ standard+",\nAvailable discount for books: "+ discountRate +"%" +",\nPrice: " + totalPrice);
}
}
class Start{
	public static void main(String[] args) {
		//Object Creation Part
		Scanner input = new Scanner(System.in);
		System.out.println("How many books do you want to purchase? ");
		TextBook book[] = new TextBook[input.nextInt()];
		//Input part
		for(int i =0; i<book.length;i++){
			System.out.println("Book number ("+(i+1)+")");
			System.out.print("International Standard Book Number:");
			input.nextLine();
			String isbn = input.nextLine();
	        System.out.print("Book Title:");
	        String bookTitle = input.nextLine();
	        System.out.print("Author name:");
	        String authorName= input.nextLine();
	        System.out.print("Price:");
	        double price= input.nextDouble();
	        System.out.print("Quantity:");
	        int quantity = input.nextInt();
	        System.out.println("standard:");
	        input.nextLine();
	        String standard = input.nextLine();
	        System.out.println("Discount Rate: ");
	        int disRate = input.nextInt();
	        //Object creation
	        book[i] = new TextBook(isbn,bookTitle,authorName,price,quantity,standard);
	        //book[i].setIsbn(isbn),book[i].setBookTitle(bookTitle),book[i].setAuthorName(authorName),book[i].setPrice(price),book[i].setAvaiableQuantity(quantity),book[i].setstandard(standard));
	        //discount
	        book[i].setDiscountRate(disRate);
	        //Show details part
	        book[i].showDetails();
	    }
	    //Adding/Removing
	    System.out.println("Choose options:\n1.Add books\n2.Remove books\n3.Exit");
	    int num = input.nextInt();
	    for(int i =0; i<book.length;i++){
	    	if(num==1){
	    		System.out.println("How many books do you want to add?");
	    		book[i].addQuantity(input.nextInt());
	    		System.out.println("Book sucessfully added.");
	    		book[i].showDetails();
	    		System.out.println("Total Books Available after newly addition: " + book[i].getAvailableQuantity());
	    	}
	    	else if(num==2){
	    		System.out.println("How many books do you want to remove?");
	    		book[i].sellQuantity(input.nextInt());
	    		System.out.println("Book succesfully removed.");
	    		book[i].showDetails();
	    		System.out.println("Total Books Available after removal: " + book[i].getAvailableQuantity());
	    	}
	    	else if(num==3){
	    		System.exit(0);
	    		break;
	    	}
		}
		

	};
}