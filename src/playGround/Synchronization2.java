package playGround;

public class Synchronization2 {

    public static void main(String[] args) {
        Synchronization obj = new Synchronization();
        Thread1 p1 = new Thread1(obj);
        Thread2 p2 = new Thread2(obj);
        p1.start();
        p2.start();

    }
}

class Synchronization {
    synchronized void printPower(int n) {
        int temp = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()
            +": - " + n+ "^" + i + " value: " + n*temp);
            temp = n * temp;
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    Synchronization p;

    Thread1(Synchronization p) {
        this.p = p;
    }

    public void run() {
        p.printPower(5);
    }

}

class Thread2 extends Thread {
    Synchronization p;

    Thread2(Synchronization p) {
        this.p = p;
    }

    public void run() {
        p.printPower(8);
    }
}

