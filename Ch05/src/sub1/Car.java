package sub1;

// 클래스 정의
public class Car {
	
	//자동차의 속성(변수)
	String name;
	String color; 
	int speed;
	
	//자동차의 기능(메서드)
	public void speedup(int speed) {
		this.speed += speed;
	}
	
	public void speeddown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차랑명 : "+name);
		System.out.println("차랑색 : "+color);
		System.out.println("속도 : "+speed);
		
	}
}
