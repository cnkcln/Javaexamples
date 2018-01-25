import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriterSerialIdexample {
    public static void main(String[] args) throws IOException {
    	EmployeeSerialId employee = new EmployeeSerialId();
        employee.setName("Ashintha");
        employee.setAge((byte) 30);
        employee.setAddress("Galle");
        FileOutputStream fout = new FileOutputStream("F://Prod/employee.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(employee);
        oos.close();
        System.out.println("Process complete");
    }
}