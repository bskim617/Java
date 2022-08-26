package ch05;
//p 153
public class PersonTest {
	public static void main(String[] args) {
		//p158
		Person personLee = new Person("이순신", 175, 75); //인스턴스 변수 초기화와 동시에 클래스 생성
		
		Person personKim = new Person(); //디톨트 생성자로 클래스를 생성한 후 인스턴스 변수값을 따로 초기화
		personKim.name = "김유신";
		personKim.weight = 85.5f;
		personKim.height = 180.0f;
						
	}

}
