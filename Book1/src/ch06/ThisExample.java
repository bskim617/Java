package ch06;
//p170

class BirthDay {
	int day;
	int month;
	int year;
	
	public void setyear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

//p172
class Person {
	String name;
	int age;
	
	Person() {
		this("이름없음",1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//p174
	Person returnItSelf() {
		return this; //this반환
	}
}


public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setyear(2000);
		System.out.println(bDay);
		bDay.printThis();
		
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}

}
