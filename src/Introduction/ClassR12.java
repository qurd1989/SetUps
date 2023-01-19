package Introduction;

public class ClassR12 {


    int score;

    public  ClassR12(int score) {

        this.score = score;

    }



    public static void main(String[] args) {


        ClassR12[] A = new ClassR12[5];


        A[0] = new ClassR12(100);
        A[1] = new ClassR12(200);
        A[2] = new ClassR12(350);
        A[3] = new ClassR12(450);
        A[4] = new ClassR12(420);



        ClassR12[] B = A.clone();

        A[4].score = 550;

        System.out.println("B array value: " + A[4].score);

        System.out.println("B array value: " + B[4].score);



    }
}
