package org.practicaltest.question1.main;

import java.time.LocalDate;
import java.util.Scanner;

import org.practicaltest.question1.Employee;

public class Main{
	public static void main(String[] args) {
		Employee[] emp=new Employee[5];
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=emp.length;i++) {
			System.out.println("Enter employee id");
			int a = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter employee name");
			String b = sc.nextLine();
			System.out.println("Enter employee Joining date");
			String returnDate=sc.nextLine();
			
			LocalDate l0=LocalDate.parse(returnDate);
			System.out.println(l0);
			
			
		}int[] Employee=new int[5];
		for(int i=0;i<=emp.length;i++) {
			System.out.println(emp[i]);	
		}
	}
}