package LAB8;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many Employee do you have?: ");
        int num = sc.nextInt();

        ArrayList<Employee> myEmp = new ArrayList<Employee>();
        for (int i = 0; i < num; i++) {
            //input data to object
            System.out.println("Please, Enter Employee info "+(i+1)+":");
            Employee e = inputDataObject();
            myEmp.add(e);

        }

        //display data in ArrayList
        displayObject(myEmp);

    }//main

    private static void displayObject(ArrayList<Employee> myEmp) {
        System.out.println("All object in ArrayList: ");
        for (Employee e:myEmp) {
            System.out.println(e.toString());
        }
    }

    private static Employee inputDataObject() {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter id card: ");
        e.setPid(sc.nextLine());

        System.out.print("Enter name: ");
        e.setName(sc.nextLine());

        System.out.print("Enter age: ");
        e.setAge(Integer.parseInt(sc.nextLine()));

        System.out.print("Enter gender: ");
        e.setGender(sc.nextLine());

        System.out.print("Enter telephone: ");
        e.setTel(sc.nextLine());

        System.out.print("Enter employee id: ");
        e.setEmpID(sc.nextLine());

        System.out.print("Enter position: ");
        e.setPosition(sc.nextLine());

        System.out.print("Enter salary: ");
        e.setSalary(Double.parseDouble(sc.nextLine()));

        return e;
    }

}//class
