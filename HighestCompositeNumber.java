/*a
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author U S E R
 */
public class HighestCompositeNumber {
   
 
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the range : ");
    int n = input.nextInt();
    int n1=n;
    int m = input.nextInt();
    int i,j,count =0;
    int arr[]= new int[m-n];
    int b =m-n;

    for(i=0;i<b;i++){
      for(j=1;j<=n;j++){
        if(n%j==0){
          count++;
        }
        
      }
      
      n++;
      
      arr[i]=count;
       
      count=0;
     
    }
   
  int max=index(arr);
  System.out.println("The number with highest no of factors is : ");
  System.out.println(n1+max);
  }
  
  public static int index( int[] arr )
{
  if ( arr == null||arr.length == 0 ) return -1; 
  int l = 0;
  for ( int i = 1; i < arr.length; i++ ){
    if(arr[i] > arr[l] ){
          l = i;}
  }
  return l;
}

}
    
    
   
