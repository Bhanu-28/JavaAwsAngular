package Algorithms.ArraysDsa;
import java.util.Scanner;
public class InsertArray{
    //User want the function to create  array of user size input
    //user want to take elements from user
    // a function  to insert elements
    //user should specify position and value to replace
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("array created of capacity  :"+n);
        System.out.println(" the current size is ? :");
        int cs = sc.nextInt();
        System.out.println("current size of array is :"+cs);
        for(int i=0;i<cs;i++){
            System.out.println("enter the "+i+"element");
            arr[i]=sc.nextInt();
            System.out.println("element "+i+"is inserted...");
        }
        System.out.println();
        System.out.println("array before insertion ");
        for(int i=0;i<cs;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int position = 2 ;
        int replacement = 18;

        int catcn = insert(arr,n,cs,replacement,position);
        System.out.println("array after insertion ");
        for(int i=0;i<catcn;i++){
            System.out.print(arr[i]+" ");
        }


    }
    static int insert(int[] arr,int n,int cursize,int rep,int pos ){
        if(cursize==n){
          return cursize ;
        }
        int index = pos - 1;
        for(int i = cursize-1;i>=index;i--){
            //suppose arr[3] = 20 now we copy that value to arr[4]=20
            //now arr[2] = 10 re-writes value of arr[3] = 20 to arr[3]=10
            arr[i+1] = arr[i];
        }
        arr[index] = rep;
        return cursize+1;
    }
}