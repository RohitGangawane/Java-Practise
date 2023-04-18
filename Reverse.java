import java.io.*;
public class Reverse { 

    public static void rev(int number) { 
                              
        if (number < 10) {
        System.out.print(number);
    } else {
        System.out.print(number % 10);
        rev(number / 10);
        
      };
       
            
         
          
            
           
         
       

    }
  
    public static void main(String[] args) {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter Number"));
        rev(n);
    }
    
}
