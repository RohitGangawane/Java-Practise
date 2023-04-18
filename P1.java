import java.io.*;

public class P1 {
    
    public static void main(String[] args) {
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter array length"));
       double arr[] = new double[num];
        int zero = 0, positive = 0,negative = 0;
        for (int i = 0; i < arr.length; i++) 
            arr[i] = Integer.parseInt(c.readLine("eNTER nuMBER"));
        
        for (double j : arr) {
            if (j == 0) {
                zero++;
            }
            if (j > 0) {
                positive++;
            }
            if (j < 0) {
                negative++;
            }
            else {
                System.out.println("Invalid Input");
            }
        }
        System.out.println("Zeros "+zero);
        System.out.println("Positives "+positive);
        System.out.println("Negatives "+negative);
           
       

    }
    
}
