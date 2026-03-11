package prac2;

import java.util.ArrayList;

public class Lab5anudip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(7);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(31);
		
		int sum=0;
		for(int i:al) {
			if(i%2==0) {
				
			sum+=i;;
			}
		}
		System.out.println("Sum of all arraylist "+sum);
	}

}
