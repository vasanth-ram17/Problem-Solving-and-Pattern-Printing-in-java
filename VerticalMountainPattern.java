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
public class VerticalMountainPattern {
    public static void main(String args[]){
    int i,j,a,b,k;
    System.out.print("Enter the input : ");
    Scanner input = new Scanner(System.in);
    a=input.nextInt();
    b=a;
    for(i=1;i<a;i++){
        for(j=a;j>b;j--){
        System.out.print(" ");
        }
   for(j=i;j<=a;j++){
   System.out.print(j);
   }
  
   b--;
   System.out.println();
    }
    b=a;
    for(i=1;i<=a;i++){
        
        for(k=1;k<b;k++){
        System.out.print(" ");
        }
    for(k=b-1;k>a-i;k--){
    System.out.print(k);
      for(j=k+1;j<=a;j++){
      System.out.print(j);
      }
   
    }
    b--;
    System.out.println();
    }
    }
    }

