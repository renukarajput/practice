package scala.javaPro;

public class OverloadingEx {

    public static void main(String[] args) {
        display('c',5);
    }

    static void display(char c){
        System.out.println("char is "+ c);
    }

    static void display(int i){
        System.out.println("int is "+ i);
    }

    static void display(char c, int i){
        System.out.println("int is "+ i +" and char is "+c);
    }
}
