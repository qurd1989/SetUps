package arrays;

public class hello {

    public int roll_no;
    public String name;


    hello(int roll_no, String name){

        this.roll_no = roll_no;
        this.name = name;

    }

    public static void main(String[] args) {


        hello[] arr;

        arr = new hello[5];


        arr[0] = new hello(1,"Elmar");
        arr[1] =  new hello(2, "Mindish");
        arr[2] = new hello(3, "Zibish");

        for (int i = 0; i < arr.length; i++){

            System.out.println("Element at index " + i + " : " + arr[i].roll_no + " " + arr[i].name);

        }



    }
}
