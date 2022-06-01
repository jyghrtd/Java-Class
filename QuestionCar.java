package Week2;

public class QuestionCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Benz benz = new Benz(5000);
		Bmw bmw = new Bmw(4500);
		
		benz.printInfo();
		bmw.printInfo();
		benz.printSignature();
		bmw.printSignature();
	}

}
