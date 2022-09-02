package sub3;

/*
 * 날짜 : 2022/09/02
 * 이름 : 김보성
 * 내용 : 다형성 연습문제
 */
class Product {
	protected String category;
	protected int price;
	
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
	}
	public void info() {}
	
}

class Television extends Product{

	public Television(String category, int price) {
		super(category, price);
	}
	
	public void info () {
		System.out.println("제품분류 : "+category);
		System.out.println("제품가격 : "+price);
	}
}

class Coumputer extends Product{

	public Coumputer(String category, int price) {
		super(category, price);
	}
	
	public void info () {
		System.out.println("제품분류 : "+category);
		System.out.println("제품가격 : "+price);
	}
}

public class Test08 {
	public static void main(String[] args) {
		
		Product p1 = new Television("가전",100);
		Product p2 = new Coumputer("컴퓨터",150);
		
		p1.info();
		p2.info();
		
	}

}
