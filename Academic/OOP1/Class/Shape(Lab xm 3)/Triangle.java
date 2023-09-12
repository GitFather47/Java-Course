class Triangle extends Shape{
	private float base;
	private float height;
	public void setBase(float base){
		this.base=base;
	}
    public float getbase(){
    	return base;
    }
    public void setHeight(float height){
		this.height=height;
	}
    public float getHeight(){
    	return height;
    }
    public void calculateArea(){
    	System.out.println(base*height);
        
    }
    public void show(){
    	System.out.println("Base:" + base);
    	System.out.println("Height: " + height);
    }
}