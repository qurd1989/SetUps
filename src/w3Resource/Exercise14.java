package w3Resource;

public class Exercise14 {

    public static void main(String[] args) {


        String  lineWithStars = "* * * * * =========================";
        String  onlyLine =      "===================================";


        for(int i = 0; i<8; i++) {
            System.out.println(lineWithStars);

        }
        for (int j  = 0; j<6; j++){
            System.out.println(onlyLine);
        }
    }
}
