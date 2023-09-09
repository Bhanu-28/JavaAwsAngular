package Algorithms;

public class PrintNtoOne {
    public static void main(String[] args) {
        int n = 6;
        Recursion(n);
    }
    static void Recursion(int n){
            if(n==0)
                return ;
        System.out.print(n+" ");
        Recursion(n-1);
    }
}

