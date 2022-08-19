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
public class HollowDiamondPattern {
    public static void main(String args[]){
    int n=5,i,k,m=0;
    for(k=1;k<=(n*2)-1;k++){
        
    for(i=1;i<=(n*2)-1;i++){
        
        if(i==n+(k-1) || i==n-(k-1)){
        System.out.print(" *");
        }
       else if(k==n+(i-1)){
          
             System.out.print(" *");
            //System.out.print(k+" "+i);
        }
       else if(k==((2*n-i)+(n-1))){
        System.out.print(" *");
       }
      
            else{
             System.out.print(" ");
            }  
    }
    
   System.out.println(); 
    }
    
    
    
      
}}
