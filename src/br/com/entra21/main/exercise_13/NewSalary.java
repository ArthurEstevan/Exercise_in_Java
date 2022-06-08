package br.com.entra21.main.exercise_13;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class NewSalary {

    public static void newSalary() {

        System.out.println("\nMake an algorithm that reads an employee's salary and displays their new salary, with a 15% increase.\n");

        Scanner input = new Scanner(System.in);

        HashMap<String, Double> funcionarios = new HashMap<>();

        funcionarios.put("Architect", 10000.00);
        funcionarios.put("Dev-Senior", 8000.00);
        funcionarios.put("Dev-Junior", 4000.00);
        funcionarios.put("Dev-Apprentice", 2000.00);
        funcionarios.put("Dev-Intern", 1000.00);

        System.out.println("===============Salary================");
        for (Entry<String, Double> funcionario : funcionarios.entrySet()) {
            System.out.println("Employee: " + funcionario.getKey());
            System.out.println("Salary: " + funcionario.getValue());
            System.out.println("=====================================");
        }

        System.out.println("\nArchitect received 15% raise");
        System.out.println("Dev-Senior received 10% raise");
        System.out.println("Dev-Junior received 5% raise");
        System.out.println("Dev-Apprentice received 5% raise");
        System.out.println("Dev-Intern received 0% raise\n");

        double salary[] = new double[4];

        salary[0] =10000.00 + (10000.00 * (15f/100f));
        funcionarios.put("Architect", salary[0]);

        salary[1] =8000.00 + (8000.00 * (10f/100f));
        funcionarios.put("Dev-Senior", salary[1]);

        salary[2] =4000.00 + (4000.00 * (5f/100f));
        funcionarios.put("Dev-Junior", salary[2]);

        salary[3] =2000.00 + (2000.00 * (5f/100f));
        funcionarios.put("Dev-Apprentice", salary[3]);


        System.out.println("=============New Salary==============");
        for (Entry<String, Double> funcionario : funcionarios.entrySet()) {
            System.out.println("Employee: " + funcionario.getKey());
            System.out.println("Salary: " + funcionario.getValue());
            System.out.println("=====================================");
        }


    }
}
