class Fin {
    //static final int ralph; // The 'final' variable must be initialized here or in a static block.
    final int ralph;
    public Fin(int jotaro) {
        ralph = jotaro;
    }
}

public class Final {
    public static void main(String[] args) {
        Fin f1 = new Fin(10);
        System.out.println("jotaro = " + f1.ralph);
    }
}

/*class A{
Final int jotaro;
A(a1){
this.jotaro=a1
}
Main method{
A j1 = new A(9);
A j2= new A(8);
}
*/