package sub2;

/*
 * 날짜 : 2022/09/01
 * 이름 : 김보성
 * 내용 : 인터페이스 실습하기
 * 
 * 인터페이스(Interface)
 *  - 클래스간의 공통의 통일된 표준 규격을 통해 클래스 구조를 설계하는 문법
 *  - 인터스페이스를 활용해서 객체간 결합도를 완화하는 효과를 얻는다.(다형성)
 */

public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스로 공통 클래스 구조설계
		Car sonata = new Sedan("소나타", "흰색", 0);
		sonata.speedup(100);
		sonata.speeddown(40);
		sonata.show();
		
		Car bongo = new Truck("봉고", "파란색", 0);
		bongo.speedup(80);
		bongo.speeddown(20);
		bongo.show();
		
	}

}
