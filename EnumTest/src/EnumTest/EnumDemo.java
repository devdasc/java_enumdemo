package EnumTest;

import java.util.EnumSet;

public class EnumDemo {
	public enum Book
	{// constants
		//inside enum we can have also fields and fields constructor
		JHTP("Java How to program","2016"),
		CHTP("C++ How to program"," 2015"),
		VHTP("C How to program"," 2012"),
		XHTP("COBOL How to program","2010"),
		ABCD("Anything How to program","2015"),
		EFGH("Nothing How to program","2011");
		// instance fields
		private final String title;// book title
		private final String copyrightYear;
		//constructors
		Book(String bookTitle, String year)
		{
			title=bookTitle;
			copyrightYear=year;
		}
		//methods
		public String getTitle()
		{
			return title;
		}
		public String getCopyrightYear()
		{
			return copyrightYear;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("All books: \n");
		for(Book book:Book.values())
           System.out.println(book+" "+book.getTitle()+" "+book.getCopyrightYear());
		// to print a specified range
		System.out.println("\nAll books in the specified range: \n");
		for(Book book:EnumSet.range(Book.JHTP,Book.VHTP))
			System.out.println(book+" "+book.getTitle()+" "+book.getCopyrightYear());
	}

}
