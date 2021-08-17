public class MyMethod {
    long a,b;

    long add(){//인스턴스 메서드 : 메서드 내에서 인스턴스 변수 사용 가능
        return a+b;
    }
    //호출 e.g.
    // MyMethod m = new MyMethod();
    // m.a=200L;
    // m.b=200L;
    // m.add();

    static long add(long a, long b){ //클래스 메서드 : 매서드 내에서 인스턴스 변수 사용 불가
        return a+b;
    }
    //호출 e.g.
    // MyMethod.add(200L,200L);

}
