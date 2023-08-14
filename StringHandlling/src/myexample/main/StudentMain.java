package myexample.main;

import java.util.Scanner;

import myexample.model.Student;

public class StudentMain 
{
	static Student stu[] = new Student[15];
	private static int newStud = 0;

	public static void addStudent() 
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student name");
		String name = sc.next();
		System.out.println("Enter student age");
		int age = sc.nextInt();

		boolean present = false;

		for (int i = 0; i < newStud; i++)
		{
			if (stu[i].getId() == id) 
			{
				present = true;
				break;
			}
		}
		if (present)
		{
			System.out.println("Student record is already present");
		} else 
		{
			stu[newStud] = new Student(id, name, age);
			newStud++;
			System.out.println("Student Record Added Successfully");
		}

	}

	public static boolean checkStudentRecord(Student s) 
	{
		for (int i = 0; i < newStud; i++) 
		{
			if (stu[i].getId() == s.getId()) 
			{
				return true;

			}
		}
		return false;
	}

	public static Student[] displayStudents()
	{
		return stu;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do
		{
			System.out.println("Menu");
			System.out.println("1.Add Student");
			System.out.println("2.Display All Students");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			
			choice = sc.nextInt();
			//sc.nextLine();
			
			switch(choice)
			{
			case 1:
				addStudent();
				break;
			case 2:
				Student s[]= displayStudents();
				for (int i = 0; i < newStud; i++) 
					System.out.println(s[i]);
					break;
			case 3:
				System.out.println("Exit");
				break;
			default:
				System.out.println("invalid choice");
			}
			}while(choice !=3);
				
		}
		
		
		}
	