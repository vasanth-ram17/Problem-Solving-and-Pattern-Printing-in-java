/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author U S E R
 */
public class SandClockNumberPattern {
   public static void main(String args[]){
   int i,j,a,b;
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the input : ");
   a = input.nextInt();
   b=a;
   for(i=0;i<a-1;i++){
   for(j=0;j<=i;j++){
   System.out.print(" ");
   }
   for(j=i+1;j<=b;j++){
   
   System.out.print(j+" ");
   
   }
   
   System.out.println();
  
   }
   
   
   b=a;
 
          for(i=1;i<=a;i++){
   for(j=b;j>0;j--){
       
   System.out.print(" ");
   }
   for(j=b;j<=a;j++){
   System.out.print(j+" ");
   
   }
   b--;
   System.out.println();
   
   }
}}
