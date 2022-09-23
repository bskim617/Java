package ch09_1;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop disply()");
	}
	
	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}
}
