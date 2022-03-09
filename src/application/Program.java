package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = scan.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char choise = scan.next().charAt(0);
			
			scan.nextLine();
			
			if (choise == 'n') {
						
				System.out.print("Name: ");
				String name = scan.nextLine();
				
				System.out.println("Hours: ");
				int hour = scan.nextInt();
				
				System.out.println("Value per hour: ");
				double vph = scan.nextDouble();
				
				Employee emp = new Employee(name, hour, vph); 
				
				list.add(emp);
				
			} else {
				
					System.out.print("Name: ");
					String name = scan.nextLine();
					
					System.out.println("Hours: ");
					int hour = scan.nextInt();
					
					System.out.println("Value per hour: ");
					double vph = scan.nextDouble();
					
					System.out.println("Aditional charge: ");
					double adtCharge = scan.nextDouble();
					
					Employee emp = new OutsourcedEmployee(name, hour, vph, adtCharge); 
					
					list.add(emp);
					
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee c : list) {
			System.out.println(c.getName() + " - $ " + String.format("%.2f", c.payment()));
		}
				
		scan.close();
		
	}

}
