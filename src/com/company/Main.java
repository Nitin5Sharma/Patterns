package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
 Scanner sc=new Scanner(System.in);
 long n=sc.nextInt();

 for (int i=1; i<=n; i++){
     for(int j=1; j<=n+1; j++){
         if(i==1 || j==1 || i==n || j==n+1){
             System.out.print("*");
         }
         else {
             System.out.print(" ");
         }
     }
     System.out.println();
 }

}}
