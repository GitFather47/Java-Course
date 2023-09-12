class User{
private String username;
private String password;
	 public boolean  checkAdmin(){
	 	boolean flag;
	 	flag =true;

	System.out.println("\t\t\t1.Username\n\t\t\t") ;
	username=input.nextLine():
	System.out.println("2.Password:") ;
	password=input.nextLine():
	if(username.equals("admin")){
		if(password.equals("admin")){
			System.out.println("Acess granted.")
		}
		else{
		          System.out.println("Wrong password.")
		          flag =false;
		}
else{
            System.out.println("Wrong username.")
            flag=false

}
return flag;
	}
}
