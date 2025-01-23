//Practice question oop
// java.util.Scanner;

class Employee{
    int Salary;
    public int getSalary(){
        return Salary;
    }
    String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
}

public class oop {
    public static void main(String[] args) {
        Employee Vedant = new Employee();
        Vedant.setName("Naruto");
        System.out.println(Vedant.getName());
        Vedant.Salary = 900000;


    }
}
