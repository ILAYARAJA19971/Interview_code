import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int arr[]=new int[sc.nextInt()];
        for(int k=0;k<arr.length;k++){
            arr[k]=sc.nextInt();
        }
        for(int i=1;i< arr.length;i++) {
            if(arr[i] < arr[i-1])
            {
                arr[i]=arr[i]+arr[i-1];                
                arr[i-1]=arr[i]-arr[i-1];                
                arr[i]=arr[i]-arr[i-1];               
                i=0;
            }
        }        
        for(int k=0;k<arr.length;k++){
            if(!(arr[k]==arr[k+1] && k!=arr.length)){
                System.out.println(arr[k]+1);
            }
        }
    }
}
