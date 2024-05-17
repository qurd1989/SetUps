package thread1;

public class Adder implements Runnable{
    private int a;
    private int b;

    public Adder(int a, int n){
        this.a = a;
        this.b = b;
    }
    @Override
    public  void run(){
        System.out.println(a + b);
    }

}
