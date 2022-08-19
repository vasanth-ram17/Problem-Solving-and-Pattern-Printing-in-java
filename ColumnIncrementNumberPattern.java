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
public class ColumnIncrementNumberPattern {
    public static void main(String args[]){
    int n =5;int temp=n-1,c=1;
    for(int i=1;i<=n;i++){
         temp=n-1;
         c=i;
    for(int j=1;j<=i;j++){
    System.out.print(c+" ");
    
    c=c+temp;
   
    temp--;
    }
    
    System.out.println();
    }
    }
}
