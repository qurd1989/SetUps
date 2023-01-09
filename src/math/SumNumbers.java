package math;

public class SumNumbers {

    public static void main(String[] args) {


        int humanYears = 1;

     humanYearsCatYearsDogYears(humanYears);


    }



    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int dog = 0;
        int cat = 0;
        if (humanYears >= 1) {
            dog += 15;
            cat += 15;
            System.out.println(dog);
            System.out.println(cat);
        }
        if (humanYears >= 2) {
            dog += 9;
            cat += 9;
            System.out.println(dog);
            System.out.println(cat);
        }
        if (humanYears > 2) {
            dog += 5 * (humanYears - 2);
            cat += 4 * (humanYears - 2);
            System.out.println(dog);
            System.out.println(cat);
        }
        return new int[]{humanYears,cat,dog};
    }


}
