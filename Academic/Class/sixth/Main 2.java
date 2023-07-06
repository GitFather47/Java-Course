public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(Integer.parseInt(args[0]), args[2]);
		s1.setName(args[1], args[2]);

		System.out.println(s1.getId() + " " + s1.getName());
	}
}
