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
public class Denominations {
    
 public static void main(String args[]){
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the amount you have to withdraw : ");
 int amount = input.nextInt();
 int flag=amount;
       int c1=0,c2=0,c3=0,c4=0;
      
      while(flag>=10){
      flag=flag/10;
      }
       
     while(amount>0){  
        
   if(amount%2000>500 || amount>=4000  ) {
       if(amount>=2800) {
    while(amount>=2000){
        
            c1=c1+1;
    amount=amount-2000;
  
   if(amount<=2800){
    if(amount%2000<=700 && amount%2000!=0){
        
    break;
        
    }
   
    if((amount<=2000 && flag%2==0 )||(amount<=2000 && flag%2==1)){
       
    break;
    }
    
    }
    }}
   
   } 
   
  
  if(amount>700){
    while(amount>=500){
    c2=c2+1;
    
    amount=amount-500;
    
    if(amount<=700){
    break;
    }
    
    }}
    
    
     while(amount>=100){
    c4=c4+1;
    amount=amount-100;
    break;
   }
 
 
         while(amount>=200){
    c3=c3+1;
    amount=amount-200;
    
    
    }
 
  
    }
  
   if(c1>0){
    System.out.println(2000+"*"+c1);}
   if(c2>0){
    System.out.println(500+"*"+c2);}
   if(c3>0){
    System.out.println(200+"*"+c3);}
   if(c4>0){
    System.out.println(100+"*"+c4);}
 
    
    }
 }   

