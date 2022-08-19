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
public class SumOfLeaders {
    public static void main(String args[]){
    int a[]={52,66,64,36,45,24,32};
    int n = a.length;int max=a[n-1],sum=0;
    for(int i =n-2;i>1;i--){
    sum=sum+max;
    System.out.println(sum);
     System.out.println(max);
    if(max<a[i+1]){
    max=a[i+1];
    }
    }
    System.out.println(sum);
    }
}
