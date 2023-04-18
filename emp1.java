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
public class emp1 {
    public static void main(String[] args) {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter Number of employee"));
        Employee data[] = new Employee[n];

        for (int i = 0; i < data.length; i++) {
            int id = Integer.parseInt(c.readLine("Enter ID"));
            String name = c.readLine("Enter name");
    
            double Salary = Double.parseDouble(c.readLine("Enter Salary"));
            data[i] = new Employee(id, name, Salary);
           
        }
          for(Employee e:data)
          {
             e.show();
            System.out.println(" Monthly Tax: "+e.tax()); 
       }
    
       

    }
    
}



