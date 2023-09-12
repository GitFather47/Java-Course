class Main {
 
    int x;
 
    Main() { System.out.println("Default Constructor of Main"); }
 
    void setX(int x) { this.x = x; }
 
    int getX() { return x; }
 
    public static void main(String[] args) {
        Main m1 = new Main();
        m1.setX(10);
        Main m2 = new Main();
        m2.setX(120);
        Main m3 = m1;
 
        System.out.println("m1 = " + m1.toString() + " " + "x = " + m1.getX());
        System.out.println("m2 = " + m2.toString() + " " + "x = " + m2.getX());
        System.out.println("m3 = " + m3.toString() + " " + "x = " + m3.getX());
 
        if (m1 == m3) { System.out.println("m1 is equal to m3"); }//Will check address
        else { System.out.println("m1 is NOT equal to m3"); }
 
        if (m1 == m2) { System.out.println("m1 is equal to m2"); }
        else { System.out.println("m1 is NOT equal to m2"); }
 
        if (m1.equals(m3)) { System.out.println("m1 is equal to m3"); }//Will check attributes 
        else { System.out.println("m1 is NOT equal to m3"); }
 
        if (m1.equals(m2)) { System.out.println("m1 is equal to m2"); }
        else { System.out.println("m1 is NOT equal to m2"); }
    }
 
    public boolean equals(Object o1) {
        Main castedMain = (Main) o1;
        if (castedMain.x == this.x) 
            return true;
        else 
            return false;
    }
}