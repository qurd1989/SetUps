package string;

public class EvenWords {
    public static void main(String[] args) {

        String s = "Elmar a run to me with Lover";
        String s1 = "Zibaaa";
        int index = 4;
        System.out.println(solve2());
        System.out.println(insert(s, s1,index));
    }

    static void solve(String s){

        for (String words: s.split(" ")){
            if (words.length() % 2 == 0) {
                System.out.println(words);
            }
        }
    }
    static String insert(String s, String toBeInserted, int index) {

        String newString;

             newString = s.substring(0,index+2) + toBeInserted + s.substring(index +1);

            String ds=  s.substring(2);
        System.out.println(ds);
             return newString;
    }
    static  String solve2(){
     byte e[] = {7,34,41,54,67};
     String s = new String(e);
     return s;
    }

}
