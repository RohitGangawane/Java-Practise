import java.io.*;
public class Revstr {
    public static void main(String[] args) {
        Console c = System.console();
        String str = c.readLine("Enter String");
        String rev="";
        
        for (int i = str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
            
        }
        System.out.println(rev);
    }
}