package demo1;

public class SwitchItUp {


    /*
    * When provided with a number between 0-9, return it in words.
    * Input :: 1
    * Output :: "One".
    * */

    public static void main(String[] args) {

        int num  = 6;

        System.out.println(switchItUp(num));

    }


    static  String switchItUp(int num)  {

        String strNum;

        switch (num) {

            case 0:
                strNum = "Zero";
                break;

            case 1:
                strNum = "One";
                break;


            case 2:
                strNum = "Two";
                break;

            case 3:
                strNum = "Three";
                break;



            case 4:
                strNum = "Four";
                break;


            case 5:
                strNum = "Five";
                break;

            case 6:
                strNum = "Six";
                break;

            case 7:
                strNum = "Seven";
                break;

            case 8:
                strNum = "Eight";
                break;

            case 9:
                strNum = "Nine";
                break;

            default:

                strNum = "Not Valid Number";

        }

        return strNum;

    }
}
