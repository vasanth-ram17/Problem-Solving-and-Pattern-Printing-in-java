/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;
import java.util.Scanner;
/**
 *
 * @author U S E R
 */
public class PalindromicSubstring {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String s = input.next();
    int x=0;
    String sr = "";
    int n = s.length();
    int m=(n*(n+1))/2;
    
    String b[] =new String[m];
    
   
    for(int i=0;i<m;i++){
    b[i]="";
    }
  int i,j;
  if(n!=1){
  for(i=0;i<n;i++){
      
  for(j=n-1;j>i;j--){
     
  if(s.charAt(i)==s.charAt(j)){
      
  for(int k =i;k<=j;k++){
      
  sr=sr+s.charAt(k);
  }
 //  System.out.println(sr);
  if(reverse(sr)){
 
  b[x]=sr;
  x++;
  i=i+sr.length()-1;
  sr="";
  }
  else{
  sr="";
  }
  
  
  }
  
  }
 
  }
  
  }
  else{
  System.out.println(s);
  }
 // String max = b[0];
  
      
          for (j = 0; j< m; j++) {  
            if("".equals(b[j])){
            break;
            }
           System.out.println(b[j]);
           //i=i+b[j].length();
        }  
         
 /* if("".equals(max)){
  System.out.println("No palindromice strings available");
  }    
  else{
    
  System.out.println(max);}*/

    }


    static boolean reverse(String sr){
        boolean a=false;
  String s1="";
  for(int m=sr.length()-1;m>=0;m--){
  s1=s1+sr.charAt(m);
  }
  if(s1.equals(sr)) {
  a=true;
  }
   
  
   return a;
    }
    
    
 
}