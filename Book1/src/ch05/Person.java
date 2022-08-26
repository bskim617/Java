package ch05;

//p131
//p153
public class Person {
	
	// String name;
	// int height;
	// double weight;
	// char gender;
	// boolean married;
	
	String name;
	float height;
	float weight;
	
	//p155
	public Person() {} //디폴트 생성자 직접 추가
	
	//p154
	public Person(String pname) {
		name = pname;
	}
	
	//p 157
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
