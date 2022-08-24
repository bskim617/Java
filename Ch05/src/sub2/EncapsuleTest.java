package sub2;
/*
 * 날짜 : 2022/08/24
 * 이름 : 김보성
 * 내용 : Java 캡슐화(정보은닉) 실습하기
 * 
 * 캠슐화(Encapsule)
 * - 캡슐화는 객체의 속성(필드)을 외부에서 참조하지 못하도록 객체의 정보를 은닉하는 특성
 * - 클래스의 속성은 반드시 private 선언을 통해 캡슐화 해야한다.
 * - 은닉된 정보의 안전한 참조를 위해 Getter, Setter을 정의한다.
 */
public class EncapsuleTest {
	
	public static void main(String[] args) {
	
		//객체 생성
		Car sonata = new Car("소나타","흰색",0);
		
		//setter을 통한 속성 변경
		sonata.setColor("은색");
		
		//초기화(캡슐화 일때 필요 없음)
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		//기능
		sonata.speedup(80);
		sonata.speeddown(20);
		sonata.show();
		
		//Account 객체 생성과 초기화
		Account kb = new Account("국민은행", "101-11-1001", "김유신", 0);
		
		//기능
		kb.deposit(100000);
		kb.withdraw(35000);
		kb.show();
	}

}
