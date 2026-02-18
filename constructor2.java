package prac2;

public class constructor2 {
	
	  String name;
	    int age;

	   
	    constructor2() {
	        
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {
	       constructor2 s1 = new constructor2(); 
	        s1.display();
	    }
	}