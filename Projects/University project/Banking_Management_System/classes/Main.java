package classes;
import java.util.*;
import java.lang.*;
import classes.Login;
public class Main {
    private Login login;
    
    public Main() {
        login = new Login(this);
    }
    
    public static void main(String[] args) {
     new Main();
    }
}
