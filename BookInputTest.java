package Book;
import java.util.Scanner;
public class BookInputTest {

	public static void main(String[] args) {
		
//Create an scanner object
		Scanner in=new Scanner(System.in);
//Create the book object
		Book Book1=new Book();
//Print to the screen what input we want then ask for input
	
System.out.println("Please enter the title of the book:");
	Book1.title=in.nextLine();

System.out.println("Please enter the author name");
	Book1.author=in.nextLine();

System.out.println("Please enter the number of pages");
	Book1.numberofpages=in.nextInt();

System.out.println("The book title is: "+Book1.title);
System.out.println("The book author is: "+Book1.author);
System.out.println("The book title is: "+Book1.numberofpages);
	}

}
