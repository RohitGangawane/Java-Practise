import java.io.Console;


 class Employee {
    private int id;
    private String name;
    private double Salary;


    public  Employee(int id, String name, double Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }

    public void show() {
        System.out.println("ID= " + id);
        System.out.println("NAME= " + name);
        System.out.println("SALARY= " + Salary);
    }

    public double tax() {
        if (Salary > 500000) {
            
            return Salary * 0.10;
        } else {
            return Salary*0.05;
        }
    }
}
public class emp {
    public static void main(String[] args) {
        Console c = System.console();
        int id = Integer.parseInt(c.readLine("Enter ID"));
        String name = c.readLine("Enter name");
        double Salary = Double.parseDouble(c.readLine("Enter Salary"));
        Employee e1 = new Employee(id, name, Salary);
        e1.show();
      System.out.println(" Monthly Tax: "+ e1.tax()); 

    }
    
}
