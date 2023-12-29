package playGround;

import java.util.Random;

public class RandZeroSixUniform {

    public static void main(String[] args) {
        int n = 10;
//        int random = Rand06Unifrom();
//        System.out.println(random);
        System.out.println(sovle(n));
    }
    public  static int rand01Uniform(){
        Random random = new Random();
        return random.nextInt(2);
    }
    public static int Rand06Unifrom(){
        int result  = 0;
        for (int i =0; i < 3; i++) {
            result = 2 * result + rand01Uniform();
        }
        return result;
    }

    public static int sovle(int n){
        int x = -1;
        int k =0;
        if (n == 1) {
            return 1; // Or some other appropriate base value
        }
        for (int i = n; i >=1; i/=2){
            while(sovle(x+i) < sovle(x+i+1)){
                x +=i;

            }
             k = x+1;
        }
        return k;
    }

}
