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
public class TwoArraySort {
    public static void main(String args[]){
     int a[]={3,7,2,1,3};
     int b[]={6,7,1,4,5};
     int c[]= new int[a.length+b.length];int x=0,tmp;
     for(int i=0;i<c.length;i++){
     if(i<a.length){
     c[i]=a[i];
     }
     else{
     c[i]=b[x];
     x++;
     }
     }
     
     
     for(int i=0;i<c.length;i++){
         for(int j=i+1;j<c.length;j++){
         if(c[i]>c[j]){
         tmp=c[i];
         c[i]=c[j];
         c[j]=tmp;
         }
         }
     }
    
     
  
     for(int i =0;i<c.length;i++){
         
     System.out.print(c[i]+" ");
     }
     
     System.out.println();
     
     for(int i=0;i<c.length-1;i++){
        
     if(c[i]==c[i+1]){
         continue;
     }
    
         System.out.print(c[i]+" ");
     
     }
      System.out.print(c[c.length-1]+" ");
    }
}
