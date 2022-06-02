import java.io.File;
import java.util.Scanner;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("María","Design",20000, "Madrid" );
        Employee employee2 = new Employee("Yaiza","Development",30000, "Vigo" );
        Employee employee3 = new Employee("Jaime","Cibersecurity",20000, "Cádiz" );
        Employee employee4 = new Employee("Alvaro","Full Stack",22000, "Madrid" );
        Employee employee5 = new Employee("Fran","Front-end",20000, "Zafra" );
        Employee employee6 = new Employee("Iván","Psicology",19000, "Alcobendas" );
        Intern intern7 = new Intern(23000,"Vir","Advertising", 18000, "Vitoria" );
        Employee employee8 = new Employee("Jesus","Medical",23000, "Madrid" );
        Employee employee9 = new Employee("Marta","Turism",19000, "Madrid" );
        Employee employee10 = new Employee("Hugo","Back-end",25000, "Galicia" );

        System.out.println("Employee " + employee1.getName() + " works in the " + employee1.getDepartment() + " department. The salary of this position in "+ employee1.getLocation() + " is "+ employee1.getSalary() + " euros.");
        System.out.println("Employee " + employee2.getName() + " works in the " + employee2.getDepartment() + " department. The salary of this position in "+ employee2.getLocation() + " is "+ employee2.getSalary() + " euros.");
        System.out.println("Employee " + employee3.getName() + " works in the " + employee3.getDepartment() + " department. The salary of this position in "+ employee3.getLocation() + " is "+ employee3.getSalary() + " euros.");
        System.out.println("Employee " + employee4.getName() + " works in the " + employee4.getDepartment() + " department. The salary of this position in "+ employee4.getLocation() + " is "+ employee4.getSalary() + " euros.");
        System.out.println("Employee " + employee5.getName() + " works in the " + employee5.getDepartment() + " department. The salary of this position in "+ employee5.getLocation() + " is "+ employee5.getSalary() + " euros.");
        System.out.println("Employee " + employee6.getName() + " works in the " + employee6.getDepartment() + " department. The salary of this position in "+ employee6.getLocation() + " is "+ employee6.getSalary() + " euros.");
        System.out.println("Intern " + intern7.getName() + " works in the " + intern7.getDepartment() + " department. The salary of this position in "+ intern7.getLocation() + " is "+ intern7.getSalary() + " euros." + intern7.getMaxSalary());
        System.out.println("Employee " + employee8.getName() + " works in the " + employee8.getDepartment() + " department. The salary of this position in "+ employee8.getLocation() + " is "+ employee8.getSalary() + " euros.");
        System.out.println("Employee " + employee9.getName() + " works in the " + employee9.getDepartment() + " department. The salary of this position in "+ employee9.getLocation() + " is "+ employee9.getSalary() + " euros.");
        System.out.println("Employee " + employee10.getName() + " works in the " + employee10.getDepartment() + " department. The salary of this position in "+ employee10.getLocation() + " is "+ employee10.getSalary() + " euros.");

        //INTENTO 2
        //System.setOut(new PrintStream(new FileOutputStream("employees.txt")));
        System.out.println("This is test output");

        //INTENTO 1
        /*Scanner input = new Scanner(new File ("employees.txt"));
        String employees = input.nextLine();
        System.out.println(employees);*/
    }
}