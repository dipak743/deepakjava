
import java .util.Scanner;
public class Print {
    public static void main(String[] args) {
        System.out.println("enter the number");
        int arr[]={2,3,4,5,6,7,8};
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]==a)
        {
            System.out.println(i);

        }
       
       
       }
       for(int n:arr)
       {
           if(n==a)
           {
               System.out.println("element  found");
           }
           else
           {
            System.out.println("element doesnot found");

           }
       }
    }
}
