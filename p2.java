import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter the array elements:");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to count");
        int x = sc.nextInt();
        int count=0;
        for(int num:arr){
            if(num==x) count++;
        }
        System.out.println("Occurences of "+x+"="+count);
    }
}
