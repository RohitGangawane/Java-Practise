import java.io.*;//factorial using recursion
public class facto { 

    public static long factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Console c =System.console(); 
        int num =Integer.parseInt(c.readLine("Enter factorial Number "));

       
            System.out.println(factorial(num));
      
    }
}
