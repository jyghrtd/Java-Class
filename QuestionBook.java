package Week2;
import java.util.Scanner;

public class QuestionBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("서점에서 파는 책의 개수는?: ");
		BookStore bks = new BookStore(sc.nextInt());
		
		bks.setBooks();
		
		bks.printBooksInfo();
	}

}
