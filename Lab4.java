package prac2;

import java.util.Scanner;

class Animals{
	void makeSound() {
		System.out.println("The animal makes a sound.");
	}
}
class Dog extends Animals{

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
//		super.makeSound();
		System.out.println("The Dog Barks");
	}
	
}

class Cat extends Animals{

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
//		super.makeSound();
		System.out.println("The Cat say MEow Meow");
	}	
}
public class Lab4 {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the option");
		System.out.println("1) Animal");
		System.out.println("2) Dog");
		System.out.println("3) Cat");
		
		int choice=sc.nextInt();
		Animals obj; 
        switch (choice) {
            case 1:
                obj = new Animals();
                break;
            case 2:
                obj = new Dog();
                break;
            case 3:
                obj = new Cat();
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        obj.makeSound();  
        sc.close();
    }
}
