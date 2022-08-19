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
public class MaximumContiguosArray {
    public static void main(String artgs[]){
    int arr[]={-6,5, -7 ,-3, -5, -13};int sum=0,max = 0;
    int n=arr.length;
    for(int i = 0; i<n; i++) {
        sum += arr[i];
        if(sum < 0) {
            sum = 0;
        }
        //max = Math.max(sum,max);
        max=max>sum?max:sum;
    }
    System.out.print(max);
}
}