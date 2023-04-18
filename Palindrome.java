import java.io.Console;

import java.io.*;
public class Palindrome {
    public static void main(String[] args) {
        Console c = System.console();
        String str = c.readLine("Enter String");
        String rev="";
        for (int i = str.length() - 1; i >=0; i--) {
            rev = rev + str.charAt(i);
        }
        // System.out.println(rev);
        if (str.equals(rev)) {
            System.out.println("It Is A Palindrome");
        } else {
            System.out.println("Not a Plaindrome");
        }
    }
}
