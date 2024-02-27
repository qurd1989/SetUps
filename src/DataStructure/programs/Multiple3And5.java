package programs;

public class Multiple3And5 {

    public static void main(String[] args) {

        int  mod =0;
        for (int i = 1; i < 1000; i++){
            if (i % 3 ==0 || i % 5 ==0){
                System.out.println(i);
                mod++;

            }
        }
        System.out.println(mod);
    }
}
