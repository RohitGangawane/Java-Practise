import java.io.*;
public class Fibonacci {

    public static void main(String args[]){
        Console c =System.console();      
     Integer n =Integer.parseInt(c.readLine("Enter Number"));
        int firstNum = 0, secondNum = 1, nextNum = 0;

        if (n > 0) {
         
            if (n == 1) {
                System.out.println(firstNum);
            } else {
                System.out.println(firstNum);
                System.out.println(secondNum);
          }
           
         
            for (int i = 3; i <= n; i++) {
             
                nextNum = firstNum + secondNum;
                System.out.println(nextNum);
                firstNum = secondNum;
                secondNum = nextNum;
            }
        } else {
            System.out.println("invalid Number");
        }
        
       

    }
    
}
