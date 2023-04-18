import java.io.*;
public class P2 {
    public static void main(String[] args) {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter number of inputs"));
        String str[] = new String[n];
        
        for (int i = 0; i < str.length; i++) {
            str[i] = c.readLine("Enter Names");
        }
        for (String name : str){
            if(name.equals("Rohit")){
                System.out.println("Hello boss");
            }
            //  System.out.println(name);
        }
        
    }
}
