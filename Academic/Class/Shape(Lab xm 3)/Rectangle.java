class Rectangle extends Shape{
	private float length;
	private float width;
	public void setLength(float length){
		this.length=length;
	}
    public float getLength(){
    	return length;
    }
    public void setWidth(float width){
		this.width=width;
	}
    public float getWidth(){
    	return width;
    }
    public void calculateArea(){
        System.out.println(length*width);
    }
    public void show(){
    	System.out.println("Length:" + length);
    	System.out.println("Width: " + width);
    }
}