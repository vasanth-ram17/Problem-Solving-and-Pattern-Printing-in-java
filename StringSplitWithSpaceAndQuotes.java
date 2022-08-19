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
public class StringSplitWithSpaceAndQuotes {
    public static void main(String args[]){
    String s="abce ,S J Vasanth Ram, abc ,S G Jeevan Ram Babu, dhanush vasanth ,motor vandi daan mass uh, cycle car bus ";
  //  System.out.println(s);
    String sr="";
    int p=0,j=0;
    String arr[]=s.split(" ");
     for (int i=0;i<arr.length;i++) {
            if (','==(arr[i].charAt(0))) {
              j=i;p=0;
              while(arr[j].charAt(arr[j].length()-1)!=',')
              { sr=sr+arr[j]+" ";
              j++;p++;
              }
                
            } 
            
            else if(!"".equals(sr)){
               
                 System.out.println(sr+arr[j]);
                 sr="";
                 i=i+p-1;
                }
            else{
                System.out.println(arr[i]);}
            }
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*for(int i=0;i<arr.length;i++){
       arr[i]="";
    }
    for(int i=0;i<=21;i++){
    sr="";
    
    if(s.charAt(i)==' '){
    for(int j=n;j<i;j++){
    sr=sr+s.charAt(j);
    }
    n=i;
    arr[p]=sr;
    p++;
    }
    
    
    else if(s.charAt(i)==','){
        for(int j=i+1;s.charAt(j)==',';j++){
        sr=sr+s.charAt(j);
        }
        sr=sr+',';
        arr[p]=sr;p++;
    }   
    else{
         }
    
    }
        for (String arr1 : arr) {
            if ("".equals(arr1)) {
                break;
            } else {
                System.out.println(arr1);
            }
        }*/
    }
}
