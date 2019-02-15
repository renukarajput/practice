package javaPro;

class Base{
 void display(int a,int b){
     System.out.println(a+b);
 }
}

class Derived1 extends Base{
    void display(int a,int b){
        System.out.println(a*b);
    }
}

class Derived2 extends Base{
    void display(int a,int b){
        System.out.println(a-b);
    }
}

public class OverridingEx {
    public static void main(String[] args) {
        System.out.println("in main main");
        Base b = new Derived1();
        b.display(5,5);
    }
}
