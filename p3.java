import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i =0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        int max=arr[0], min=arr[0];

        for(int num: arr){
            max = (num>max) ? num: min;
        }
        System.out.println("Max: " +max);
        System.out.println("Min: " +min);
    }
}
