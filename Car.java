package Week2;

abstract class Car {
	String name; // 자동차 이름
	int price; // 자동차 가격
	abstract void printInfo(); // 자동차 정보 출력 메소드
	abstract void printSignature(); // 추상메소드
}

class Benz extends Car {
	Benz(int price) {
		name = "Benz";
		this.price = price;
	}
	
	void printInfo() {
		System.out.println("차 이름은 " + name + "이고 가격은 " + price + "입니다.");
	}
	
	void printSignature() {
		System.out.println("벤츠는 길에서 자주 보입니다.");
	}
}

class Bmw extends Car {
	Bmw(int price) {
		name = "Bmw";
		this.price = price;
	}
	
	void printInfo() {
		System.out.println("차 이름은 " + name + "이고 가격은 " + price + "입니다.");
	}
	
void printSignature() {
	System.out.println("BMW는 내가 좋아하는 차입니다.");
	}
}