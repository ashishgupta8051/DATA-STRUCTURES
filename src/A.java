abstract class A1{
    abstract void print();
    static int a = 10;
    void printNumber(int num){
        System.out.println("Number is : "+num);
    }
}

interface I1{
    int b = 10;

    void print2();

    default void get(){
        System.out.println("get");
    }
}

class B1 extends A1 implements I1{

    @Override
    void print() {
        System.out.println("Hello");
    }

    void hello(){
        System.out.println("Hello Ashish");
    }

    @Override
    public void print2() {
        System.out.println("print2");
    }
}

public class A {
    public static void main(String[] args){
        A1 a1 = new B1();
        a1.printNumber(10);
        a1.print();
        A1.a = 20;
        System.out.println(A1.a);

        I1 i1 = new B1();
        i1.get();
        i1.print2();
        System.out.println(I1.b);

        B1 b1 = new B1();
        b1.hello();
        b1.print();
    }
}
