
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author U S E R
 */
public class LookAndSayPattern {
    static String countAndSay(int n)
    {
    if(n == 1){ 
        return "1";
    }
    if(n == 2){
        return "11";
    }
    String str = "11";
    for (int i = 3; i <= n; i++)
    {
       str += ' ';
        int len = str.length(), cnt = 1; 
        String tmp = ""; 
        char []arr = str.toCharArray();
        for(int j = 1; j < len; j++)
        {
            if(arr[j] != arr[j - 1])
            {    
                tmp += cnt ;               
                tmp += arr[j - 1];
                cnt = 1;
            }
            else{
                cnt++;}
        }
        str = tmp;
    }
    return str;
    }
     
    public static void main(String[] args)
    { 
        Scanner input = new Scanner(System.in);
     System.out.println("Enter the no of rows you need : ");
        int N = input.nextInt();
        for(int i=1;i<=N;i++){
        System.out.println(countAndSay(i));
        
        }
    }
    }

