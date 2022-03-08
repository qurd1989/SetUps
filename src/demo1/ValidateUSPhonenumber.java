package demo1;

import java.util.Scanner;

public class ValidateUSPhonenumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        System.out.println("Enter you phone number");

        int phoneNumber = sc.nextInt();

        for (int i = 1; i <= phoneNumber; i++) {
            System.out.print("+1");

            if (String.valueOf(phoneNumber).length() == 9) {
                System.out.print(  phoneNumber + ": Thanks you.");


            }else{
                System.out.println("Wrong number");



        }
            System.out.println();
            break;
        }

     /*String searchResultXpath = "//*[@id='accountTable']/table/tbody/tr
        List<WebElement> searchRuslt  = driver.findElements(By.xpath(searchResultXpath);

        int resultSize = searchResul.size();

        for (int i=0; i<resultSize; i++ ){
         System.out.println(searchResult.get(i).getText());
         }

      */
    }
}
