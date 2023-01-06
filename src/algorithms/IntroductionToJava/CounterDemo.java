package IntroductionToJava;

public class CounterDemo {
    private  int count;

    public  CounterDemo() {


    }
    public  CounterDemo(int initial) {


        count =initial;

    }
    public int getCount(){

        return count;

    }
    public void increment(){

        count++;

        System.out.println(count);
    }
    public  void increment(int delta) {

        count += delta;

        System.out.println(count);

    }

    public void reset() {

        count =0;

    }

    public static void main(String[] args) {

        CounterDemo c;

        c = new CounterDemo();
        c.increment();

        c.increment(3);


        int temp = c.getCount();
        c.reset();

        CounterDemo d = new CounterDemo(5);

        d.increment();

        CounterDemo e = d;

        temp = e.getCount();

        e.increment(2);




    }
}
