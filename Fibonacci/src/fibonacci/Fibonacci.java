package fibonacci;

import java.util.Scanner;

public class Fibonacci {

 static int n1=0,n2=1,n3=0;    
 public static void fibo(int n){    
    if(n>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         fibo(n-1);    
     }    
 }    
 public static void main(String args[]){    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();   
    System.out.printf("%d %d ", n1, n2);   
    fibo(n-2);  
     System.out.println("");
 }
}
