package Week2;

abstract class Book {
	String name;
	int price;
	Book(String name, int price){ //생성자
		this.name = name;
		this.price = price;
	}
	abstract void printInfo(); //추상 메소드
	abstract double salePrice(); //추상 메소드
}

class Comic extends Book {
	public Comic(String name, int price) {
		super(name, price);
	}
	
	void printInfo() {
		System.out.println("책의 이름은 " + name + "이고 장르는 만화책입니다.");
	}
	
	double salePrice() {
		return price - (price/10);
	}
}

class Fiction extends Book {
	public Fiction(String name, int price) {
		super(name, price);
	}
	
	void printInfo() {
		System.out.println("책의 이름은 " + name + "이고 장르는 소설입니다.");
	}
	
	double salePrice() {
		return price - (price/20*3);
	}
}

class Magazine extends Book {
	public Magazine(String name, int price) {
		super(name, price);
	}
	
	void printInfo() {
		System.out.println("책의 이름은 " + name + "이고 장르는 잡지입니다.");
	}
	
	double salePrice() {
		return price - (price/20);
	}
}