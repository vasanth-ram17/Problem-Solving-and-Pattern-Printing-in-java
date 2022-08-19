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
public class DiamondSqaureNumberPattern {
    public static void main(String args[]){
        int n=5,i,j,k;
        
        System.out.print(" ");
    for(i=1;i<=n;i++){
        
    for(j=n-i;j>=0;j--){

          System.out.print(" ");
       
    }
       for(k=n;k>=n-i+1;k--){
           
       System.out.print(i*i+" ");
       }
   System.out.println();
   if(i<3){
   System.out.print(" ");
   }
    }
    
 
    System.out.print(" ");
     for(i=n;i>0;i--){
        
    for(j=n;j>=i;j--){
        
   System.out.print(" ");
       
    }
       for(k=n;k>=n-i+2;k--){
           
       System.out.print(i*i-i+" ");
       }
      
   System.out.println();
         System.out.print("  ");
    }
    
    }
}
