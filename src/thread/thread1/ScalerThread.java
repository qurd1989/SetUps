package thread1;

import java.util.HashMap;

public class ScalerThread extends Thread{
    public static HashMap<String,String> map = new HashMap<>();
    private  String target;

    ScalerThread(Runnable r) {
        super();
        target = r.getClass().getName();
    }
    @Override
    public void start(){
        super.start();
        System.out.println(map.put(target, this.getName()));
        super.start();
        System.out.println("Thread started: " + this.getName());
        System.out.println("Runnable class: " + target);
        System.out.println("Previous value in map: " + map.put(target, this.getName()));
    }

}
