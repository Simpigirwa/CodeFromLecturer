package oop.bookandAuthorversion;

public class BookAuthorTest {

	public static void main(String[] args) {
		Author a1=new Author("Joas", "j@gmail.com");
		System.out.println(a1);
		//you can use set and get
		Book b1=new Book("12345", "Java programming", a1, 8.8,90);
		System.out.println(b1);
	}

}
