public class Variable {
    //클래스 영역
    int iv;         //인스턴스 변수 : 각 인스턴스의 개별적인 저장 공간(생싱시마다 새로운 저장공간 할당), 인스턴스마다 다른 값 저장 가능, 참조변수 없을 시 자동 제거
    static int cv = 100;  //클래스 변수(공유 변수) : 같은 클래스의 모든 인스턴스들이 공유하는 변수, 프로그램 종료시 소멸

    //메서드 영역
    void method(){
         //지역 변수 : 매서드 내에 선언되며 메서드의 종료와 함께 소멸
    }
}
//JVM 메모리 구조 : 호출스택 - 메서드의 작업 공간 
// main부터 차례대로 메소드가 FILO된다.