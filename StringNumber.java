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
public class StringNumber {
    public static void main(String args[]){
   int i,j,x=0;
   String str="This is 5099 and 45",sr="";String b[] = new String[str.length()];
   
   
   int n=str.length();
    for(i=0;i<n;i++){
  System.out.println("");
  }
  for(i=0;i<n;i++){
  for(j=n-1;j>i;j--){
     
  if(str.charAt(i)>=48 && str.charAt(i)<=57 && str.charAt(j)>=48 && str.charAt(j)<=57){
      
  for(int k =i;k<=j;k++){
      
  sr=sr+str.charAt(k);
  if(num(sr))
   b[x]=sr;
  }

  x++;
  sr="";
 
  }
  
  }
 
  }
  for(i=0;i<n;i++){
     
  //System.out.println(b[i]);
  }
  String max = b[0];
  
      
          for (j = 0; j< n; j++) {  
          
           if(b[j].length() > max.length())  
               max = b[j];  
        }
          System.out.println(max);
  }
    
   static boolean num(String str){
   boolean a=false;
   int n = str.length();
   for(int i=0;i<n;i++){
    if(str.charAt(i)>=48 && str.charAt(i)<=57){
    a=true;}
    else{
            a=false;
            break;
            }
    
   }
   
   
   return a;
   }
    }

