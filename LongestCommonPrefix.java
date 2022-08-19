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
public class LongestCommonPrefix {
   public static void main(String args[])
    {
        String Str[]={"ramesh","ramu","rama","ramana","ramar"};
        
      int f=0;
      
        String sr1 ,sr=Str[0];   

            for(int j=sr.length();j>0;j--)
            { 
                sr1=sr.substring(0,j);
                    
                for(int k=1;k<Str.length;k++)
                {
                   if(j>Str[k].length()){
                       
                      j=Str[k].length();
                   
                   }
                   if(sr1.equals(Str[k].substring(0,j))){
                    
                   f++;
                  
                   }
                   else{
                   f--;
                  
                   }
                {
                   
                }  
                }
                if(f==Str.length-1){
                    
                   System.out.println(sr1);
                   break;
                
                }
                else{
                  f=0;
                }
               
               
            }
        

    } 
}
