import java.io.*;//fibonacci number using recirsion
public class Fib { 

    public static int fib(int n){
        if(n==0){
            return 0;
        }if(n==1||n==2){
            return 1;
        }
        return fib(n-2)+fib(n-1);
    }
    public static void main(String[] args) {
        Console c =System.console(); 
       int num=Integer.parseInt(c.readLine("Enter NUmber For getting fibonacci series")); 
       for (int i = 0; i < num; i++) {
            System.out.println(fib(i));
        }
    }
}
