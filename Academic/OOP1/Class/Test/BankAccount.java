public class Account{
String accName;
int accNum;
float balance;
static float int_rate;
Account(){
    System.out.println("1st Constructor");
}
Account(String a,int n){
accName=a;
accNum=n;
balance=1000.10f;
System.out.println("2nd Constructor");
int_rate=800;
}
Account(String a,int n,float b){
accName=a;
accNum=n;
balance=b;
System.out.println("3rd Constructor");
int_rate+=10;
}
static void details(){
System.out.println("Name\t"+"Account number\t"+"Balance\t"+"Interest Rate");
}
void show(){
System.out.println(accName+"\t    "+accNum+"\t\t"+balance+"\t   "+int_rate);
}

public static void main(String[] args) {

Account a1 = new Account();
a1.show();
Account a2 = new Account("Hannah",79);
a2.show();
Account a3 = new Account("Yagami",80,640000);
a3.show();

a1.details();
a1.show();
a2.show();
a3.show();
a1.show();//It will show the latest interest.
System.out.println("For static values , the updated value will be shown.");
}
}