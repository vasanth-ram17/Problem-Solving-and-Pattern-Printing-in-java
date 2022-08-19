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
public class NumberPatternWithAlternateStars {
    public static void main(String args[])
    {
    int i,j,n=5;
    for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        if((j%2!=0 && i%2==0 )|| (j%2==0 && i%2!=0)){
        System.out.print("* ");
        }
        else{
    System.out.print(j+" ");}
    }
    System.out.println();
    }
        
        
    }}
