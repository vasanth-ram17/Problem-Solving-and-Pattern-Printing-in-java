/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

/**
 *
 * @author U S E R
 */
public class PrimeNumberOTP {
    public static void main(String args[]){
     int n=10,m=19,f=0,x=0;
     int a[]= new int[m-n];
     for(int i=0;i<a.length;i++){
     a[i]=0;
     }
     for(int i=n;i<=m;i++){
         if(i==1){
         continue;
         }
     for(int j=1; j <= i; j++) {
         if(i % j == 0){
             f++;
            
         }

     }
     
     if(f <= 2) {
       a[x]=i;
       x++;
     }
    f=0;
     }
     int max=a[0],min=a[0];
     for(int i=0;i<a.length;i++){
     if(a[i]==0){
     continue;
     }
     
     if(a[i]>max){
     max=a[i];
     }
     if(a[i]<min){
     min=a[i];
     }
   
     }
   
      System.out.println("The OTP is : "+(max+min)+" ");
    
    }
}
