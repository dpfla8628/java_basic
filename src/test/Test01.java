package test;

public class Test01 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        //문자열 + any type = 문자열
        int a =7;
        System.out.println(""+a+a);//"77"
        System.out.println(a+a+"");//"14"
    }
    public static void test2() {
        //형변환
        int Int = 10;
        float Float = 1.6f;
        byte Byte = 5;

        System.out.println((float)Int);//10.0
        System.out.println((int)Float);//1
        System.out.println((int)Byte);//5 형변환 생략 가능
        System.out.println((byte)Int);//10
    }
    public static void test3() {
        //출력 형식 지정
        System.out.printf("%.2f\n",10.0/3);//3.33
        System.out.printf("%d, %x, %o, %s \n",15,15,15,Integer.toBinaryString(15));//15(10),f(16),17(8),1111(2)
        System.out.printf("[%5d]\n",10);
    }
    public static void test4() {
        //이항연산자 주의할점
        Integer aa = 10000;
        Integer bb = 20000;
//        Long c1 = aa*bb; //error
        Long c2 = (long)aa*bb;
        System.out.println(c2.getClass().getName());//int*long=long
    }
}
