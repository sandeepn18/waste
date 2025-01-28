class A extends Thread{
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class Main{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        b.start();

      
        
    }

}




