import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Employee implements Serializable {
   
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    } 
    public int getEmpId(){
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args){
        Employee emp1 = new Employee(101,"Yogita");
        Employee emp2 = new Employee(102,"Rohit");
        String filename = "employees.txt";
        try {
         FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
          oos.writeObject(emp1);
          oos.writeObject(emp2);
          System.out.println("Employees serialized Successfully!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}