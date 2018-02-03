package com.samples;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderSerialVersionIdexample {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        EmployeeSerialId employee = new EmployeeSerialId();
        FileInputStream fin = new FileInputStream("F://Prod/employee.obj");
        ObjectInputStream ois = new ObjectInputStream(fin);
        employee = (EmployeeSerialId) ois.readObject();
        ois.close();
        System.out.println(employee.whoIsThis());
    }
}