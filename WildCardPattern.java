/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author U S E R
 */
public class WildCardPattern {
 static char a[],b[];
 static String s,p;
  public static void main(String args[]){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the string s : ");
                String s = input.next();
                System.out.println("Enter the string p : ");
                String p = input.next();
               WildCardPattern b1 = new WildCardPattern();
                int c = b1.isMatch(s,p);
                
     switch (c) {
         case 1:
             System.out.println("true");
             break;
         case 2:
             System.out.println("false");
             break;
         default:
             System.out.println("invalid");
             break;
     }
                
            }
        
     public int isMatch(String s, String p) {
        char a[]=s.toCharArray();
        char b[]=p.toCharArray();
        int a1=0,f=0;
        int n1=s.length();
        int n2=p.length();
       
        for(int i=0;i<n1;i++){
            
                if(a[i]==b[i] || b[i]=='?'){
                     a1 = 1;
                
                }
                    else{
                        a1=2;
                        break;
                    }
                }
       
            if(a1==2){
           int g=0;
            for(int i =0;i<n1;i++,g++){
               
               if(g<=n2-1){
                      
                if(a[i]==b[g] || a[i]=='?'){
                    a1=1;
                    
                            
                }
                else if(b[g]=='*'){
                    a1=1;
                     f =g;
                break;
                }
                else{
                    a1=2;
                    break;}
               }
            
            }
            
         
             if(a1==1 && n2!=1){
                     
               int k =n1-1,j=n2-1;
                                    

                   while(j>=f && k>=0){
                      
                   //System.out.print(a[k]+" "+b[j]+";");

                     if(a[k]==b[j] || a[k]=='?'){
                     a1=1;
                     j--;
                     
 
                     
                     
                     k--;
                     }
                     else if(j==0){
                     break;
                     }
                     else if(b[j]=='*'&& j>0 ){
                        j--;
                       //System.out.println(j);
                        while(a[k]!=b[j] && j>=0){
                        k--;
                        if(k==f || b[j]=='*'){
                        break;
                        }
                        }
                        
                         if(j==f){
                            
                      break;}
                     }
                    
                     else{
                         a1=2;
                     break;
                     }
                   }
               
               
            }
                
             
                    }
             return a1;
     }
                
     
     
     
    
     
     
     
     
     
     
     
     
     
           
        
        
        
        
        }

