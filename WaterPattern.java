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
public class WaterPattern {
    public static void main(String args[]){       
    String str="vasanth";
    int n = str.length();
    for(int i=1;i<=n;i++){
  
    for(int j=1;j<=n;j++){
        if(i==((n/2)+1)){
        System.out.print(str.charAt(j-1)+" ");
        
        }
        else if((j-1)==(i-1) || j==n-(i-1) || j==((n/2)+1) ){
        System.out.print(str.charAt(i-1)+" ");
    }
        else{
        System.out.print("  ");
        } 
    }
    System.out.println();
    }}
}
