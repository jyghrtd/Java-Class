package Week2;
import java.util.Scanner;

class BookStore {
	Book books[];
	
	BookStore(int num) {
		books = new Book[num];
	}
	
	void setBooks() {
		Scanner sc = new Scanner(System.in);
		String name;
		int price, genre;
		
		for(int i = 0; i < books.length; i++) {
			System.out.print("책이름: ");
			name = sc.nextLine();
			System.out.print("책 가격: ");
			price = sc.nextInt();
			System.out.print("책 장르(1: 코믹, 2: 소설, 3: 잡지): ");
			genre = sc.nextInt();
			sc.nextLine();
			
			if(genre == 1)
				books[i] = new Comic(name, price);
			else if(genre == 2)
				books[i] = new Fiction(name, price);
			else if(genre == 3)
				books[i] = new Magazine(name, price);
			else {
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	
	void printBooksInfo() {
		for(int i = 0; i < books.length; i++) {
			books[i].printInfo();
			System.out.println("판매가격은 " + books[i].salePrice() + "입니다.");
		}
	}
}
