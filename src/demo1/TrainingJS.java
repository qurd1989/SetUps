package demo1;

public class TrainingJS {


    public static void main(String[] args) {



        int m = 10;

        System.out.println(saleHotdogs(m));
    }



    public static int saleHotdogs(final int n){
        // show me the

        int moneySpent = 0;
        if(n < 5) {
            moneySpent = 100 * n;

        }else if(n >= 5 && n < 10) {

            moneySpent =  95 * n;

        }else{

            moneySpent = 90 * n;
        }
        return moneySpent;
    }


}
