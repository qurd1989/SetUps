package demo1;

public class FindMaxNumber {

    public static void main(String[] args) {



        int[] list = {1,23,5,6,7,84,45,56,-37854857};

        System.out.println(max(list));

        System.out.println(min(list));
    }

    static int max(int[] list) {

        int max = list[0];

        for (int i = 0; i < list.length; i++) {

            if (list[i] > max) {

                max = list[i];

            }
        }
        return max;
    }

    static int min(int[] list) {

        int  min = list[0];

        for (int i = 0; i < list.length; i++) {

            if (list[i] < min) {

                min = list[i];

            }
        }
        return min;
    }
}
