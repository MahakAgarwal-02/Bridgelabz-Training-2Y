package ElementaryCoding;

import java.util.Scanner;
public class isEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
         int n = sc.nextInt();
 
         if(n%2==0){
             System.out.print("Even");
         }
         else{
             System.out.print("Not even");
         }
}}