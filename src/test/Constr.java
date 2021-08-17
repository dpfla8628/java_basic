//생성자란 ? 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
// Card c = new Card();
// 1. 연산자 new 에 의해서 메모리(heap)에 Card클래스의 인스턴스가 생성된다.
// 2. 생성자 Card()가 호출되어 수행된다.
// 3. 연산자 new의 결과로 생성된 Card인스턴스의 주소가 반환되어 참조변수 c에 저장된다.
public class Constr {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Constr() {}

	Constr(String c, String g, int d) {
		color = c; // 참조변수 사용 : this.color = c
		gearType = g;
		door = d;
	}
}

class EX {
	public static void main(String[] args) {
		Constr c1 = new Constr();
		c1.color    = "white";
		c1.gearType = "auto";
		c1.door = 4;

		Constr c2 = new Constr("white", "auto", 4);

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}
