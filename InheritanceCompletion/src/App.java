
public class App {

	public static void main(String[] args) {
		
		
		Software s=new Software();
		s.setProgrammer("abc");
		Software sf=new Software();
		sf.setProgrammer("abc");
		System.out.println(s.equals(sf));
		Book b=new Book();
		b.setAuthor("JFK");
		Book b1=new Book();
		b1.setAuthor("jfk");
		System.out.println(b1.equals(b));
		
	}

}
