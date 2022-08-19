
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author U S E R
 */
public class BreakingAndDecrementingNoPattern {
    public static void main(String args[]){
    int i,k,j,a,b;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the input : ");
     a= input.nextInt();
     for(i=0;i<a+2;i++){
      System.out.print(" ");
     }
       System.out.println(1);
     for(i=1;i<a;i++){
          for(j=a-i;j>=0;j--){

          System.out.print(" ");
       
    }
     for(k=1;k<=i;k++){
     System.out.print(k+" ");
     }
     for(j=k;j>=i;j--){
     System.out.print(j+" ");  
     }
     for(b=j;b>=1;b--){
     System.out.print(b+ " ");
     }
     System.out.println();
     }
     /**b=a;
     for(i=1;i<=a;i++){
     for(k=1;k<=b;k++){
     System.out.print(k);
     }
     b--;
     System.out.println();
     }*/
            }}
