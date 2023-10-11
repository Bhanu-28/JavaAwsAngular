package Algorithms.ArraysDsa;

public class SearchArray {
    public static void main(String[] args){
        int[] arr1 = {10,80,70};
        int n = 3;
        int x  = 90;
        int result =  searchElement(arr1,n,x);

        if(result!=-1){
            System.out.println("element at given index :"+result);

        }else{
            System.out.println(x+" element not found in given array ");
        }
    }
    public static int searchElement(int[] arr, int n, int x){
        for(int i =0;i<n;i++){
            if(arr[i]==x){
                return i ;
            }
        }
       return -1;
    }
}
