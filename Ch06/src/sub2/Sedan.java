package sub2;

public class Sedan implements Car {
	
	private String name;
	private String color;
	private int speed;
	
	public Sedan(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	@Override
	public void speedup(int speed) {
		this.speed += speed;
	}

	@Override
	public void speeddown(int speed) {
		this.speed -= speed;
	}

	@Override
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("차량속도 : "+speed);
	}

}
