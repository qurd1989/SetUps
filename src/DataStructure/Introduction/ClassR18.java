package Introduction;

public class ClassR18 {


    public static void main(String[] args) {


        String str = "Elmnar";

        System.out.println(countVowels(str));

    }

    static int countVowels(String str){

        int count =0;


        for (int i = 0 ; i <str.length(); i++){


            str = str.toLowerCase();


            if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == '0'){



                count++;

            }
            else
                System.out.println("there no vowels: ");
        }

        return count;

    }
}
