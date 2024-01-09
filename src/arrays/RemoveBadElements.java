package arrays;

public class RemoveBadElements {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int n= a.length;
        System.out.println(badElements(a,n));

    }
    public static int badElements(int a[], int n){
        int max = 1;
        int count =1;
        for (int i = 0; i<n-1; i++){
            if (a[i] == a[i+1]){
                count++;
            }else
                count =1;
        }
        if (count>max){
            max =count;
        }
        int result = n -max;
        return result;
    }

}
