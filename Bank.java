import java.io.*;
import java.util.*;
public class Bank { 
    public static void main(String args[]){
        Console c = System.console();
        String str = c.readLine("Enter Palindrome to check ");
      
        StringBuilder sttr = new StringBuilder(str);
     
       
        String newstr = sttr.reverse().toString();
       
        System.out.println("reverse string is"+newstr + "Original String is "+str);

        if (str.equals(newstr)) {
            System.out.println(str+" It is A palindrome ");
        }else{
            System.out.println("It is not a palindrome ");
        }
        

      
    }

  
}
