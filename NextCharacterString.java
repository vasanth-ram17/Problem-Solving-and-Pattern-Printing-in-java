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
public class NextCharacterString {
    public static void main(String args[]){
    String str = "vasanth";String s="";
    int n =1,m;
    for(int i=0;i<str.length();i++){
       
    if(str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122 || str.charAt(i)>=48 && str.charAt(i)<=57){
    s = s+(char)(str.charAt(i)+n);
    }
    else{
    System.out.println("Invalid input");break;
    }
    }
    System.out.println(s);
    }
}
