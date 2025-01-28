class A{
    void show(){
        System.out.println("in A");
    }
}
class B extends A{
    void show(){
        System.out.println("in B");
    }

}
public class Main{
    public static void main(String[] args) {

        A a = new B();
        a.show();
        
    }

}




