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
public class NumberPatternWith3 {
    public static void main(String args[]){
    int n =7,i,j,c;
    for(i=1;i<=n;i++){
        c=3;
    for(j=1;j<=i;j++){
        if(i%2==0&&j==1){
        System.out.print(j+" ");
        
        }
        else if(i%2==0 && j==2){
        System.out.print(j+1+" ");
        
        }
        else if(i%2==0 && j>2){
              System.out.print(j+c+" ");
              c=c+2;
        }
        else{
    System.out.print(j+" ");}
    }
    System.out.println();
    }
    }
}
