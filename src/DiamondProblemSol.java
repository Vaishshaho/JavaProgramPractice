public class DiamondProblemSol {
    public static void main(String[] args){
     D obj = new D();
     obj.display();
    }
}

interface A{
    void  display();
}

interface B extends A {
    default void display(){
        System.out.println("Display from B");
    }
}

interface C extends A {
    default void display(){
        System.out.println("Display from C");
    }
}

class D implements B,C{
    public void display(){
        B.super.display();
        C.super.display();
    }

}

