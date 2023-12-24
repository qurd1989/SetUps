package playGround;

import java.util.Scanner;

public class Shell {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int shellAtPos[] = new int[n];

        for (int i = 0; i < n; i++) {
            shellAtPos[i] = i;
        }
        int counter[] = new int[3];
        for (int i = 0; i < n; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int g = sc.nextInt()-1;
            int temp = shellAtPos[b];
            shellAtPos[b] = shellAtPos[a];
            shellAtPos[a] = temp;

            counter[shellAtPos[g]]++;
        }
        System.out.println(Math.max(counter[0],Math.max(counter[1], counter[2])));
    }
}
