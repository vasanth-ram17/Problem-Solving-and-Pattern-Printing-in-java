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
public class IntegerReverse {
  public static void main(String args[]){
  
     int n =9876543,a=n,i=1,b,c=n-(n%10),m=0,s=0,x;
     String s1 = Integer.toString(n);String c1 ="";
     for(int j =s1.length()-1;j>=0;j--){
     c1=c1+s1.charAt(j);
     }
     System.out.println(c1);
     for(int j =1;j<n;j=j*10){
     a=a/10;i++;
     }
     x=i-1;
     //System.out.println(x);
     int arr[] = new int[x];  
     
     i=0;
    
    for(int j =1;j<n;j=j*10){
        b=10; 
     while(a>b){
     a=a/10; i++; //System.out.println("i : "+i);
     if(a<b){
         
     break;}
     
     }
     arr[m]=a;
     m++;
     
     for(int k =1;k<i;k++){
    b=b*10;
    //System.out.println("b : "+b);
    } 
     c=c-(a*b);
    
     a=c;i=0;
  }
    b=(int) Math.pow(10, x-2);
    
    for(int j =m-1;j>=0;j--){
        
    s=s+arr[j]*b;
    b=b/10;
    }
    b=(int) Math.pow(10, x-1);
    System.out.println(s+(n%10)*b);

  

  }
}
