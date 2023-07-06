class Shape{
	private String color;
	Shape(){
    
	}
    public void setColor(String color){
    	this.color=color;
    }
    public String getColor(){
    	return color;
    }
    public void show(){
    	System.out.println("Color:" + color);
    }
}