public class Student {

	private int id;
	private String name;

	public void setId(int id, String password) {
		if (password.equals("123")) {
			this.id = id;
		}
		else {
			System.out.println("Unauthorized Access!!");
		}
	}

	public void setName(String name, String password) {
		if (password.equals("123")) {
			this.name = name;
		}
		else {
			System.out.println("Unauthorized Access!!");
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
