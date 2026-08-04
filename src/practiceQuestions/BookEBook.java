package practiceQuestions;
class Book{
	String title;
	Book(){
		System.out.println("Default Book Constructor");
	}
	Book(String title){
		this.title=title;
		System.out.println("book title"+title);
	}
	
}
class EBook extends Book{
	String title;
	EBook(){
		this("java programing");
		//System.out.println("ebook");
	}
	EBook(String title){
		super(title);
		System.out.println("ebook title" +title);
	}
}
public class BookEBook {

	public static void main(String[] args) {
		EBook e=new EBook();

	}

}
