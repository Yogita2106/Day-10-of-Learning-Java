import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class EmployeeDeserialization {
    public static void main(String[] args){
       String filename = "employees.txt";
       try {
           
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee emp1 = (Employee) ois.readObject();
            Employee emp2 = (Employee) ois.readObject();
            System.out.println("Employee id:"+emp1.getEmpId());
           System.out.println("Employee name:"+emp1.getEmpName());
           System.out.println("Employee id:"+emp2.getEmpId());
           System.out.println("Employee name:"+emp2.getEmpName());
            fis.close();
            ois.close();

       }catch(IOException e){
        e.printStackTrace();
       }catch(ClassNotFoundException e){
        e.printStackTrace();
       }
            
}
}