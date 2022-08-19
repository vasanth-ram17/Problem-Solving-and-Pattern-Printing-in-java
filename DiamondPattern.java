
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
public class DiamondPattern {
    public static void main(String args[]){
   int i, j, row;       
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the no of rows : ");
   row = input.nextInt();
   int a=row-1;
   System.out.println();
   for(i=0;i<row;i++){
   for(j=(row-i);j>=0;j--){
   System.out.print(" ");
   }
    for(j=1;j<=i+1;j++){
    System.out.print(" *");
    }   
    System.out.println();
   }
 
   for(i=0;i<row;i++){
   for(j=row-1;j>=row-i-3;j--){
   System.out.print(" ");
   }
    for(j=row-1;j>i;j--){
    System.out.print(" *");
    }   
    System.out.println();
   }


    }
}
