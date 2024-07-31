package thread2;

import java.util.HashMap;

public class ScalerCreator extends Thread{
    public static HashMap<String, String> map = new HashMap<>();
    private String target;

    ScalerCreator(Runnable r){
        super(r);
        target = r.getClass().getName();
    }

    @Override
    public void start() {
        super.start();
        map.put(target, this.getName());
    }
}


