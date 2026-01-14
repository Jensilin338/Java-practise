import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your array: ");
        int n = sc.nextInt();

        int[] arr= new int [n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int sum=0;
        for(int num: arr){
            sum+=num;
        }
        System.out.println("Sum of arrays:"+sum);
        double avg=(double)sum/n;
         System.out.println("Average of arrays:"+avg);
    }
}
